import java.util.*;
public class P07_Ternary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Value: ");
        int input =sc.nextInt();

        String result = (input%2==0)?"Even":"Odd";
        System.out.println("Entered Value is "+result);

        sc.close();
    }
}
