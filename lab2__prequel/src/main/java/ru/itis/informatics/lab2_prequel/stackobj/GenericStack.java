package ru.itis.informatics.lab2_prequel.stackobj;

public class GenericStack<T> {
    private T[] body;
    private T top;
    private int countOfElements = 0;

    public GenericStack() {
        body = (T[]) new Object[100];
    }

    public void push(T o) {
        if (countOfElements < 100) {
            body[countOfElements++] = o;
        }
    }
    public T pop() {
        if (countOfElements > 0) {
            return body[--countOfElements];
        } else {
            return null;
        }
    }
}
