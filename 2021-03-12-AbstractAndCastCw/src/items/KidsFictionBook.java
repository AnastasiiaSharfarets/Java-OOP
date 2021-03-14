package items;

public class KidsFictionBook extends FictionBook{
    int age;
    int pSubs;

    public KidsFictionBook() {
    }

    public KidsFictionBook(long isbn, String author, String title, int countPages, double pricePerPage, String genre,
                           boolean isBestSeller, int age, int pSubs) {
        super(isbn, author, title, countPages, pricePerPage, genre, isBestSeller);
        this.age = age;
        this.pSubs = pSubs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getpSubs() {
        return pSubs;
    }

    public void setpSubs(int pSubs) {
        this.pSubs = pSubs;
    }

    @Override
    public String toString() {
        return "KidsFictionBook [genre=" + genre + ", isBestSeller=" + isBestSeller + ", isbn=" + isbn + ", author="
                + author + ", title=" + title + ", countPages=" + countPages + ", pricePerPage=" + pricePerPage
                + ", age=" + age + ", pSubs=" + pSubs + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof KidsFictionBook))
            return false;
        KidsFictionBook other = (KidsFictionBook) obj;
        if (age != other.age)
            return false;
        if (pSubs != other.pSubs)
            return false;
        return true;
    }

    @Override
    public double calcPrice() {
        double res = pricePerPage * countPages * (isBestSeller ? 1.5 : 1);
        return res * (1 - pSubs / 100);
    }
}
