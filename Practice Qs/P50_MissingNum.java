import java.util.Scanner;

public class P50_MissingNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a total value: ");
        int input = sc.nextInt();

        int arr[] = new int[input];

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        int count = 1;
        int value = min;
        for(int i=0; i<arr.length; i++)
        {
            if(value+count==arr[i])
            {
                break;
            }
            count++;
        }

        value = min;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=value)
            {
                System.out.println("Missing value: "+value);
                break;
            }
            value += count;
        }
        sc.close();
    }
}
