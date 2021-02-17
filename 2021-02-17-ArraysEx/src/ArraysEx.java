public class ArraysEx {
    public static void main(String[] args) {
        //6. Given arrays num1 and num2 of the same length,
        // for every element in num1, consider the corresponding element
        // in num2 (at the same index). Return the count of the number
        // of times that the two elements differ by 2 or less, but are not equal.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{2, 3, 10};
        int[] arr3 = new int[]{1, 2, 3};
        int[] arr4 = new int[]{2, 3, 5};
        int[] arr5 = new int[]{1, 2, 3};
        int[] arr6 = new int[]{2, 3, 3};

        System.out.println(matchUp(arr1, arr2));// → 2
        System.out.println(matchUp(arr3, arr4));// → 3
        System.out.println(matchUp(arr5, arr6));// → 2
    }

    /**
     * Method takes 2 arrays (num1 and num2) of the same length
     *
     * @param num1
     * @param num2
     * @return
     */

    private static int matchUp(int[] num1, int[] num2) {
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != num2[i] && Math.abs(num2[i] - num1[i]) <= 2) {
                count++;
            }
        }
        return count;
    }
}
