package ru.itis.lab15;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MapTImp<K, V> implements IMapT<K, V> {

    int countEntryes = 0;
    private Entry<K,V>[] entries = new Entry[10];

    public void put(K key, V value) {

        if (key != null && value != null) {
            // Проверяем уникальность key
            for (int i = 0; i < countEntryes; ++i) {
                if (entries[i].key.equals(key)) {
                    entries[i].value = value;
                    return;
                }
            }
            Entry entry = new Entry(key, value);
            // если кончилось место куда класть
            if (countEntryes >= entries.length) {
                Entry[] temp = new Entry[countEntryes * 2];
                System.arraycopy(entries,0, temp, 0, entries.length);
                entries = temp;
            }
            entries[countEntryes++] = entry;
        }
    }

    public V getValueByKey(K key) {
        for (Entry<K,V> entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public<K>  K[] getKeysByValue(V value) {
        int count = 0;
        for (int i = 0; i < countEntryes; ++i) {
            if (entries[i].value.equals(value)) {
                ++count;
            }
        }

        if (count > 0) {
            Object[] result = new Object[count];
            int k = 0;
            for (int i = 0; i < countEntryes; ++i) {
                if (entries[i].value.equals(value)) {
                    result[k++] = (K)entries[i].key;
                }
            }
            return (K[]) result;
        }
        return null;
    }

    public void removeByKey(K key) {
        int i = -1;
        for(int n = 0; n < countEntryes; ++n) {
            if (entries[n].key.equals(key)) {
                i = n;
                break;
            }
        }

        if (i >= 0) {
            if (i == countEntryes - 1) {
                entries[i] = null;
            } else {
                entries[i] = entries[countEntryes - 1];
            }
            countEntryes--;
        }
    }

    public void removeByValue(V value) {
        int i = -1;
        for(int n = 0; n < countEntryes; ) {
            if (entries[n].value.equals(value)) {
                i = n;
                if (i == countEntryes - 1) {
                    entries[i] = null;
                } else {
                    entries[i] = entries[countEntryes - 1];
                    entries[countEntryes - 1] = null;
                }
                countEntryes--;
            } else {
                ++n;
            }
        }
    }

    public<K>  K[] getAllKeys() {

        Object[] result = new Object[countEntryes];
        for (int i = 0; i < countEntryes; ++i) {
            result[i] = (K)entries[i].key;
        }
        return (K[]) result;
    }

    public void print() {
        for(Entry<K,V> entry : entries) {
            if (entry == null) System.out.print("{null}, ");
            else
                System.out.printf("{%s : %s},", entry.key, entry.value);
        }
        System.out.println();
    }

    private class Entry<K,V> {
        K key;
        V value;

        Entry(K a1, V a2) {
            key = a1;
            value = a2;
        }
    }
}
