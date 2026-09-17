import java.util.Scanner;

class Evaluate2
{
    public void Second(int arr[], int input)
    {
        int max = arr[0];
        int max2 = 0;

        for(int i=0; i<input; i++)
        {
            if(arr[i]>max ){
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println("Second Largest: "+max2);
    }
}
public class P13_SecondLarge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int input = sc.nextInt();
        int arr[] = new int[input];

        for(int i=0; i<input; i++)
        {
            arr[i]=sc.nextInt();
        }
        Evaluate2 E= new Evaluate2();
        E.Second(arr, input);

        sc.close();
    }
}
