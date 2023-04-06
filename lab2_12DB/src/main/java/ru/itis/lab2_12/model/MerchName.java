package ru.itis.lab2_12.model;

public class MerchName extends Dictionary {
    private int category;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public MerchName(int id, int category, String name) {
       super(id, name);
       this.category = category;
    }
}
