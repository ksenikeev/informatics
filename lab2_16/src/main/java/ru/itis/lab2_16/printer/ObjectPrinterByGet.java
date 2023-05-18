package ru.itis.lab2_16.printer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ObjectPrinterByGet {

    public void print(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //System.out.println(o.getClass().getName());

        Field[] declaredFields = o.getClass().getDeclaredFields();

        System.out.println(o.getClass().getSimpleName());

        Method[] methods = o.getClass().getMethods();

        for (Field f : declaredFields) {
            String fieldName = f.getName();

            String methodName = "get"
                    + fieldName.substring(0,1).toUpperCase()
                    + fieldName.substring(1);

            System.out.print(f.getName() + "=");
            Method method = o.getClass().getMethod(methodName,null);
            if (method != null) {
                Object value = method.invoke(o);
                System.out.print(value);
                System.out.println();
            }

        }


    }
}
