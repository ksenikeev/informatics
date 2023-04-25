package ru.itis.lab2_13.simple;
// Минимальная конструкция для работы в отдельном потоке
public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("SimpleThread " + Thread.currentThread().threadId());
    }

}
