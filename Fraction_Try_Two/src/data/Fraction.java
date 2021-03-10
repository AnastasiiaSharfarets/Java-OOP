package data;

import dao.Math;

public class Fraction extends Number {
    private int numerator;//верх часть, числитель
    private int denominator;//ниж. часть, делитель

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(Fraction fr1, Fraction fr2, char c) {
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "data.Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public void addAnotherFraction(Fraction b) {
        // что здесь должно стоять
        // что нам известно
        // первая дробь B. передена в сигнатуре метода.
        // вторая дробь this. numerator
        // this. denominator


        int d = Math.leastCommonMultiple(this.denominator, b.getDenominator());
        int n = this.numerator * d / this.denominator + b.getNumerator() * d / b.getDenominator();
        this.denominator = d;
        this.numerator = n;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

/*    public static Fraction addition(Fraction a, Fraction b) {  // summa
        int cNumerator;
        int cDenominator;
        cDenominator = leastCommonMultiple(a.getDenominator(), b.getDenominator()); //polychili c
        cNumerator = a.getNumerator() * cDenominator / a.getDenominator() + b.getNumerator() * cDenominator / b.getDenominator();
        int reduction = gcdRecursionAlgorithm(cNumerator, cDenominator);
        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }*/

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private void reduction() {
        int indexReduction = reduction(numerator, this.denominator);
        setNumerator(numerator / indexReduction);
        setDenominator(this.denominator / indexReduction);
    }
    public void multiplyFraction(Fraction b) {
        int d = this.denominator * b.getDenominator();
        int n = this.numerator * b.getNumerator();
        this.denominator = d / reduction(n, d);
        this.numerator = n / reduction(n, d);
    }
    private int reduction(int n, int d) {
        int reduction = Math.gcdRecursionAlgorithm(n, d);
        //нод
        return reduction;
    }

    // cleane code -> один класс -> один метод -> одна строчка

}
