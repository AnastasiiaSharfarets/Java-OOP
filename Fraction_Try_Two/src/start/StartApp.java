package start;

import data.Fraction;
import dao.Math;


public class StartApp {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(27, 50);
        Fraction fr2 = new Fraction(23, 50);

        //ожидаю 1

        Fraction frResult = Math.addition(fr1, fr2);
        System.out.println(frResult);

        Fraction frminus = Math.subtraction(fr1, fr2);
        System.out.println(frminus);


        Fraction testNewMethod = new Fraction(fr1, fr2, '+');
        System.out.println("----------------------------------");

        Fraction a = new Fraction(5);
        Fraction b = new Fraction(2,3);
        a.addAnotherFraction(b);
        System.out.println(a);

    }
}
