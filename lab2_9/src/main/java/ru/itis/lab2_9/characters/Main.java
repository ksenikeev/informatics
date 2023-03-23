package ru.itis.lab2_9.characters;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            encode("Input_Output_Stream.md",
                    "Input_Output_Stream_cp1251.md",
                    "UTF8", "cp1251");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        Параметры:

        in - имя входного файла
        out - имя выходного файла
        fromCP - название кодировки входного файла
        toCP - название кодировки выходного файла
     */
    public static void encode(String in, String out, String fromCP, String toCP)
            throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(in), fromCP));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), toCP))) {

            reader.transferTo(writer);

            writer.flush();



        }
    }
}
