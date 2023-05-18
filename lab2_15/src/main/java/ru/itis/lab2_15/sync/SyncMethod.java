package ru.itis.lab2_15.sync;

public class SyncMethod {

    private int a = 0;

    public void method1() {
        synchronized (this) {
            try {
                Thread.sleep(5000);
                System.out.println("method1 ");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println("method2 ");
        }
    }
}
