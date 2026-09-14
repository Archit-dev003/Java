import java.util.*;
public class P09_Loops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=1; i<=input; i++)
        {
            if(i%2==0){
                System.out.println(i+" Even");
            }
            if(i%2!=0){
                System.out.println(i+" Odd");
            }
        }

        int i=1;
        while(i<=10)
        {
            System.out.println(input*i);
            i++;
        }

        sc.close();
    }
}
