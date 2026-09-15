import java.util.Scanner;
class Evaluate3
{
    public void Freq(int[] arr,int input,int value)
    {
        int Freq=0;
        int pos=arr[0];
        for(int i=0; i<input; i++)
        {
            if(arr[i]==value)
            {
                Freq++;
            }
        }
        for(int i=0; i<input; i++)
        {
            if(arr[i]==value)
            {
                pos=i;
                System.out.println("Number Found!");
                break;
            }
        }
        if(Freq>0)
        {
            System.out.println("First Position: "+pos);
            System.out.println("Frequency: "+Freq);
        }
        else{
            System.out.println("Number Not Found!");
        }
    }
}

public class P12_Search {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int arr[]=new int[input];
        for(int i=0; i<input; i++)
        {
            arr[i]=sc.nextInt();
        }
        int Value = sc.nextInt();
        Evaluate3 E = new Evaluate3();
        E.Freq(arr, input, Value);

        sc.close();
    }
}
