import data.Fraction;

public class NewTest {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1,2);
        fr1.multiplyFraction(fr1);


    }

    public static Fraction multiply(Fraction a, Fraction b) {
        int cNumerator;
        int cDenominator;
        cNumerator = a.getNumerator() * b.getNumerator();
        cDenominator = a.getDenominator() * b.getDenominator();
        int reduction = 1;//нод

        cNumerator = cNumerator / reduction;
        cDenominator = cDenominator / reduction;
        Fraction c = new Fraction(cNumerator, cDenominator);
        return c;
    }
}
