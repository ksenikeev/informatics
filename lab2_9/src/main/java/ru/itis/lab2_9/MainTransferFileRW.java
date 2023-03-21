package ru.itis.lab2_9;

import java.io.*;

/**
 Копирование файла (transfer) с помощью потоков ввода-вывода
 9082014
 */
public class MainTransferFileRW {
    public static void main(String[] args) {
        long t = System.nanoTime();
        try {
            InputStream is = new FileInputStream("Input_Output_Stream.md");
            OutputStream os = new FileOutputStream("temp");

            is.transferTo(os);

            is.close();
            os.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.nanoTime() - t);
    }
}
