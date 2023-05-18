package ru.itis.lab2_15;

public class WindowsJob implements Runnable {

    private Thread proectThread;

    public WindowsJob(Thread proectThread) {
        this.proectThread = proectThread;
    }

    @Override
    public void run() {
        try {
            proectThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Start изготовление окон");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End изготовление окон");
    }
}
