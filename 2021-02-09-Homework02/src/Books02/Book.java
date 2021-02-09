package Books02;

public class Book {
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
        //System.out.println("Количество страниц: " + pages);
        //System.out.println("Переплет: " + (cover ? "мягкий" : "твердый"));
        System.out.println("Жанр: " + genre);
        //System.out.println("Рейтинг: " + rating);
        //System.out.println("Цена: " + price + " руб.");
        System.out.println("Тираж:" + edit);
        System.out.println("++++++++++++++++++++");

    }

    public Book(String title, String ISBN, int edit) {
        this.title = title;
        this.ISBN = ISBN;
        this.edit = edit;
    }

    public Book(String author, int year, int edit) {
        this.author = author;
        this.year = year;
        this.edit = edit;
    }

    public Book(String title, String author, int year, int edit) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edit = edit;
    }

    public Book(int edit) {
        this.edit = edit;
    }

    public Book(String title, String author, String ISBN, String genre, int edit) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.edit = edit;
    }
}
