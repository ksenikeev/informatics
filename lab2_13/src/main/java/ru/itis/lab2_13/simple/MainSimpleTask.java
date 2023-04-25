package ru.itis.lab2_13.simple;

public class MainSimpleTask {
    public static void main(String[] args) {
        System.out.println("Главный поток " + Thread.currentThread().threadId());
        SimpleTask simpleTask = new SimpleTask();

        /* Следующий вызов будет работать не в отдельном потоке,
         *  а в основном
         */
        simpleTask.run();

        Thread thread1 = new Thread(simpleTask);
        Thread thread2 = new Thread(simpleTask);
        Thread thread3 = new Thread(simpleTask);
        Thread thread4 = new Thread(simpleTask);
        /* Здесь задача будет запущена в отдельном потоке */
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        System.out.println("end main");
    }
}
