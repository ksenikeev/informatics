package ru.itis.lab2_15.wait_notify;

public class WaitMain {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2(thread1);

        thread1.start();
        thread2.start();

    }
}
