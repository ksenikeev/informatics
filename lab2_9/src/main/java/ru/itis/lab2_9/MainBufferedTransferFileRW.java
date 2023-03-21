package ru.itis.lab2_9;

import java.io.*;

/**
 Буферизованное копирование файла (transfer) с помощью потоков ввода-вывода
 754446
 */
public class MainBufferedTransferFileRW {
    public static void main(String[] args) {
        long t = System.nanoTime();
        try {
            BufferedInputStream is =
                    new BufferedInputStream(
                            new FileInputStream("Input_Output_Stream.md")
                    );
            BufferedOutputStream os =
                    new BufferedOutputStream(
                        new FileOutputStream("temp")
                    );

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
