public class BookStatus extends Book {

    BookStatus(String title,String author, int bookId)
    {
        super(title, author, bookId);
    }

    public boolean borrowBook()
    {
        if(getS() == Status.AVAILABLE)
        {
            setS(Status.BORROWED);
            return true;
        }
        return false;
    }

    public boolean returnBook()
    {
        if(getS() == Status.BORROWED)
        {
            setS(Status.AVAILABLE);
            return true;
        }
        return false;
    }

    public void displayDetails()
    {
        System.out.println("Book: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Status: "+getS());
        System.out.println();
    }
}
