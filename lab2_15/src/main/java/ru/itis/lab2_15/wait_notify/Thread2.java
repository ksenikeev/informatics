package ru.itis.lab2_15.wait_notify;

public class Thread2 extends Thread {

    Thread1 innerThread;

    public Thread2(Thread1 innerThread) {
        this.innerThread = innerThread;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            n++;
            System.out.println("thread 2 run");

            if (n == 5) {
                    innerThread.pause();
            }

            if (n == 10)
                innerThread.remain();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
