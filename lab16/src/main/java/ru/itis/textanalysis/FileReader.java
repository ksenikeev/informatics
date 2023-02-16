package ru.itis.textanalysis;

import ru.itis.textanalysis.map.MapImp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {
    public static void main(String[] args) throws IOException {

        System.out.println((int)'а');

        String txt = read("pushkin.txt");

/*
        String[] allWords = txt.split(" ");

        for(int i = 0; i < 100; ++i) {
            System.out.println(allWords[i]);
        }
*/

        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]{3,}");
        Matcher matcher = pattern.matcher(txt);

        MapImp map = new MapImp();

        int i = 0;
        int k = 0;
        while (matcher.find()) {

            int start=matcher.start();
            int end=matcher.end();

            //System.out.println(txt.substring(start,end));
            int v = 1;
            Integer value = map.getValueByKey(txt.substring(start,end));
            System.out.println(txt.substring(start,end));
            if (value != null) {
                v = value + 1;
                k++;
            }
            map.put(txt.substring(start,end), v);

            i++;
        }

        System.out.println(k);
        System.out.println(i);

        MapImp.Entry[] words = map.get100max();

        for(int n = 0; n < 100; ++n) {
            System.out.println(words[n].key + " - " + words[n].value);
        }
    }

    public static String read(String fileName) {
        String str = null;
        try {
            str = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
