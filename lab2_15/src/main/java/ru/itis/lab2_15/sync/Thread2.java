package ru.itis.lab2_15.sync;

public class Thread2 extends Thread {

    private SyncMethod syncMethod;

    public Thread2(SyncMethod syncMethod) {
        this.syncMethod = syncMethod;
    }

    @Override
    public void run() {
        System.out.println("thread 2 run");
        syncMethod.method2();
    }
}
