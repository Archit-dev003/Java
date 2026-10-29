import java.util.Scanner;

public class P28_StringRev {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char temp;
        String result = "";

        for(int i=input.length()-1; i>=0; i--)
        {
            temp = input.charAt(i);
            result += temp;
        }

        System.out.println(result);
        sc.close();
    }
}
