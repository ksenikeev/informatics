package ru.itis.lab2_16.printer;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ObjectPrinter {

    public void print(Object o) {
        //System.out.println(o.getClass().getName());

        Field[] declaredFields = o.getClass().getDeclaredFields();

        System.out.println(o.getClass().getSimpleName());
        Arrays.stream(declaredFields).forEach(f -> {
            f.setAccessible(true);
            try {
                System.out.println(f.getName() + "=" + f.get(o));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        );
    }
}
