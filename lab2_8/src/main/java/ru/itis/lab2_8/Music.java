package ru.itis.lab2_8;

public enum Music {
    Jazz("Джаз"),
    ElectricMusic("Электронная музыка");

    private String name;
    public String getName() {
        return name;
    }
     Music(String name) {
        this.name = name;
    }
}
