package ru.itis.lab2_9;

import java.io.*;

/**
 Копирование файла (плохое) с помощью потоков ввода-вывода
 10812889
 */
public class MainFileRW {
    public static void main(String[] args) {
        long t = System.nanoTime();
        try {
            InputStream is = new FileInputStream("Input_Output_Stream.md");
            OutputStream os = new FileOutputStream("temp");
            int b;
            // считываем побайтно, пока не достигнем конца потока
            while ((b = is.read()) != -1) {
                //System.out.print((char)b);
                os.write(b);
            }

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
