package ru.itis.lab2_12.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.itis.lab2_12.model.Category;
import ru.itis.lab2_12.model.Spending;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SpendingService {

    public static void saveSpending(List<Spending> spendings) {
        Gson gson = new Gson();
        String json = gson.toJson(spendings);
        System.out.println(json);
        try(FileWriter writer = new FileWriter("spendings.json")) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Spending> readSpending() {
        List<Spending> result = null;
        Gson gson = new Gson();
        try(Reader reader = new FileReader("spendings.json")) {
            Type listType = new TypeToken<ArrayList<Spending>>(){}.getType();
            result = gson.fromJson(reader, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public void inputSpending(Scanner scanner){
        System.out.print("Введите код товара:");
        int code = scanner.nextInt();
        System.out.print("Введите цену товара:");
        Float price = scanner.nextFloat();
        Spending spending =
                new Spending(new Date(), price, code);
        List<Spending> list = readSpending();
        list.add(spending);
        saveSpending(list);
    }

    public void getAllSpendingToDay() {
        List<Spending> result;
        LocalDate localDate = LocalDate.now();

        readSpending().stream().filter(spending -> {
            LocalDate spendingDate =
            LocalDate.ofInstant(spending.getDate().toInstant(), ZoneId.systemDefault());
            return spendingDate.equals(localDate);
        } ).forEach(System.out::println);
    }
    public void getAllSpendingsByCategory(int category){
        MerchNameService service = new MerchNameService();
        readSpending().stream().filter(s->{
            return service.getCategoryByMerch(s.getMerchName()) == category;
        }).forEach(System.out::println);
    }
    public void getSumSpendingsByCategory(int category){
        MerchNameService service = new MerchNameService();
        System.out.println(
                readSpending()
                .stream()
                        .filter(s -> {
            return service.getCategoryByMerch(s.getMerchName()) == category;
        })
                        .mapToDouble(s -> s.getSumm())
                        .sum()
        );
    }

    public void getSumSpendingsByMerch(int merch){

        System.out.println(
                readSpending()
                        .stream()
                        .filter(s -> {
                            return merch == s.getMerchName();
                        })
                        .mapToDouble(s -> s.getSumm())
                        .sum()
        );
    }

}
