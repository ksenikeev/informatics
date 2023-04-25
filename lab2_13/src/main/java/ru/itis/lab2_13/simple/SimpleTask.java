package ru.itis.lab2_13.simple;

/**
 * Класс - задача для запуска в отдельном потоке
 */
public class SimpleTask implements Runnable {

    @Override
    public void run() {
        System.out.println("SimpleTask " + Thread.currentThread().threadId());
    }
}
