import java.util.Scanner;

public class P10_Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++)
        {
            for(int j=i; j<n; j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
    }
}
