package ru.itis.lab13;

/**
 * Реализация стека с внутренней структурой хранения данных - связный список
 *
 * Каждый элемент списка хранит элемент стека, и ссылку на следующий элемент
 *
 * TODO поменять связный список - попробовать хранить не корень, а последний элемент,
 * и ссылку держать не на следующий, а на предыдущий
 */

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
