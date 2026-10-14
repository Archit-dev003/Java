import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int input = sc.nextInt();

        BookStatus B[] = new BookStatus[input];

        
        for(int i=0; i<input; i++)
        {
            System.out.print("Enter the title: ");
            String name = sc.next();
    
            System.out.print("Enter author's name: ");
            String author = sc.next();

            System.out.print("Enter book id: ");
            int bookId = sc.nextInt();

            B[i] = new BookStatus(name, author, bookId);
            System.out.println();
        }

        int choice;
    
        do{
            System.out.println("-----OPTIONS-----");
            System.out.println();
            System.out.println("1. Borrow");
            System.out.println("2. Return");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Choice: ");
            choice = sc.nextInt();
            System.out.println();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter book id: ");
                    int bBookId = sc.nextInt();
                    System.out.println();
                    boolean found = false;
                    for(BookStatus BS : B)
                    {
                        if(bBookId == BS.getBookId())
                        {
                            found = BS.borrowBook();
                            break;
                        }
                    }
                    if(found)
                    {
                        System.out.println("Book borrowed successfully!");
                    }
                    else
                    {
                        System.out.println("Book not available!");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter book id: ");
                    int rBookId = sc.nextInt();
                    System.out.println();
                    found = false;
                    for(BookStatus BS : B)
                    {
                        if(rBookId == BS.getBookId())
                        {
                            found = BS.returnBook();
                            break;
                        }
                    }
                    if(found)
                    {
                        System.out.println("Book received successfully!");
                    }
                    else
                    {
                        System.out.println("Book not available!");
                    }
                    System.out.println();
                    break;

                case 3:
                    for(BookStatus BS : B)
                    {
                        BS.displayDetails();
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Session Terminated!");
                    break;

                default:
                    System.out.println("Invalid Input");
                    System.out.println();
                    break;
            }

        }while(choice!=4);
        sc.close();
    }
}
