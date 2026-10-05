import java.util.Scanner;

public class P06_Pattern03 {
    public static void main(String[] args) {
        
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = SC.nextInt();

        for(int i=1; i<=n; i++)
        {   
            for(int j=1; j<=i; j++)
            System.out.print(j);

            System.out.println();
        }
        SC.close();
    }
}
