package ru.itis.lab2_7.builder;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .pizzaSize(PizzaSize.Grande)
                .parts(6)
                .addFormaggio(Formaggio.Mozzarella)
                .pomodori(true)
                .funghi(true)
                .addFormaggio(Formaggio.Cheder)
                .build();


        System.out.println(pizza);
    }
}
