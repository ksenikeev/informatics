package ru.itis.lab2_1;

public class WrapperMain {

    public static void main(String[] args) {
        Integer i1 = 0;
        Integer i2 = Integer.valueOf(50);// new Integer(50);
        Integer i3 = Integer.parseInt("102345");

        int i4 = i2 * i3;

        System.out.println(i4);

    }
}
