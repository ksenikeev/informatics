package ru.itis.lab2_1;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.setAddress("Казань Университетская 35");
        store.setSquare(100);

        SimpleImmutableMerch merch =
                new SimpleImmutableMerch(123, 100, 1000, store);

        System.out.println(merch);

        merch.getStore().setAddress("Казань Университетская 30");

        System.out.println(merch);
    }
}
