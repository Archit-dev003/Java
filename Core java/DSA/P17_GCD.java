import java.util.Scanner;

public class P17_GCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first value: ");
        int input = sc.nextInt();

        System.out.print("Enter second value: ");
        int input2 = sc.nextInt();

        int arr[] = new int[10];
        int index=0;
        for(int i=2; i<=input && i<=input2; i++)
        {
            if(input%i==0 && input2%i==0)
            {
                arr[index] = i;
                index++;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
