package ru.itis.lab2_5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> implements Map<K,V> {

    MyEntry[] array = new MyEntry[10];



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

    //TODO
    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    //TODO
    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    //TODO
    @Override
    public V get(Object key) {
        return null;
    }

    //TODO - если добавляется значение с уже существующим ключем, то
    // старое значение для этого ключа заменяется на новое
    @Override
    public V put(K key, V value) {
        return null;
    }

    //TODO
    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    //TODO
    @Override
    public void clear() {

    }

    //TODO
    @Override
    public Set<K> keySet() {
        return null;
    }

    //TODO
    @Override
    public Collection<V> values() {
        return null;
    }

    //TODO
    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    class MyEntry<K,V> implements Entry<K,V> {
        K k;
        V v;

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }

        @Override
        public V setValue(V value) {
            V old = v;
            v = value;
            return old;
        }
    }
}
