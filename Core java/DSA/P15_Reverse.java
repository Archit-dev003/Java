import java.util.Scanner;

public class P15_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a multi digit value: ");
        int input = sc.nextInt();

        int reverse=0,val;
        while(input>0)
        {
            val = input%10;
            reverse = reverse*10 + val;
            input /= 10;
        }
        System.out.println("The reverse of integer: "+reverse);

        sc.close();
    }
}
