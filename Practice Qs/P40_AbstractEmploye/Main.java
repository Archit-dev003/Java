import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int input = sc.nextInt();

        Employee[] E = new Employee[input];

        for(int i=0; i<input; i++)
        {
            System.out.println("-------Enter the role-------");
            System.out.println();
            System.out.println("1. Employee");
            System.out.println("2. Developer");
            System.out.println("3. Manager");

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.println();
            int role = sc.nextInt();

            switch (role) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }    
}
