package ru.itis.informatics.lab2_prequel._1_immutable;

import java.util.ArrayList;
import java.util.function.Supplier;

public class EraseType {
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();

        ArrayList<String> a = new ArrayList<>();
        addElement(a, new Supplier<String>() {
            @Override
            public String get() {
                return new String();
            }
        });

        System.out.println(a.getClass() == b.getClass());

        Integer x = Integer.valueOf(0);
        Integer y = Integer.valueOf(5);

        y = x;
        System.out.println(y);
        x = x + 1;
        System.out.println(y);
    }

    public static <T> void addElement(ArrayList<T> lst, Supplier<T> factory) {
        lst.add(factory.get());
    }

    class TestMethodOverloading {
        public <T extends EraseType> void methodOne(T t) {
            // ...
        }
        public void methodOne(Object o) {
            // ...
        }
    }
}
