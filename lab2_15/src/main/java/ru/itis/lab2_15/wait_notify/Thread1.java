package ru.itis.lab2_15.wait_notify;

public class Thread1 extends Thread {

    public void pause() {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void remain() {
        notify();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("thread 1 run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
