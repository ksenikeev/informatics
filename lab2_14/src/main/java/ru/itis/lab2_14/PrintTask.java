package ru.itis.lab2_14;

public class PrintTask implements Runnable {

    private String data;
    private ConsolePrinter printer;

    public PrintTask(String data, ConsolePrinter printer) {
        this.data = data;
        this.printer = printer;
    }

    @Override
    public void run() {
        // ...
        printer.print(data);
    }


}
