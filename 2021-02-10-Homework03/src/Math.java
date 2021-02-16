public class Math {
    //НОД а и б ->>25 b 15 -->нод=5
    /*25-15=10
    15-10=5
    10-5=5
    5-5=0*/
    public static int euclideanAlgorithm(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int euclideanAlgorithmDoWhile(int a, int b) {
        do {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        } while (a != b);
        return a;
    }

    public static int gcdAlgorithmModern(int a, int b) {
        while (b != 0) {//b!=0
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecursionAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursionAlgorithm(b, a % b);
    }

    public static int euclideanAlgorithm2(int m, int n) {
        int tmp;
        //базовый случай
        if (m <= 0 || n <= 0) return 0;
        //решение
        do {
            tmp = m % n;
            m = n;
            n = tmp;
        } while (n != 0);
        return (m);
    }

    //НОК LCM
    //3 и 5=> нок 15
    // 10*20=> 10*20=200/10=20
    public static int leastCommonMultiple(int a, int b) {
        //return a * b/ gcdRecursionAlgorithm(a,b);
        return a / gcdRecursionAlgorithm(a, b) * b;//если очень большие а и б

    }
}
