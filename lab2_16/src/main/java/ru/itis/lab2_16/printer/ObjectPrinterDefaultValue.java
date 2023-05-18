package ru.itis.lab2_16.printer;

import ru.itis.lab2_16.annotations.DefaultValue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectPrinterDefaultValue {

    public void print(Object o) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //System.out.println(o.getClass().getName());

        Field[] declaredFields = o.getClass().getDeclaredFields();

        System.out.println(o.getClass().getSimpleName());

        Method[] methods = o.getClass().getMethods();

        for (Field f : declaredFields) {
            boolean isDefaultValue = false;
            String fieldName = f.getName();

            System.out.print(f.getName() + "=");

            Annotation[] annotations = f.getAnnotations();

            for (Annotation a : annotations) {
                if (a.annotationType().equals(DefaultValue.class)) {
                    isDefaultValue = true;
                    Method[] annotationMethods = a.annotationType().getDeclaredMethods();
                    for(Method m : annotationMethods) {
                        if (m.getName().equals("value")) {
                            System.out.print(m.invoke(a));
                        }
                    }
                }
            }

            if (!isDefaultValue) {

                String methodName = "get"
                        + fieldName.substring(0, 1).toUpperCase()
                        + fieldName.substring(1);

                Method method = o.getClass().getMethod(methodName, null);
                if (method != null) {
                    Object value = method.invoke(o);
                    System.out.print(value);
                }
            }
            System.out.println();

        }


    }
}
