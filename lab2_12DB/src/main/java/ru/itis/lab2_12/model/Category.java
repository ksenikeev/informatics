package ru.itis.lab2_12.model;

public class Category extends Dictionary {
    public Category(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
