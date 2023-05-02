package ru.itis.lab2_14;

public class Main {
    public static void main(String[] args) {

        ConsolePrinter printer = new ConsolePrinter();

        PrintTask printTaskPushkin =
                new PrintTask("Мой дядя самых честных правил, когда не в шутку занемог...", printer);

        PrintTask printTaskLermontov =
                new PrintTask("Скажи-ка, дядя, ведь не даром, Москва, спаленная пожаром французу отдана ...", printer);

        new Thread(printTaskPushkin).start();
        new Thread(printTaskLermontov).start();
    }
}
