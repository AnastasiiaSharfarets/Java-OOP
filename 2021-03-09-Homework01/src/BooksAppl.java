import java.util.Arrays;

public class BooksAppl {
    public static void main(String[] args) {
        Book b1 = new Book(133003, "Pupkin Vasya", "Book1", 200, 23.4);
        Book b2 = new Book(103304, "Pupkin Kolya", "Book2", 100, 123.4);
        Book b3 = new Book(10305, "Pupkin Tolya", "Book3", 300, 223.4);
        Book b4 = new Book(12306, "Pupkin Sasha", "Book4", 400, 423.4);
        Book b5 = new Book(130307, "Pupkin Kostya", "Book5", 500, 203.4);
        Book b6 = new Book(30308, "Pupkin Petya", "Book6", 600, 239.4);

        Book[] books = new Book[]{b1, b2, b3, b4, b5, b6};
        //printBooks(books);
        printBooks2(books);
        double res = getTotalPrice(books);

        System.out.println("Total price all books = " + res);
//		System.out.printf("Total price all books = %.2f\n", res);
//		int x = 123;
//		System.out.printf("x = %d\n",x);
//		System.out.printf("price = %.2f and x = %d\n",res,x);
    }

    private static double getTotalPrice(Book[] books) {
        double totalPrice = 0.;
        for (Book b : books) {
            totalPrice += b.getCountPages() * b.getPricePerPage();
        }
        return totalPrice;
    }

    public static void printBooks2(Book[] books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
            System.out.println("Price of a book" + (i + 1) + ": " +
                    getTotalPrice(books[i].getCountPages(), books[i].getPricePerPage()) + " €");
        }

    }

    public static double getTotalPrice(int countPages, double pricePerPage) {
        return countPages * pricePerPage;
    }

}
