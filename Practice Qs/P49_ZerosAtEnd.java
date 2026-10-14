import java.util.Scanner;

public class P49_ZerosAtEnd {
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

        int index = input-1;
        for(int i=0; i<index; i++)
        {
            while(index>i && arr[index]==0)
            {
                index--;
            }

            if(arr[i]==0)
            {
                arr[i] = arr[index];
                arr[index] = 0;

                index--;
            }
        }
        System.out.print("Revised array: ");

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
