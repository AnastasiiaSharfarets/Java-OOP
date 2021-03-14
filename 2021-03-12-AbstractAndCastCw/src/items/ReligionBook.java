package items;

public class ReligionBook extends Book{
    String religion;
    double donation;

    public ReligionBook() {}

    public ReligionBook(long isbn, String author, String title, int countPages, double pricePerPage, String religion,
                        double donation) {
        super(isbn, author, title, countPages, pricePerPage);
        this.religion = religion;
        this.donation = donation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }

    @Override
    public String toString() {
        return "ReligionBook [isbn=" + isbn + ", author=" + author + ", title=" + title + ", countPages=" + countPages
                + ", pricePerPage=" + pricePerPage + ", religion=" + religion + ", donation=" + donation + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof ReligionBook))
            return false;
        ReligionBook other = (ReligionBook) obj;
        if (Double.doubleToLongBits(donation) != Double.doubleToLongBits(other.donation))
            return false;
        if (religion == null) {
            if (other.religion != null)
                return false;
        } else if (!religion.equals(other.religion))
            return false;
        return true;
    }

    @Override
    public double calcPrice() {

        return donation;
    }

}
