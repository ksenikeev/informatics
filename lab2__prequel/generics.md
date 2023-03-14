# Generics
## Обобщения (c Java v.5)

Высокий уровень абстракции, позволяющий реализовывать алгоритмы, оперирующие с объектами неопределенных классов.

Но у нас есть предок всех объектов - класс Object, высокого уровня абстракции можно добиться оперируя с этим классом?

Да, но тогда мы будем сталкиваться с проблемами, вызванными необходимостью явного приведения типов.

Пример: стек на массиве
```java
public class ObjectStack {
    private Object[] body = new Object[100];
    private int countOfElements = 0;
    public void push(Object o) {
        if (countOfElements < 100) {
            body[countOfElements++] = o;
        }
    }
    public Object pop() {
        if (countOfElements > 0) {
            return body[--countOfElements];
        } else {
            return null;
        }
    }
}

public class MainGeneric {
    public static void main(String[] args) {
        ObjectStack stack = new ObjectStack();
        stack.push("one");
        // Необходимо приведение типа Object -> String
        String one = (String) stack.pop();
    }
}
```

Пример: generic стек на массиве
```java
public class GenericStack<T> {
    private Object[] body = new Object[100];
    private int countOfElements = 0;
    public void push(T o) {
        if (countOfElements < 100) {
            body[countOfElements++] = o;
        }
    }
    public T pop() {
        if (countOfElements > 0) {
            return (T)body[--countOfElements];
        } else {
            return null;
        }
    }
}

/** Теперь программа стала чуть симптичнее */
public class MainGeneric {
    public static void main(String[] args) {
        GenericStack<String> genericStack = new GenericStack<>();
        genericStack.push("two");
        String two = genericStack.pop();
    }
}

```

Generics - технология не избавляет от приведения типов, но она позволяет перевести его на уровень компилятора, 
или на уровень определения обобщенного класса (можно было бы сказать "абстрактного", но этот термин уже занят:).
Таким образом эта технология справедливо относится к "Синтаксическому сахару".

Generic (обобщение) можно определить не только на всем классе, но и на методе:

```java
public class MainMethodGeneric {
    public static void main(String[] args) {
        log(1);
        log("one");
        log(new Date());
    }

    public static <T> void log(T o) {
        System.out.println(new Date() + " " + o);
    }
}
```
Пример с методом, возвращающим какое-то значение
```java
public class MainMethodGeneric {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        GenericStack<String> stack = newInstance(GenericStack.class);
        stack.push("one");
        System.out.println(stack.getClass());
    }

    public static <T> T newInstance(Class<T> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return clazz.getDeclaredConstructor().newInstance();
    }
}

```


Чтобы понять мнемонику PECS (provider - extends, consumer - super), рассмотрим в качестве конкретного примера статический метод из стандартного класса Collections:

public static <T> void copy(List<? super T> dest, List<? extends T> src)
Этот метод копирует список типа Т в другой список. Он использует сразу оба вида ограничений: сверху для целевого списка и снизу для источника.

Начнем с источника. Источником могут быть любые дочерние от T типы. Это логично, нас не интересует, что именно мы перекладываем, нужно, чтобы оно хотя бы сводилось к T. src является для нас поставщиком (producer) объектов, и его тип мы позволяем расширять (extends). Это первые 2 буквы из мнемоники PECS.

Теперь перейдем к целевому списку. В дальнейшем этим списком кто-то будет пользоваться и, возможно, как-то его обрабатывать, и это накладывает определенные ограничения. Проще посмотреть это на примере.

Предположим, что у нас есть класс Питомцев (являющийся подклассом Животных) и дочерние классы Собачонок и Котиков:

class Animal { void feed() {} }
class Pet extends Animal { void call() {} }
class Kitty extends Pet{ void mew() {} }
class Doge extends Pet{ void bark() {} }
Теперь мы хотим скопировать из списка Питомцев в список Питомцев и позвать их.

List<Pet> src = ...;
List<Pet> dest = new ArrayList<Pet>();    
Collections.copy(dest, src);
for(Pet p: dest) p.call();
Пока все ок. А что если бы в src были явно Котики (унаследованные от Питомцев)?

List<Kitty> src = ...;
List<Pet> dest = new ArrayList<Pet>();    
Collections.copy(dest, src);
for(Pet p: dest) p.call();
Без проблем, Котики откликаются на зов. При копировании в dest мы "потеряем" знание о том, что это были именно Котики, но по крайней мере они остаются Питомцами и их все еще можно позвать.

Достаточно очевидно, что мы не можем скопировать Котиков в коллекцию Собачонок и заставить их всех лаять:

List<Kitty> src = ...;
List<Doge> dest = new ArrayList<Doge>();    
Collections.copy(dest, src);
for(Doge doge: dest) doge.bark();
Очевидный нонсенс, Котиков нельзя просто грубо назвать Собачонками, система типов не позволит так сделать, поэтому мы не смогли бы расширить тип первого параметра в сигнатуре метода copy:

public static <T> void copy(List<? extends T> dest, List<? extends T> src); // так нельзя копировать!
Но что же насчет super? Пусть наш код продолжит копировать Питомцев, а где-то в другом место другой код кормит любых Животных, и не только домашних.

List<Animal> dest = new ArrayList<Animal>();   
.....
List<Kitty> src = ...;
Collections.<Pet>copy(dest, src);
....
for(Animal a: dest) a.feed();
Все Животные накормлены. Заметим, что целевой список является коллекцией Животных, являющихся родительским классом для Питомцев. Общая концепция такова, что код, который использует в дальнейшем список dest, не может в своих предположениях о его элементах опускаться ниже типа T, но может сколь угодно абстрагироваться к родительским типам. Список dest является потребителем (consumer), т.к. мы наполняем его и знаем, только, что его элементы совместимы с T, а значит сами являются T или лежат выше по иерархии (super). Это последние две буквы в мнемонике PECS.

