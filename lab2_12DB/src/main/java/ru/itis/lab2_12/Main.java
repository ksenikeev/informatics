package ru.itis.lab2_12;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ru.itis.lab2_12.model.Category;
import ru.itis.lab2_12.model.MerchName;
import ru.itis.lab2_12.model.Spending;
import ru.itis.lab2_12.service.CategoryService;
import ru.itis.lab2_12.service.MerchNameService;
import ru.itis.lab2_12.service.SpendingService;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private CategoryService categoryService;
    private MerchNameService merchNameService;
    private SpendingService spendingService;

    public void initialize() {
        categoryService = new CategoryService();
        merchNameService = new MerchNameService();
        spendingService = new SpendingService();
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.initialize();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду[0]:");
            int cmd = scanner.nextInt();

            switch (cmd){
                case 0:
                    return;
                case 1:
                    main.categoryService.inputCategory(scanner);break;
                case 2:
                    main.merchNameService.inputMerchName(scanner);
                    break;
                case 3:
                    main.spendingService.inputSpending(scanner);
                    break;
                case 4:
                    // Показать все покупки за сегодня
                    main.spendingService.getAllSpendingToDay();
                    break;
                case 5:
                    // Показать сумму покупок в конкретой категории
                    System.out.print("Введите категорию:");
                    main.spendingService.getSumSpendingsByCategory(scanner.nextInt());
                    break;
                case 6:
                    // Показать сумму покупок выбранного товара
                    System.out.print("Введите товар");
                    main.spendingService.getSumSpendingsByMerch(scanner.nextInt());
                    break;
                case 7:
                    // Показать средние ежедневные траты (сколько в день в среднем тратится)
                    break;
            }
        }
    }
}

/*
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
        System.out.println("-----------------------------------------");
        merches.add(new MerchName(1,1, "Квадракоптер"));
        merches.add(new MerchName(2,2, "Наушники"));
        merches.add(new MerchName(3,3,"Молоко"));
        merches.add(new MerchName(4,3,"Кефирр"));
        saveMerchName(merches);
        merches = readMerchName();
        merches.forEach(System.out::println);
        System.out.println("-----------------------------------------");
        Date date = new Date();
        spendings.add(new Spending(date,72, 3));
        spendings.add(new Spending(date,40000, 1));
        spendings.add(new Spending(date,90, 4));
        spendings.add(new Spending(date,10000, 2));
        saveSpending(spendings);
        spendings = readSpending();
        spendings.forEach(System.out::println);
*/
