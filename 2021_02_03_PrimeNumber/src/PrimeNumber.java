public class PrimeNumber {
    public static void main(String[] args) {
        //дано число. Найти все простые числа меньше данного числа
        findAllPrimeNumber(1000_000);
    }

    private static void findAllPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    private static boolean isPrimeNumber(int input) {
        int border = (int) Math.sqrt(input);
        for (int i = 2; i < border; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
