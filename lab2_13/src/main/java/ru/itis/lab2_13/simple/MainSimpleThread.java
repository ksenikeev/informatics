package ru.itis.lab2_13.simple;

public class MainSimpleThread {
    public static void main(String[] args) {
        SimpleThread simpleThread1 = new SimpleThread();
        SimpleThread simpleThread2 = new SimpleThread();
        SimpleThread simpleThread3 = new SimpleThread();
        SimpleThread simpleThread4 = new SimpleThread();

        simpleThread1.start();
        simpleThread2.start();
        simpleThread3.start();
        simpleThread4.start();
    }
}
