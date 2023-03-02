import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection<T> implements Collection<T> {

    private Object[] data = new Object[100];

    private int countData = 0;

    //TODO
    @Override
    public int size() {
        return countData;
    }

    //TODO
    @Override
    public boolean isEmpty() {
        return (countData == 0);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    private class TestIterator<T> implements Iterator<T> {

        int cursor = -1;

        @Override
        public boolean hasNext() {
            return cursor + 1 < countData;
        }

        @Override
        public T next() {
            return (T)data[++cursor];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int cursor = -1;

            @Override
            public boolean hasNext() {
                return cursor + 1 < countData;
            }

            @Override
            public T next() {
                return (T)data[++cursor];
            }

        };
    }

    //TODO
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, countData);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    //TODO
    @Override
    public boolean add(T t) {
        if (countData < 100) {
            data[countData++] = t;
            return true;
        }

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
    public boolean addAll(Collection<? extends T> c) {
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
        countData = 0;
    }
}
