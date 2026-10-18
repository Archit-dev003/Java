import java.util.Scanner;

public class P23_Factorial {
    
  static int factorial(int n) {
    if (n > 1) {
      return n * factorial(n - 1);
    }
    return 1;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int inp = sc.nextInt();
    System.out.println(factorial(inp));
  }

}
