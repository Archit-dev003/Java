enum  Status{

    AVAILABLE,
    BORROWED
}

public class Book {
    
    private int bookId;
    private String title;
    private String author;
    private Status S = Status.AVAILABLE;

    Book(String title, String author, int bookId)
    {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public Status getS() {
        return S;
    }

    public void setS(Status s) {
        S = s;
    }

}
