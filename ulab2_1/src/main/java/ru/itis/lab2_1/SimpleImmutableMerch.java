package ru.itis.lab2_1;

public final class SimpleImmutableMerch {
    final private int article;
    final private int count;
    final private float price;

    final private Store store;

    public SimpleImmutableMerch(int article, int count, float price, Store store) {
        this.article = article;
        this.count = count;
        this.price = price;
        this.store = store;
    }

    public int getArticle() {
        return article;
    }

    public int getCount() {
        return count;
    }

    public float getPrice() {
        return price;
    }

    public Store getStore() {

        Store storeCopy = new Store();
        storeCopy.setAddress(store.getAddress());
        storeCopy.setSquare(store.getSquare());

        return storeCopy;
    }


    @Override
    public String toString() {
        return article + ", " + count + ", " + price + ", " + store.getAddress();
    }
}
