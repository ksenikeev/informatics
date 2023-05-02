package ru.itis.lab2_15;

public class ProectJob implements Runnable {

    @Override
    public void run() {
        System.out.println("Start изготовление проекта");
        try {
            Thread.sleep(1000 * 7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End изготовление проекта");
    }
}
