import java.util.Scanner;

public class P14_Count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a multi digit value: ");
        int input = sc.nextInt();

        int count = 0;
        while(input>0)
        {
            count++;
            input /= 10;
        }

        System.out.println("Total digit in the number: "+count);

        sc.close();
    }
}
