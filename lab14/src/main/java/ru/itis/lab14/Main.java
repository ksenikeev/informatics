package ru.itis.lab14;

public class Main {

    public static void main(String[] args) {
        Person male = new Person("Иван", "2000-02-05", 185);
        Person female = new Person("Дарья", "2000-03-12", 170);
        Person male2 = new Person("Макс", "2000-02-01", 180);

        Person[] persons = new Person[3];
        persons[0] = male;
        persons[1] = female;
        persons[2] = male2;

        SortObject.print(persons);

        SortObject.sort(persons);

        SortObject.print(persons);

   }
}
