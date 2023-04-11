package ru.itis.lab2_12.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.itis.lab2_12.model.Category;
import ru.itis.lab2_12.model.MerchName;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MerchNameService {
    public static void saveMerchName(List<MerchName> merches) {
        Gson gson = new Gson();
        String json = gson.toJson(merches);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("merches.json")) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<MerchName> readMerchName() {
        List<MerchName> result = null;
        Gson gson = new Gson();
        try(Reader reader = new FileReader("merches.json")) {
            Type listType = new TypeToken<ArrayList<MerchName>>(){}.getType();
            result = gson.fromJson(reader, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public void inputMerchName(Scanner scanner){
        System.out.print("Введите код товара:");
        int code = scanner.nextInt();
        System.out.print("Введите код категории:");
        int category = scanner.nextInt();
        System.out.print("Введите наименование товара:");
        String name = scanner.next();
        MerchName merchName = new MerchName(code,category,name);
        List<MerchName> list = readMerchName();
        list.add(merchName);
        saveMerchName(list);

    }

}
