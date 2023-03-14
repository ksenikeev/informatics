package ru.itis.lab2_7.builder;

import java.util.HashSet;
import java.util.Set;

public class Pizza {

    private PizzaSize pizzaSize;
    private int parts = 8;
    private Set<Formaggio> formaggioSet;
    private boolean funghi;
    private boolean pomodori;
    private boolean origano;
    private boolean pollo;

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private PizzaSize pizzaSize;
        private int parts = 8;
        private Set<Formaggio> formaggioSet = new HashSet<>();
        private boolean funghi;
        private boolean pomodori;
        private boolean origano;
        private boolean pollo;

        public PizzaBuilder pizzaSize(PizzaSize pizzaSize) {
            this.pizzaSize = pizzaSize;
            return this;
        }

        public PizzaBuilder parts(int parts) {
            this.parts = parts;
            return this;
        }

        public PizzaBuilder addFormaggio(Formaggio f) {
            this.formaggioSet.add(f);
            return this;
        }

        public PizzaBuilder funghi(boolean funghi) {
            this.funghi = funghi;
            return this;
        }

        public PizzaBuilder pomodori(boolean pomodori) {
            this.pomodori = pomodori;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public Pizza(PizzaBuilder builder) {
        pizzaSize = builder.pizzaSize;
        parts = builder.parts;
        formaggioSet = builder.formaggioSet;
        funghi = builder.funghi;
        pomodori = builder.pomodori;
        origano = builder.origano;
        pollo = builder.pollo;
    }
    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getParts() {
        return parts;
    }

    public void setParts(int parts) {
        this.parts = parts;
    }

    public Set<Formaggio> getFormaggioSet() {
        return formaggioSet;
    }

    public void setFormaggioSet(Set<Formaggio> formaggioSet) {
        this.formaggioSet = formaggioSet;
    }

    public boolean isFunghi() {
        return funghi;
    }

    public void setFunghi(boolean funghi) {
        this.funghi = funghi;
    }

    public boolean isPomodori() {
        return pomodori;
    }

    public void setPomodori(boolean pomodori) {
        this.pomodori = pomodori;
    }

    public boolean isOrigano() {
        return origano;
    }

    public void setOrigano(boolean origano) {
        this.origano = origano;
    }

    public boolean isPollo() {
        return pollo;
    }

    public void setPollo(boolean pollo) {
        this.pollo = pollo;
    }


    @Override
    public String toString() {
        String str = "Ваш заказ:\n";
        str += "размер: " + pizzaSize + "\n";
        str += "делим на " + parts + " частей\n";
        str += "сыры: ";
        for (Formaggio f : formaggioSet) {
            str += f + ", ";
        }
        str +="\n";

        str += "грибы: " + (funghi ? "да" : "нет");

        return str;
    }


}
