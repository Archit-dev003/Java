import java.util.Scanner;

public class P04_Pattern01 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int input = sc.nextInt();

    for(int i=0; i<input; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
