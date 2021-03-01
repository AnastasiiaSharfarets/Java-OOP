import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Return an array that is “left shifted” by one – so {6, 2, 5, 3}
        //returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
        int[] arr1 = new int[]{6, 2, 5, 3};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{1};

        System.out.println(Arrays.toString(shiftLeft(arr1)));// → [2, 5, 3, 6]
        System.out.println(Arrays.toString(shiftLeft(arr2))); // → [2, 1]
        System.out.println(Arrays.toString(shiftLeft(arr3))); // → [1]
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length - 1; i++) {
            output[i] = input[i + 1];
        }
        output[input.length - 1] = input[0];
        return output;
    }
}
