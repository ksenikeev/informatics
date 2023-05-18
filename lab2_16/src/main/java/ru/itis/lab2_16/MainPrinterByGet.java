package ru.itis.lab2_16;

import ru.itis.lab2_16.printer.ObjectPrinter;
import ru.itis.lab2_16.printer.ObjectPrinterByGet;
import ru.itis.lab2_16.printer.ObjectPrinterDefaultValue;

import java.lang.reflect.InvocationTargetException;

public class MainPrinterByGet {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //ObjectPrinterByGet printer = new ObjectPrinterByGet();
        ObjectPrinterDefaultValue printer = new ObjectPrinterDefaultValue();
        TestClass testClass = new TestClass(1l, "Test");

        printer.print(testClass);

    }
}
