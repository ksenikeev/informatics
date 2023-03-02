package ru.itis.lab15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IMapT<String, Integer> map = new MapTImp<>();

        map.put("случилось",2);
        map.put("птица",6);
        map.put("балах",3);

        String[] words = map.getAllKeys();

        Integer count = 0;
        for(Object word : words) {
            Integer n = map.getValueByKey((String)word);
            count += n;
        }

        System.out.println(count);
    }
}
