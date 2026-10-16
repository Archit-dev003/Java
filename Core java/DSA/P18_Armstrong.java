import java.util.Scanner;

public class P18_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, digit, sum = 0;
        n = sc.nextInt();
        int val = n;
        while (val > 0) {
            digit = val % 10;
            sum = sum + digit * digit * digit;
            val = val / 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
    }
}
