package ru.itis.lab2_12.model;

public abstract class Dictionary {
    protected int id;
    protected String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dictionary(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dictionary() {
    }
}
