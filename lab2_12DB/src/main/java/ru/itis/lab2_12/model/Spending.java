package ru.itis.lab2_12.model;

import java.util.Date;

public class Spending {
    private Date date;
    private float summ;
    private int merchName;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }

    public int getMerchName() {
        return merchName;
    }

    public void setMerchName(int merchName) {
        this.merchName = merchName;
    }

    public Spending() {
    }

    public Spending(Date date, float summ, int merchName) {
        this.date = date;
        this.summ = summ;
        this.merchName = merchName;
    }

    @Override
    public String toString() {
        return "Spending{" +
                "date=" + date +
                ", summ=" + summ +
                ", merchName=" + merchName +
                '}';
    }

}
