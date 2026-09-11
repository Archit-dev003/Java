import java.util.Scanner;

public class p06_Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divion");

        int Op = sc.nextInt();

        if(Op==1)
            System.out.println(Num1+Num2);

        else if(Op==2)
            System.out.println(Num1-Num2);

        else if(Op==3)
            System.out.println(Num1*Num2);

        else if(Op==4)
        {
            double Result = Num1/Num2;
            System.out.println(Result);
        }
        sc.close();
    }
}
