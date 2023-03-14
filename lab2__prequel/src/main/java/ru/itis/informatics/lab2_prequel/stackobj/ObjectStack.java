package ru.itis.informatics.lab2_prequel.stackobj;

public class ObjectStack {
    private Object[] body = new Object[100];
    private int countOfElements = 0;
    public void push(Object o) {
        if (countOfElements < 100) {
            body[countOfElements++] = o;
        }
    }
    public Object pop() {
        if (countOfElements > 0) {
            return body[--countOfElements];
        } else {
            return null;
        }
    }
}
