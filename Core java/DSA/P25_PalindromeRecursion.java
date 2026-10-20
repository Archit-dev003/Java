import java.util.Scanner;

public class P25_PalindromeRecursion {
    private static boolean isPalindrome(String value, int forward, int backward) {
        
        if (forward >= backward) {
            return true;
        }
        if (value.charAt(forward) != value.charAt(backward)) {
            return false;
        }
        return isPalindrome(value, forward + 1, backward - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        if (isPalindrome(value, 0, value.length() - 1)) {
            System.out.println("Is a Palindrome");
        } else {
            System.out.println("Is not a Palindrome");
        }
        scanner.close();
    }
}
