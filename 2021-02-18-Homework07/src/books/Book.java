package books;
//Сделайте ко всем полям гетеры и сетеры(практики ради).
// Минимум 10 полей книги(автор, тираж, страницы и тд)
//Создать массив книг(и/или полки).
//Отсортировать шейкером.
public class Book {
    private String title;
    private String ISBN;
    private String author;
    private String genre;

    private int year;
    private int pages;
    private int edit;

    private double rating;
    private double price;

    private boolean cover;

    public Book(String title, String ISBN, String author,
                String genre, int year, int pages, int edit,
                double rating, double price, boolean cover) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.pages = pages;
        this.edit = edit;
        this.rating = rating;
        this.price = price;
        this.cover = cover;
    }

    public String toDisplay(){
        return "[\n" +
                " Название книги " + title + ",\n" +
                " код ISBN " + ISBN + ",\n" +
                " автор " + author + ",\n" +
                " жанр " + genre + ",\n" +
                " год издания " + year + ",\n" +
                " количество страниц " + pages + "\n" +
                " тираж" + edit + "\n" +
                " рейтинг" + rating + "\n" +
                " цена " + price + "\n" +
                " обложка" + cover + "\n" +
                "]";
    }
    public static void bookArrayToDisplay(Book[] Books) {
        for (int i = 0; i < Books.length; i++) {
            System.out.println(Books[i].toDisplay());
        }
    }
}
