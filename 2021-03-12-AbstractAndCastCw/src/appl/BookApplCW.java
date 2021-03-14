package appl;

import items.*;

public class BookApplCW {

    public static void main(String[] args) {
        Book book1 = new ReligionBook(1234567, "author1", "title1", 569, 0., "religion1", 100.);
        Book book2 = new ReligionBook(1234568, "author2", "title2", 234, 0., "religion1", 20.);

        Book book3 = new FictionBook(4324243, "author3", "title3", 123, 1., "genre", true);

        Book book4 = new KidsFictionBook(4545454, "author4", "title4", 444, 0.9, "genre2", true, 13, 30);

        Book book5 = new KidsFictionBook(4545455, "author4", "title5", 555, 1.9, "genre3", true, 10, 20);

        Book book6 = new EducationBook(7777777, "author5", "title5", 333, 1.89, "subject", 50);

        Book[] books = {book1, book2, book3, book4, book5, book6};

        printBooks(books);

        KidsFictionBook kfb = (KidsFictionBook) book4;
        System.out.println(kfb.getAge());
        // =========================!Wrong!==========================
        // KidsFictionBook kfb2 = (KidsFictionBook) book2;
        // KidsFictionBook kfb2 = (KidsFictionBook) book3;
        // ==========================================================
        System.out.println(book4 instanceof KidsFictionBook);
        System.out.println(book2 instanceof KidsFictionBook);
        System.out.println(book3 instanceof KidsFictionBook);
        System.out.println(book4 instanceof FictionBook);
        // ==============================================================
        int age = 9;
        int res = countChildBookWithAgeGreater(books, age);
        System.out.println("Count = " + res);
        // ==============================================================
        Book test = new KidsFictionBook(4545454, "author4", "title4", 444, 0.9, "genre2", true, 13, 30);
        //	System.out.println(book4 == test);
        boolean resB = searchBook(books, test);
        System.out.println(resB);
    }

    private static boolean searchBook(Book[] books, Book test) {
        for (Book book : books) {
            if (book.equals(test)) return true;
        }
        return false;
    }

    private static int countChildBookWithAgeGreater(Book[] books, int age) {
        int count = 0;
        for (Book book : books) {
            if (book instanceof KidsFictionBook) {
                KidsFictionBook temp = (KidsFictionBook) book;
                if (temp.getAge() > age)
                    count++;
            }
        }
        return count;
    }

    private static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.toString());
            System.out.println("Price: " + b.calcPrice());
        }

    }

}
