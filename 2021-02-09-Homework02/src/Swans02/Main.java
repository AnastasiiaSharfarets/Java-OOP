package Swans02;

public class Main {
    public static void main(String[] args) {
        Swan mySwan1 = new Swan("male", "Swen");
        Swan mySwan2 = new Swan("Abba", 12);
        Swan mySwan3 = new Swan("Poul", "male", 4);
        Swan mySwan4 = new Swan("american", "Olga", "female", "white", 5);
        Swan mySwan5 = new Swan(2, "black");


        Swan[] array = new Swan[]{mySwan1, mySwan2, mySwan3, mySwan4, mySwan5};

        mySwan1.toDisplay();
        mySwan2.toDisplay();
        mySwan3.toDisplay();
        mySwan4.toDisplay();
        mySwan5.toDisplay();
        System.out.println("_______________");

        sortAgeSwans(array);
        for (int i = 0; i < array.length ; i++) {
            array[i].toDisplay();

        }

    }

    public static void sortAgeSwans(Swan[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].age < array[minIndex].age) {
                    minIndex = j;
                }
            }
            Swan temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }
}