
public class Book {

    private String bookName;
    private int ageRecomandation;

    public Book(String bookName, int ageRecomandation) {
        this.bookName = bookName;
        this.ageRecomandation = ageRecomandation;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAgeRecomandation() {
        return ageRecomandation;
    }

    public void setAgeRecomandation(int ageRecomandation) {
        this.ageRecomandation = ageRecomandation;
    }

    @Override
    public String toString() {
        return this.getBookName() + "(recommended for " + this.getAgeRecomandation() + " years-olds or older)";
    }
}
