package ru.itis.informatics.lab2_prequel;

import ru.itis.informatics.lab2_prequel.stackobj.GenericStack;

import java.lang.reflect.InvocationTargetException;

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
