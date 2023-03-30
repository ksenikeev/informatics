package ru.itis.lab2_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intLst = new ArrayList<>();
        intLst.add(1);
        intLst.add(5);
        intLst.add(2);
        intLst.add(4);
        intLst.add(7);

        System.out.println(intLst);

        Collections.sort(intLst);

        System.out.println(intLst);


        System.out.println("aaxe".compareTo("aade"));
    }

}
