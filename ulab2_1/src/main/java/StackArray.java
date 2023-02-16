public class StackArray<I extends StackArray.Person> {
    private int size;
    private StackArray.Person[] array;
    private int top;// индекс последнего элемента

    public String peekName() {
        return array[top].getName();
    }

    public StackArray(int size){
        this.size = size;
        this.array = new StackArray.Person[size];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }

    public void push(I a){
        int i = ++top;
        array[i] = a;
        System.out.println(a);
    }

    public I pop(){
        if (isEmpty()){
            System.out.println("стек пустой");
            return null;
        }
        else {
            Object v = array[top];
            array[top--] = null;

            return (I) v;// возвращаем элемент топ-1
        }
    }

    public I peek(){
        if (isEmpty()){
            System.out.println("стек пустой");
            return null;
        }
        else{
            //System.out.println(top);
            return (I) array[top];
        }
    }

    public static void main(String[] args) {

        StackArray<Teacher> stack = new StackArray<>(4);

        System.out.println(stack.isEmpty());

        stack.push(new Teacher("t1", "gr1"));
        stack.push(new Teacher("t2", "gr1"));
        stack.push(new Teacher("t3", "gr1"));
        stack.push(new Teacher("t4", "gr1"));


        System.out.println(stack.isEmpty());

        System.out.println(stack.peekName());

        stack.pop();

        System.out.println(stack.peek());

    }


    public static class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Student extends Person {
        private String group;

        public Student(String name, String group) {
            super(name);
            this.group = group;
        }

        public String getGroup() {
            return group;
        }
    }

    public static class Teacher extends Person {
        private String cathedra;

        public Teacher(String name, String cathedra) {
            super(name);
            this.cathedra = cathedra;
        }

        public String getGroup() {
            return cathedra;
        }
    }

}