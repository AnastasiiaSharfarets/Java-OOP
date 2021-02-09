public class Book {
    //Создать класс книги: название, isbn, автор, год издания, количество страниц, переплёт, жанр, рейтинг, цена
    // (возможно параметры, которые придумаете сами).
    // Создать 5 экземпляров этого класса: азбука, война и мир, книга о вкусной и полезной пище,
    // и два своих примера. Использовать в названиях переменных осмысленный английский язык.
    String title;
    String ISBN;
    String author;
    int year;
    int pages;
    boolean cover;
    String genre;
    double rating;
    double price;
    int edit;

    public void displayInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println("Количество страниц: " + pages);
        System.out.println("Переплет: " + (cover ? "мягкий" : "твердый"));
        System.out.println("Жанр: " + genre);
        System.out.println("Рейтинг: " + rating);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Тираж:" + edit);
        System.out.println("++++++++++++++++++++");

    }
}

class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Азбука";
        book1.ISBN = "978-5-271-24968-6";
        book1.author = "Жукова О.С.";
        book1.year = 2019;
        book1.pages = 50;
        book1.cover = true;
        book1.genre = "учебник";
        book1.rating = 8.99;
        book1.price = 540.50;
        book1.edit = 4000;
        book1.displayInfo();

        Book book2 = new Book();
        book2.title = "Война и мир";
        book2.ISBN = "978-5-389-06256-6";
        book2.author = "Толстой Л.Н.";
        book2.year = 2013;
        book2.pages = 1500;
        book2.cover = false;
        book2.genre = "роман";
        book2.rating = 10.00;
        book2.price = 1540.50;
        book2.edit = 200000;
        book2.displayInfo();

        Book book3 = new Book();
        book3.title = "Книга о вкусной и полезной пище";
        book3.ISBN = "978-5-389-06256-4";
        book3.author = "Иванов И.И.";
        book3.year = 2020;
        book3.pages = 150;
        book3.cover = true;
        book3.genre = "кулинарная книга";
        book3.rating = 4.60;
        book3.price = 40.50;
        book3.edit = 300;

        book2.displayInfo();

        Book book4 = new Book();
        book4.title = "Красная шапочка";
        book4.ISBN = "389-06256-4";
        book4.author = "Перро Ш.";
        book4.year = 1987;
        book4.pages = 40;
        book4.cover = true;
        book4.genre = "сказки";
        book4.rating = 9.60;
        book4.price = 650.7;
        book4.edit = 40000;
        book4.displayInfo();

        Book book5 = new Book();
        book5.title = "Три мушкетёра";
        book5.ISBN = "978-06256-4";
        book5.author = "Дюма А.";
        book5.year = 1990;
        book5.pages = 890;
        book5.cover = false;
        book5.genre = "приключения";
        book5.rating = 9.60;
        book5.price = 5000.9;
        book5.edit = 4000;
        book5.displayInfo();


    }
}

