public class Recursion {
    public static void main(String[] args) {
        System.out.println(myFactorial(6));

        myFactRecursion(4);
    }

    private static int myFactRecursion(int number) {
        //Условие выхода=базовый случай
        //number=number-1 => number-1=(number-1)-1
        //выходим на 1
        if (number <= 1) {
            return 1;
        } else {
            return number * myFactRecursion(number-1);

        }
    }

    private static int myFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

}
