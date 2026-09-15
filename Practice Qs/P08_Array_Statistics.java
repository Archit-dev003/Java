import java.util.*;

class Stats
{
   public void Largest(int[] arr,int input)
    {
        int Large=arr[0];
        for(int i=0;i<input; i++)
        {
            if(arr[i]>Large)
            {
                Large = arr[i];
            }
        }

        System.out.println("The Largest value in the array is: "+Large);
    }

   public void Smallest(int[] arr,int input)
    {
        int Smallest=arr[0];
        for(int i=0;i<input; i++)
        {
            if(arr[i]<Smallest)
            {
                Smallest = arr[i];
            }
        }

        System.out.println("The Smallestst value in the array is: "+Smallest);
    }

   public void Sum(int[] arr,int input)
    {
        int sum=0;
        for(int i=0; i<input; i++)
        {
            sum +=arr[i];
        }
        System.out.println("The Sum of array is: "+sum);
    }

   public void Average(int[] arr,int input)
    {
        int Avg=0;
        for(int i=0; i<input; i++)
        {
            Avg +=arr[i];
        }
        Avg /=input;

        System.out.println("The Sum of array is: "+Avg);
    }
    
}

public class P08_Array_Statistics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size of Array: ");
        int input = sc.nextInt();

        System.out.println("Enter the elements: ");
        int arr[]=new int[input];
        for(int i=0; i<input; i++)
        {
            arr[i]=sc.nextInt();
        }

        Stats S = new Stats();
        S.Largest(arr,input);
        S.Smallest(arr,input);
        S.Sum(arr,input);
        S.Average(arr,input);

        sc.close();
    }

}