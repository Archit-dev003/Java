import java.util.Scanner;

public class P24_ReverseArrayRecursion {
    private static void reverse(int[] arr, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(arr[index]);
        if (index > 0) {
            System.out.print(" ");
        }
        
        reverse(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(arr, n - 1);
        scanner.close();
    }
}
