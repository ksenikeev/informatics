package ru.itis.informatics.lab2_3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {

    //TODO
    @Override
    public int size() {
        return 0;
    }

    //TODO
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    //TODO
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    //TODO
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    //TODO
    @Override
    public boolean add(E e) {
        return false;
    }

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
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    //TODO
    @Override
    public void clear() {

    }

    //TODO
    @Override
    public E get(int index) {
        return null;
    }

    //TODO
    @Override
    public E set(int index, E element) {
        return null;
    }

    //TODO
    @Override
    public void add(int index, E element) {
        if (element == null) {
            throw new NullPointerException();
        }
    }

    //TODO
    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    //TODO
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
