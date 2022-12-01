package ru.itis.lab13;

public class StackImplList implements IStack {

    private Node root;

    @Override
    public Object pop() {
        Node lastElement = root;
        Node prevelement = null;
        while (lastElement.next != null) {
            prevelement = lastElement;
            lastElement = lastElement.next;
        }
        if (prevelement != null) {
            prevelement.next = null;
        }
        return lastElement.object;
    }

    @Override
    public void push(Object o) {
        Node element = new Node(o);
        if (root == null) {
            root = element;
        } else {
            Node lastElement = root;
            while (lastElement.next != null) {
                lastElement = lastElement.next;
            }
            lastElement.next = element;
        }
    }

    class Node {
        private Object object;
        private Node next;
        Node(Object o) {
            object = o;
        }
    }
}
