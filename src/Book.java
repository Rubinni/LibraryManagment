public class Book {
    private String BookName;
    private String BookAuthor;
    private int BookDate;

    public Book(String bookName, String bookAuthor, int bookDate, String bookSubject) {
        BookName = bookName;
        BookAuthor = bookAuthor;
        BookDate = bookDate;
        BookSubject = bookSubject;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public int getBookDate() {
        return BookDate;
    }

    public void setBookDate(int bookDate) {
        BookDate = bookDate;
    }

    public String getBookSubject() {
        return BookSubject;
    }

    public void setBookSubject(String bookSubject) {
        BookSubject = bookSubject;
    }

    private String BookSubject;


}
