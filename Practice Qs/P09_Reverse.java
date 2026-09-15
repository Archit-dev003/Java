import java.util.*;

class ArrayR 
{
   public void Rev(int arr[],int input)
    {
        int j=input-1;
        for(int i=0;i<input/2;i++)
        {
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j--;
        }
        System.out.print("Reverse array is: ");
        for(int i = 0; i < input; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class P09_Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int input = sc.nextInt();
        int arr[] = new int[input];

        for(int i=0; i<input; i++)
        {
            arr[i]=sc.nextInt();
        }

        ArrayR R = new ArrayR();
        R.Rev(arr, input);

        sc.close();
    }
}
