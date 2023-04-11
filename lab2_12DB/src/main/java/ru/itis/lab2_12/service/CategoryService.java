package ru.itis.lab2_12.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.itis.lab2_12.model.Category;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryService {
    public void saveCategory(List<Category> categoryes) {
        Gson gson = new Gson();
        String json = gson.toJson(categoryes);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("categoryes.json")) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Category> readCategory() {
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
    public void inputCategory(Scanner scanner){
        System.out.print("Введите код категории:");
        int code = scanner.nextInt();
        System.out.print("Введите наименование категории:");
        String name = scanner.next();
        Category category = new Category(code, name);
        List<Category> lsd = readCategory();
        lsd.add(category);
        saveCategory(lsd);
    }

}
