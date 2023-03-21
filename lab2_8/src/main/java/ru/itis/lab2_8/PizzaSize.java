package ru.itis.lab2_8;

public enum PizzaSize {
    grand(35),
    medium(30),
    mimi(25);

    private int size;
    public int getSize() {
        return size;
    }
    PizzaSize(int size) {
        this.size = size;
    }
}
