package ru.itis.lab2_7.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("hello.html");

            int b;
            while ((b = inputStream.read()) != -1) {
                System.out.print((char)b);
            }

            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
