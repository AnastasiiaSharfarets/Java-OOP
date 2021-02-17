public class Homework06 {
    public static void main(String[] args) {
        //1. Given a string and an int n, return a string made of the first n characters of the string,
        // followed by the first n-1 characters of the string, and so on. You may assume that
        // n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

        System.out.println("EX 1__________________________________");
        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"
        System.out.println("EX 2__________________________________");

        //2. Given a string, does “xyz” appear in the middle of the string?
        // To define middle, we’ll say that the number of chars to the left and right
        // of the “xyz” must differ by at most one. This problem is harder than it looks.

        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
        System.out.println(xyzMiddle("xy"));// → false
        System.out.println("EX 3__________________________________");

        //3. Given an array of ints, return true if the array contains either 3 even or 3 odd values
        // all next to each other.
        int[] array1 = new int[]{2, 1, 3, 5};
        int[] array2 = new int[]{2, 1, 2, 5};
        int[] array3 = new int[]{2, 4, 2, 5};

        System.out.println(modThree(array1));//→ true
        System.out.println(modThree(array2));//→ false
        System.out.println(modThree(array3));//→ true
        System.out.println("EX 4__________________________________");

        //4. Return true if the group of N numbers at the start and end of the array are the same.
        // For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
        // You may assume that n is in the range 0..nums.length inclusive.
        int[] arr1 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr2 = new int[]{5, 6, 45, 99, 13, 5, 6, 45};

        System.out.println(sameEnds(arr1, 1));//→ false
        System.out.println(sameEnds(arr1, 2));// → true
        System.out.println(sameEnds(arr1, 3));// → false
        System.out.println(sameEnds(arr2, 3));// → true

        System.out.println("EX 5__________________________________");
        //5. Треугольник из чисел. ***
        //     1
        //    222
        //   33333
        //  4444444
        // 555555555
        //66666666666
        triangle(6);
    }

    private static boolean sameEnds(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[arr.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean modThree(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
                return true;
            }
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    private static void triangle(int height) {
        int width = 2 * height - 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < height - 1 - i || j > height - 1 + i) {//(height - 1) - это центр. линия треугольника,
                    // от нее влево и вправо добавляются цифры
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println();
        }
    }

    private static boolean xyzMiddle(String str) {
        if (str.length() < 3)//краевые случаи
            return false;
        if (str.length() % 2 == 1) {// для нечетной строки
            int middle = (str.length() - 3) / 2;
            String middleString = str.substring(middle, middle + 3);
            return middleString.equals("xyz");
            //теперь для четной строки
        } else {
            int middle = (str.length() - 4) / 2;
            String middleString = str.substring(middle, middle + 4);
            return middleString.contains("xyz");
        }
    }

    private static String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result = result + str.substring(0, i);
        }
        return result;
    }
}