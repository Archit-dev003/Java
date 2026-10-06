import java.util.Scanner;

public class P07_Pattern04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");

        int n = sc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++)
        {  
            for(int j=1; j<=i; j++)
            System.out.print(count);

            System.out.println();
            count++;
        }
        sc.close();
    }
}
