package ru.itis.lab2_8;

public class Row {

    private String name;
    private Music music;
    private Drink drink;
    private byte mushroom;
    private byte tomatoes;
    private byte ketchup;
    private byte olives;
    private byte mozzarella;
    private byte cheddar;
    private byte parmesan;
    private byte gauda;
    private byte russian;
    private byte chili;
    private PizzaSize size;

    public String getName() {
        return name;
    }

    public Music getMusic() {
        return music;
    }

    public Drink getDrink() {
        return drink;
    }

    public byte getMushroom() {
        return mushroom;
    }

    public byte getTomatoes() {
        return tomatoes;
    }

    public byte getKetchup() {
        return ketchup;
    }

    public byte getOlives() {
        return olives;
    }

    public byte getMozzarella() {
        return mozzarella;
    }

    public byte getCheddar() {
        return cheddar;
    }

    public byte getParmesan() {
        return parmesan;
    }

    public byte getGauda() {
        return gauda;
    }

    public byte getRussian() {
        return russian;
    }

    public byte getChili() {
        return chili;
    }

    public PizzaSize getSize() {
        return size;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }


    public Row(PizzaBuilder builder) {
        name = builder.name;
        music = builder.music;
        drink = builder.drink;
        mushroom = builder.mushroom;
        tomatoes = builder.tomatoes;
        ketchup = builder.ketchup;
        olives = builder.olives;
        mozzarella = builder.mozzarella;
        gauda = builder.gauda;
        cheddar = builder.cheddar;
        russian = builder.russian;
        parmesan = builder.parmesan;
        chili = builder.chili;

    }

    public static class PizzaBuilder {
        private String name;
        private Music music;
        private Drink drink;
        private byte mushroom;
        private byte tomatoes;
        private byte ketchup;
        private byte olives;
        private byte mozzarella;
        private byte cheddar;
        private byte parmesan;
        private byte gauda;
        private byte russian;
        private byte chili;
        private PizzaSize size;

        public PizzaBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder music(Music music) {
            this.music = music;
            return this;
        }

        public PizzaBuilder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public PizzaBuilder mushroom(byte mushroom) {
            this.mushroom = mushroom;
            return this;
        }

        public PizzaBuilder tomatoes(byte tomatoes) {
            this.tomatoes = tomatoes;
            return this;
        }

        public PizzaBuilder ketchup(byte ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public PizzaBuilder olives(byte olives) {
            this.olives = olives;
            return this;
        }

        public PizzaBuilder mozzarella(byte mozzarella) {
            this.mozzarella = mozzarella;
            return this;
        }

        public PizzaBuilder cheddar(byte cheddar) {
            this.cheddar = cheddar;
            return this;
        }

        public PizzaBuilder parmesan(byte parmesan) {
            this.parmesan = parmesan;
            return this;
        }

        public PizzaBuilder gauda(byte gauda) {
            this.gauda = gauda;
            return this;
        }

        public PizzaBuilder russian(byte russian) {
            this.russian = russian;
            return this;
        }

        public PizzaBuilder chili(byte chili) {
            this.chili = chili;
            return this;
        }

        public PizzaBuilder size(PizzaSize size) {
            this.size = size;
            return this;
        }


        public Row build() {
            return new Row(this);
        }
    }

}
