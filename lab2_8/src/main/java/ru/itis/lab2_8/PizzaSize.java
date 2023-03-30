package ru.itis.lab2_8;

public enum PizzaSize {
    grand(35),
    medium(30),
    mini(25),
    zero(0);


    private int size;
    public int getSize() {
        return size;
    }

    public static PizzaSize getBySize(byte sz) {
        switch (sz) {
            case 35: return PizzaSize.grand;
            case 30: return PizzaSize.medium;
            case 25: return PizzaSize.mini;
            default: return PizzaSize.zero;
        }
    }
    PizzaSize(int size) {
        this.size = size;
    }
}
