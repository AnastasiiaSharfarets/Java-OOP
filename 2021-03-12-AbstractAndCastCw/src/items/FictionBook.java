package items;

public class FictionBook extends Book{
    String genre;
    boolean isBestSeller;

    public FictionBook() {
    }

    public FictionBook(long isbn, String author, String title, int countPages, double pricePerPage, String genre,
                       boolean isBestSeller) {
        super(isbn, author, title, countPages, pricePerPage);
        this.genre = genre;
        this.isBestSeller = isBestSeller;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isBestSeller() {
        return isBestSeller;
    }

    public void setBestSeller(boolean isBestSeller) {
        this.isBestSeller = isBestSeller;
    }

    @Override
    public String toString() {
        return "FictionBook [isbn=" + isbn + ", author=" + author + ", title=" + title + ", countPages=" + countPages
                + ", pricePerPage=" + pricePerPage + ", genre=" + genre + ", isBestSeller=" + isBestSeller + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof FictionBook))
            return false;
        FictionBook other = (FictionBook) obj;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (isBestSeller != other.isBestSeller)
            return false;
        return true;
    }

    @Override
    public double calcPrice() {

        return pricePerPage * countPages * (isBestSeller ? 1.5 : 1);
    }

}
