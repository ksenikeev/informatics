package ru.itis.lab2_9;

import java.io.*;

/**
 Копирование файла (получше) с помощью потоков ввода-вывода
 10176257
 */
public class MainArrayFileRW {
    public static void main(String[] args) {
        long t = System.nanoTime();
        try {
            InputStream is = new FileInputStream("Input_Output_Stream.md");
            OutputStream os = new FileOutputStream("temp");
            byte[] buffer = new byte[2048];
            int r;
            // считываем побайтно, пока не достигнем конца потока
            while ((r = is.read(buffer)) != -1) {
                // пишем в выходной поток ровно столько, сколь удалось прочитать
                os.write(buffer, 0, r);
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
