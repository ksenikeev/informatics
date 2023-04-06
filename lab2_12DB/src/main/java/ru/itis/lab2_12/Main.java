package ru.itis.lab2_12;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.itis.lab2_12.model.Category;
import ru.itis.lab2_12.model.MerchName;
import ru.itis.lab2_12.model.Spending;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void saveCategory(List<Category> categoryes) {
        Gson gson = new Gson();
        String json = gson.toJson(categoryes);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("categoryes.json")) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Category> readCategory() {
        List<Category> result = null;
        Gson gson = new Gson();
        try(Reader reader = new FileReader("categoryes.json")) {
            Type listType = new TypeToken<ArrayList<Category>>(){}.getType();
            result = gson.fromJson(reader, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Category> categoryes = new ArrayList<>();
        List<MerchName> merches = new ArrayList<>();
        List<Spending> spendings = new ArrayList<>();


        categoryes.add(new Category(1, "Игрушки"));
        categoryes.add(new Category(2, "Гаджеты"));
        categoryes.add(new Category(3, "Молочные Продукты"));
        categoryes.add(new Category(4, "Хлебобулочные изделия"));
        categoryes.add(new Category(5, "Мясо"));



        saveCategory(categoryes);

        categoryes = readCategory();

        categoryes.forEach(System.out::println);

    }
}
