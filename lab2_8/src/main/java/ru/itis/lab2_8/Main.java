package ru.itis.lab2_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Row> rows = new ArrayList<>();

        // Мой личный выбор
        Row i = Row.builder()
                .name("")
                //.music(data[1])
                //.drink(data[2])
                .mushroom((byte) 0)
                .tomatoes((byte) 1)
                .ketchup((byte) 1)
                .olives((byte) 0)
                .mozzarella((byte) 1)
                .cheddar((byte) 0)
                .parmesan((byte) 1)
                .gauda((byte) 1)
                .russian((byte) 0)
                .chili((byte) 1)
                .size(PizzaSize.getBySize((byte) 25))
                .closed((byte) 1)
                .chicken((byte) 1)
                .sausage((byte) 1)
                .pineapple((byte) 0)
                .build();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("question.csv"));

            while (reader.ready()) {
                String str = reader.readLine();

                String[] data = str.split(",");

                Row row = Row.builder()
                                .name(data[0])
                                //.music(data[1])
                        //.drink(data[2])
                        .mushroom(Byte.parseByte(data[3]))
                        .tomatoes(Byte.parseByte(data[4]))
                        .ketchup(Byte.parseByte(data[5]))
                        .olives(Byte.parseByte(data[6]))
                        .mozzarella(Byte.parseByte(data[7]))
                        .cheddar(Byte.parseByte(data[8]))
                        .parmesan(Byte.parseByte(data[9]))
                        .gauda(Byte.parseByte(data[10]))
                        .russian(Byte.parseByte(data[11]))
                        .chili(Byte.parseByte(data[12]))
                        .size(PizzaSize.getBySize(Byte.parseByte(data[13])))
                        .closed(Byte.parseByte(data[14]))
                        .chicken(Byte.parseByte(data[15]))
                        .sausage(Byte.parseByte(data[16]))
                        .pineapple(Byte.parseByte(data[17]))
                        .build();

                rows.add(row);
                System.out.println(str);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
