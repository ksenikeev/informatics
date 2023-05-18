package ru.itis.lab2_16;

import ru.itis.lab2_16.printer.ObjectPrinter;

public class MainPrinter {

    public static void main(String[] args) {
        ObjectPrinter printer = new ObjectPrinter();
        TestClass testClass = new TestClass(1l, "Test");

        printer.print(testClass);

    }
}
