import java.util.Arrays;

public class Homework05Array {
    public static void main(String[] args) {
        //3.Given an array of ints, return true if the array contains no 1’s and no 3’s.
        //lucky13([0, 2, 4]) → true
        //lucky13([1, 2, 3]) → false
        //lucky13([1, 2, 4]) → false
        int[] arr1 = new int[]{0, 2, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{1, 2, 4};
        int[] arr4 = new int[0];

        System.out.println(lucky13(arr1));//true
        System.out.println(lucky13(arr2));//false
        System.out.println(lucky13(arr3));//false
        System.out.println(lucky13(arr4));//true
        System.out.println("__________________");

        //4.Given a number n, create and return a new int array of length n,
        // containing the numbers 0, 1, 2, … n-1. The given n may be 0,
        // in which case just return a length 0 array.
        // You do not need a separate if-statement for the length-0 case;
        // the for-loop should naturally execute 0 times in that case, so it just works.
        // The syntax to make a new int array is: new int[desired_length] (See also: FizzBuzz Code)

        //fizzArray(4) → [0, 1, 2, 3]
        //fizzArray(1) → [0]
        //fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        printArray(fizzArray(4));//→ [0, 1, 2, 3]
        printArray(fizzArray(1));//→[0]
        printArray(fizzArray(10));//→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println("__________________");


        //5.Given an array of ints, return true if it contains no 1’s or it contains no 4’s.

        //no14([1, 2, 3]) → true
        //no14([1, 2, 3, 4]) → false
        //no14([2, 3, 4]) → true

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{1, 2, 3, 4};
        int[] a3 = new int[]{2, 3, 4};
        int[] a4 = new int[]{2, 3, 5};
        int[] a5 = new int[]{1, 4};
        int[] a6 = new int[0];

        System.out.println(no14(a1));//true
        System.out.println(no14(a2));//false
        System.out.println(no14(a3));//true
        System.out.println(no14(a4));//true
        System.out.println(no14(a5));//false
        System.out.println(no14(a6));//true
    }


    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }


    private static int[] fizzArray(int n) {
        int[] array =  new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        return array;
    }


    public static boolean containsNum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean no14(int[] input) {
        boolean containsOne = containsNum(input, 1);
        boolean containsFour = containsNum(input, 4);
        boolean result = !(containsOne && containsFour);
        return result;
    }

    public static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
