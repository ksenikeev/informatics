package ru.itis.lab2_14;

public class ConsolePrinter {

    Object o = new Object();

    public void print(String data) {
        synchronized (o) {
            for (int i = 0; i < data.length(); ++i) {
                print(data.charAt(i));
            }
            System.out.println();
        }
    }

    private void print(char c) {
        System.out.print(c);
    }

}
