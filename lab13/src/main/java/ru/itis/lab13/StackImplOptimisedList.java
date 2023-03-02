package ru.itis.lab13;

/**
 * Реализация стека с внутренней структурой хранения данных - связный список
 *
 * Каждый элемент списка хранит элемент стека, и ссылку на предыдущий элемент
 *
 */

public class StackImplOptimisedList implements IStack {

    private Node last;

    @Override
    public Object pop() {
        Node tmp = last;
        if (last != null) {
            last = last.prev;
            return tmp.object;
        }
        return null;
    }

    @Override
    public void push(Object o) {
        Node element = new Node(o);
        element.prev = last;

        last = element;
    }

    class Node {
        private Object object;
        private Node prev;
        Node(Object o) {
            object = o;
        }
    }
}
