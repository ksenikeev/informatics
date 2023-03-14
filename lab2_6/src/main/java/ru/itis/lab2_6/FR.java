package ru.itis.lab2_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FR {
    public static void main(String[] args) {
        File file = new File("contr1_ii.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = reader.lines().toList();

            for (String l : lines) {
                String[] array = l.split(";");

                System.out.println(new Client(array[0], array[1]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        };
    }

static class Client {
        String phone;
        String name;

    public Client(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    @Override
    public String toString() {
        return phone + " - " + name;
    }
}
}
