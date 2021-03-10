package start;

import calculator.Math;
import data.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction myFirstLovelyFraction = new Fraction(
                3, 5);
        //System.out.println(myFirstLovelyFraction);
        Fraction fr2 = new Fraction(5, 8);
        Fraction result = Math.addition(myFirstLovelyFraction, fr2);
        System.out.println(result);
    }

}
