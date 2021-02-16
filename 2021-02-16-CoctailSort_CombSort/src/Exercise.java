import javax.swing.plaf.IconUIResource;

public class Exercise {
    public static void main(String[] args) {
        int[] newArray = CocktailSort.createArray(10);
        int[] secondArray = new int[]{100, 5, 36, 56, 90, 3, 5, 68};
        int[] defaultArray = new int[10];

        int[] idealArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newUnsortedArray = unSortArray(idealArray);
        CocktailSort.myPrint(newUnsortedArray);
    }

    private static int[] unSortArray(int[] idealArray) {
        //у нас есть отсортированный массив
        //надо его перемешать рандомно
        // создадим новый массив той же длинны
        // в него мы будем переписывать данные
        // по исходному массиву мы идем циклом
        // мы генерируем случайное число в диапазоне длинны миссива(Math.random)
        // если индекс случайного числа в новом массиве уже прописан, то генерируем число заново
        int[] output = new int[idealArray.length];
        int count = 0;
        for (int i = 0; i < idealArray.length; i++) {
            int temp = generateRandomIndex(idealArray.length);
            while (output[temp] != 0) {

                count++;
                temp = generateRandomIndex(idealArray.length);
            }
            output[temp] = idealArray[i];

        }
        System.out.println("Количество раз " + count);
        return output;
    }

    private static int generateRandomIndex(int diapazon) {
        return (int) (Math.random() * diapazon);
    }
}
