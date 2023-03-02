package ru.itis.lab2_4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


/**
 * 1. Реализовать отмеченные методы
 * 2. Протестировать на классе в котором переопределен метод equals
 */
public class MySet<E> implements Set<E> {

    // TODO
    @Override
    public int size() {
        return 0;
    }

    // TODO
    @Override
    public boolean isEmpty() {
        return false;
    }

    // TODO
    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    // TODO
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    // TODO - ! проверка на наличие (добавляем только новый объект)
    @Override
    public boolean add(E e) {
        return false;
    }

    // TODO (реализовать поиск объекта и, если нашли удалить его)
    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    // TODO
    @Override
    public void clear() {

    }
}
