package items;

public abstract class Book {
    long isbn;
    String author;
    String title;
    int countPages;
    double pricePerPage;

    public Book() {
        author = "No author";
        title = "No title";
    }

    public Book(long isbn, String author, String title, int countPages, double pricePerPage) {
        setIsbn(isbn);

        if(author!=null&&!author.trim().isEmpty())
            this.author = author;
        else
            this.author = "No author";

        if(title!=null&&!title.trim().isEmpty())
            this.title = title;
        else
            this.title = "No title";

        setCountPages(countPages);

        setPricePerPage(pricePerPage);
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        if(isbn>999_999&&isbn<10_000_000)
            this.isbn = isbn;
        else
            System.out.println("Wrong isbn");
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author!=null&&!author.trim().isEmpty())
            this.author = author;
        else
            System.out.println("Wrong author");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title!=null&&!title.trim().isEmpty())
            this.title = title;
        else
            System.out.println("Wrong title");
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        if(countPages>0&&countPages<=10_000)
            this.countPages = countPages;
        else
            System.out.println("Wrong countPages");
    }

    public double getPricePerPage() {
        return pricePerPage;
    }

    public void setPricePerPage(double pricePerPage) {
        if(pricePerPage>=0&&pricePerPage<=10)
            this.pricePerPage = pricePerPage;
        else
            System.out.println("Wrong pricePerPage");
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", author=" + author + ", title=" + title + ", countPages=" + countPages
                + ", pricePerPage=" + pricePerPage + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (countPages != other.countPages)
            return false;
        if (isbn != other.isbn)
            return false;
        if (Double.doubleToLongBits(pricePerPage) != Double.doubleToLongBits(other.pricePerPage))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    public abstract double calcPrice();

}
