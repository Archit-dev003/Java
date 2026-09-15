import java.util.Scanner;
class Evaluate1
{
    public void Ver(int arr[][],int input,int input2)
    {
        int val[] = new int[input];

        for(int j=0; j<input; j++)
        {
            for(int i=0; i<input2; i++)
            {
                val[i]+=arr[i][j];
            }
        }
        for(int i=0; i<input; i++)
        {
            System.out.print("Product "+(i+1)+": "+val[i]);
            System.out.println();
        }
    }
}
public class P11_Vertical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 = sc.nextInt();

        int arr[][]=new int[input][input2];
        for(int i=0; i<input; i++)
        {
            for(int j=0; j<input2; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Evaluate1 E = new Evaluate1();
        E.Ver(arr, input, input2);

        sc.close();
    }
}
