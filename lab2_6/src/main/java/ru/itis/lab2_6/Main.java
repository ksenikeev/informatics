package ru.itis.lab2_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String ... a) {

        HashSet<Entry> set = new HashSet<>();

        set.add(new Entry(1l));
        set.add(new Entry(2l));
        set.add(new Entry(3l));
        set.add(new Entry(4l));
        set.add(new Entry(1l));

        System.out.println(set.size());

        Iterator<Entry> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getId());
        }
    }
}
