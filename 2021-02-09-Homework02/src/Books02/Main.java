package Books02;

public class Main {
    public static void main(String[] args) {
        Book myBook1 = new Book("Война и мир", "12123-2323-00", 50000);
        Book myBook2 = new Book("Перро Шарль", 2002, 4000);
        Book myBook3 = new Book(6000);
        Book myBook4 = new Book("Сказки", "Бажов", "09090-000", "сказки", 5000);
        Book myBook5 = new Book("Джельсомино", "Джанни Родари", 1981, 25000);

        Book[] array = new Book[]{myBook1, myBook2, myBook3, myBook4, myBook5};

        /*myBook1.displayInfo();
        myBook2.displayInfo();
        myBook3.displayInfo();
        myBook4.displayInfo();
        myBook5.displayInfo();*/

        sortEditBooks(array);
            for (int i = 0; i < array.length; i++) {
                array[i].displayInfo();
            }

    }

    public static void sortEditBooks(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].edit < array[minIndex].edit) {
                    minIndex = j;
                }
            }
            Book temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
