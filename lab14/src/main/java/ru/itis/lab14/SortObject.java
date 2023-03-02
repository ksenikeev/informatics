package ru.itis.lab14;

public class SortObject {

    public static IComparable[] sort(IComparable[] persons) {
        for(int i = 0; i < persons.length - 1; ++i) {
            for (int j = 0; j < persons.length - i - 1; ++j) {
                if (persons[j].compare(persons[j+1]) > 0) {
                    IComparable tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }

        return persons;
    }

    public static void print(Person[] persons) {
        for( Person p : persons) {
            System.out.println(p.getHeight());
        }
    }
}
