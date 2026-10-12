import java.util.Scanner;

public class P16_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a multi didgit value: ");
        int input = sc.nextInt();

        int reverse=0,val;
        while(input>0)
        {
            val = input%10;
            reverse = reverse*10 + val;
            input /= 10;
        }

        if(reverse == input)
        {
            System.out.println("Is a Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
