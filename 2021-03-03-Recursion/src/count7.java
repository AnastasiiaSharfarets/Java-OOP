//Given a non-negative int n, return the count of the occurrences of 7 as a digit,
//so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
//
//Дано положительное целочисленное N. Верните количество семёрок в числе. 717 - вернёт 2.
// Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), а деление на 10 удалит правую цифру(126 / 10 равно 12).
// Авторы задачи были к нам слишком добры и практически решили её прямов условии.
//
//count7(717) → 2
//count7(7) → 1
//count7(123) → 0

public class count7 {
    public static void main(String[] args) {
        System.out.println(count7(717));//→ 2
        System.out.println(count7(7));//→ 1
        System.out.println(count7(123));//→ 0
        System.out.println(count7(777));//→ 3
        System.out.println("=========================");
        System.out.println(count7loop(77));
        System.out.println(count7loop(0));
        System.out.println(count7loop(717));
        System.out.println(count7loop(777777777));//9
    }

    public static int count7(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7) {
            return 1 + (count7(n / 10));
        } else {
            return 0 + (count7(n / 10));
        }
    }

    public static int count7loop(int n) {
        int count = 0;
        for (int i = n; i >= 7; i = i / 10) {
            if (i % 10 == 7) {
                count++;
            }
        }
        return count;
    }

}


