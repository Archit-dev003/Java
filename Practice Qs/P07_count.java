import java.util.*;

class Count1
{
    public void Sum(int arr[],int input)
    {
        int Zero=0;
        int positive=0;
        int Negative=0;
        int Even=0;
        int Odd=0;

        for(int i=0; i<input; i++)
        {
            if(arr[i]==0)
            {
                Zero++;
            }
            else if(arr[i]>0)
            {
                positive++;
            }
            else{
                Negative++;
            }
            if(arr[i]%2==0)
            {
                Even++;
            }
            else{
                Odd++;
            }
        }
        System.out.println("Zero: "+ Zero);
        System.out.println("Positive: "+positive);
        System.out.println("Negative: "+Negative);
        System.out.println("Even: "+Even);
        System.out.println("Odd: "+Odd);
    }
}

public class P07_count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int input = sc.nextInt();

        int arr[]=new int[input];
        for(int i=0; i<input; i++)
        {
            arr[i]=sc.nextInt();
        }
        Count1 C = new Count1();
        C.Sum(arr, input);

        sc.close();
    }
}
