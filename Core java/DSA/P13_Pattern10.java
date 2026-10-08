import java.util.Scanner;

public class P13_Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value;");

        int n = sc.nextInt();
        int count = 1;
        for (int i = n; i > 0; i--) {
            String star = "*".repeat(count);
            String space = " ".repeat(n - 1);
            System.out.println(space + star);
            n--;
            count += 2;
        }
        sc.close();
    }
}
