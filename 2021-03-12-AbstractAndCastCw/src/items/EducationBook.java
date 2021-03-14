package items;

import appl.BookApplCW;

public class EducationBook extends Book {
    String subject;
    int pSubs;

    public EducationBook() {
    }

    public EducationBook(long isbn, String author, String title, int countPages, double pricePerPage, String subject,
                         int pSubs) {
        super(isbn, author, title, countPages, pricePerPage);
        this.subject = subject;
        this.pSubs = pSubs;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getpSubs() {
        return pSubs;
    }

    public void setpSubs(int pSubs) {
        this.pSubs = pSubs;
    }

    @Override
    public String toString() {
//		return "EducationBook [isbn=" + isbn + ", author=" + author + ", title=" + title + ", countPages=" + countPages
//				+ ", pricePerPage=" + pricePerPage + ", subject=" + subject + ", pSubs=" + pSubs + "]";
        return super.toString() + ", subject=" + subject + ", pSubs=" + pSubs + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (!(obj instanceof EducationBook))
            return false;
        EducationBook other = (EducationBook) obj;
        if (pSubs != other.pSubs)
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        return true;
    }

    @Override
    public double calcPrice() {
        return pricePerPage * countPages * (1 - pSubs / 100);
    }

}
