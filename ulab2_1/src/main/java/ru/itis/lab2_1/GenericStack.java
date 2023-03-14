package ru.itis.lab2_1;

public class GenericStack<T> {
    private Object[] body = new Object[100];
    private int countOfElements = 0;

    public void push(T t) {
        if (countOfElements < 100) {
            body[countOfElements++] = t;
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