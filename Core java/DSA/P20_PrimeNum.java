import java.util.Scanner;

public class P20_PrimeNum {
    public static void main(String[] args) {

        boolean prime=false;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value: ");
        int input = sc.nextInt();

        for(int i=2;i<input;i++)
        {
            if(input%i==0){
            System.out.println("Is not a Prime Number");
            prime=true;
            break;
            }
        }
        if(prime==false)
        {
            System.out.println("Is a Prime Number");
        }
        sc.close();
    }
}
