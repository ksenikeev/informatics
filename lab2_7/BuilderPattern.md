# BuilderPattern

1. Внутри класса создаем вложенный класс строитель
    ```
   public static PizzaBuilder { ...}
   ```    
   
2. Копируем значимые поля в класс строитель
3. Делаем методы внутри строителя, возвращающие ссылку на него
4. Добавляем финализирующий метод, создающий экземпляр основного класса,
    и возвращающий ссылку на него