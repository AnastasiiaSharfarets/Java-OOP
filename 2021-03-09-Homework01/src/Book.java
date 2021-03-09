public class Book {
    private long isbn;
    private String author;
    private String title;
    private int countPages;
    private double pricePerPage;

    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.countPages = countPages;
        this.pricePerPage = pricePerPage;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCountPages() {
        return countPages;
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public void setPricePerPage(double pricePerPage) {
        this.pricePerPage = pricePerPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", countPages=" + countPages +
                ", pricePerPage=" + pricePerPage +
                '}';
    }
}
