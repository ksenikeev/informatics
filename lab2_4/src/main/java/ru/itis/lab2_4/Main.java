package ru.itis.lab2_4;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Еникеев","Камиль");
        Person p2 = p1;
        Object p3 = new Object();
        Person p4 = new Person("ЕНИКЕЕВ", "КАМИЛЬ");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));

        Map map;
    }
}
