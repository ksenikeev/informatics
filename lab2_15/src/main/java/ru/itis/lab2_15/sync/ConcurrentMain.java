package ru.itis.lab2_15.sync;

public class ConcurrentMain {
    public static void main(String[] args) throws InterruptedException {
        SyncMethod syncMethod = new SyncMethod();
        Thread1 thread1 = new Thread1(syncMethod);
        Thread2 thread2 = new Thread2(syncMethod);

        thread1.start();
        Thread.sleep(2000);
        thread2.start();
    }
}
