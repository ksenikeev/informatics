package ru.itis.lab2_11;

import java.util.Collection;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();

        collection.add(10);
        collection.add(20);
        collection.add(11);
        collection.add(1);
        collection.add(13);
        collection.add(3);
        collection.add(31);

        // 1. Перебор элементов
        collection.forEach(x -> System.out.print(x +","));
        System.out.println();
        // 2. Работа с коллекцией как со стримом
        collection.stream();

        // 3. Сортировка
        collection.stream().sorted().forEach(x -> System.out.print(x+","));
        System.out.println();

        final int a = 15;
        // 4. Фильтрация filter(x -> (x > a)) - отбираем все, что больше 15
        collection.stream().filter(x -> {
            if (x > a) return true;
            else return false;
        }).forEach(x -> System.out.print(x+","));

    }

}
