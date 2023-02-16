package ru.itis.informatics.lab2_prequel._1_immutable;

public final class SimpleImmutableMerch {
    final private int article;
    final private int count;
    final private float price;

    public SimpleImmutableMerch(int article, int count, float price) {
        this.article = article;
        this.count = count;
        this.price = price;
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

    public String toString() {
        return article + ", " + count + ", " + price;
    }
}
