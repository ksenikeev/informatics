package ru.itis.lab2_9;

import java.io.*;

/**
 * Прочитать файл в массив байт
 */
public class MainTransferFileToArray {
    public static void main(String[] args) {
        long t = System.nanoTime();
        try {
            // Объявляем входной поток для чтения
            InputStream is = new FileInputStream("Input_Output_Stream.md");
            // Объявляем выходной поток для записи
            ByteArrayOutputStream os = new ByteArrayOutputStream();

            // Перекидываем данные из входа на выход
            is.transferTo(os);

            // конвертируем выходной поток в массив
            byte[] b = os.toByteArray();

            // зная, что массив хранит в себе текст, конвертируем в строку
            String str = new String(b);

            System.out.print(str);

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
