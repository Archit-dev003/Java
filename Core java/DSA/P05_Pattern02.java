import java.util.Scanner;

public class P05_Pattern02 {
    public static void main(String[] args) {
   
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {   
            for(int j=0; j<5; j++)
            System.out.print("*");

            System.out.println();
        }
        sc.close();
    }
}
