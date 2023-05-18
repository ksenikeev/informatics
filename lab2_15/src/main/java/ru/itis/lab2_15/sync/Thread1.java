package ru.itis.lab2_15.sync;

public class Thread1 extends Thread {

    private SyncMethod syncMethod;

    public Thread1(SyncMethod syncMethod) {
        this.syncMethod = syncMethod;
    }

    @Override
    public void run() {
        System.out.println("thread 1 run");
        syncMethod.method1();
    }
}
