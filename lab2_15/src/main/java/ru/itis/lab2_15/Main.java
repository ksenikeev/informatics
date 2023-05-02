package ru.itis.lab2_15;

public class Main {

    public static void main(String[] args) {
        Thread projectThread = new Thread(new ProectJob());
        Thread windowsThread = new Thread(new WindowsJob(projectThread));

        projectThread.start();
        windowsThread.start();
    }

}
