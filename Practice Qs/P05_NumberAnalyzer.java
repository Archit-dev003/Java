import java.util.*;

public class P05_NumberAnalyzer {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();

        
        if(input==0){
            System.out.println("Zero");
        }
        else if (input>0) {
            System.out.println("Positive");

            for(int i=1;i<=input;i++)
            {
                System.out.println(i);
            }
        }
        else{
            System.out.println("Negative");
        }

        if(input%2==0){
            System.out.println("Even");
        }
        
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
