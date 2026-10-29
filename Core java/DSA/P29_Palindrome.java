import java.util.Scanner;

public class P29_Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        input = input.toLowerCase().trim().replace(" ", "");

        int head=0, tail=input.length()-1;
        boolean palindrome = true;

        for(int i=0; i<input.length()/2; i++)
        {
            if(input.charAt(head) != input.charAt(tail))
            {
                palindrome = false;
                System.out.println("is not a palindrome!");
                break;
            }
            head++;
            tail--;
        }
        if(palindrome)
        {
            System.out.println("is a palindrome!");
        }
        sc.close();
    }
}
