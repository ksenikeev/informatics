package ru.itis.informatics.lab2_prequel._1_immutable;

public class ComplexNumber extends Number {

    private final double a;
    private final double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public int intValue() {
        return Double.valueOf(a).intValue();
    }

    @Override
    public long longValue() {
        return Double.valueOf(a).longValue();
    }

    @Override
    public float floatValue() {
        return  Double.valueOf(a).floatValue();
    }

    @Override
    public double doubleValue() {
        return a;
    }

    public static ComplexNumber sum(ComplexNumber x, ComplexNumber y) {
        return new ComplexNumber(x.a + y.a, x.b + y.b);
    }

    public static void main(String[] args) {
        Character x = Character.valueOf('1');
        Character y = Character.valueOf('7');

        System.out.println(y/x);
    }
}
