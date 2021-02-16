import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myLovelyArray = generateArray(10);
        int[] myCopyFromLovelyArray = copyMyArray(myLovelyArray);
        System.out.println(Arrays.toString(myLovelyArray));
        bSort(myLovelyArray);
        System.out.println(Arrays.toString(myLovelyArray));
        System.out.println("Копия изначального массива: ");
        System.out.println(Arrays.toString(myCopyFromLovelyArray));

        bubbleSortRecursion(myCopyFromLovelyArray);
        System.out.println(Arrays.toString(myCopyFromLovelyArray));

    }

    private static void bubbleSortRecursion(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                swap(input, i);
                count++;
            }
        }
        if (count > 0) {
            bubbleSortRecursion(input);
        }
    }

    private static int[] copyMyArray(int[] input) {
        //return Arrays.copyOf(myLovelyArray,10);
        int output[] = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    private static void bSort(int[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i);
                    unsorted = true;
                }
            }
        }
    }

    private static void swap(int[] input, int i) {
        int temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
    }

    private static int[] generateArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = randomIntGenerate();
        }
        return output;
    }

    private static int randomIntGenerate() {
        return (int) (Math.random() * 100);//от 0 до 100
    }
}
