public class NOK_NOD {
    /*Find the highest common divider and Least common multiple
    НОД — это наибольший общий делитель. Greatest common divisor
    НОК — это наименьшее общее кратное. Least common multiple
    Метод принимает два числа. И надо найти нод. Второй метод принимает два числа и находит НОК*/
    public static void main(String[] args) {
        System.out.println(findGreatestCommonDivisor(54, 24));
        System.out.println(findGreatestCommonDivisor(24, 12));

        System.out.println(findLeastCommonMultiple(100, 10));
        System.out.println(findLeastCommonMultiple(54, 10));
    }

    private static int findGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else
            return findGreatestCommonDivisor(b, a % b);
    }

    private static int findLeastCommonMultiple(int a, int b) {

        return a * b / findGreatestCommonDivisor(a, b);
    }

}
