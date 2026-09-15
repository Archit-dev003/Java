import java.util.Scanner;
class Evaluate
{
    public void Horiz(int arr[][],int input,int input2)
    {
        int val[] = new int[input];

        for(int i=0; i<input; i++)
        {
            for(int j=0; j<input2; j++)
            {
                val[i]+=arr[i][j];
            }
        }
        for(int i=0; i<input; i++)
        {
            System.out.print("Student "+(i+1)+" Total "+val[i]+" ");
            System.out.println();
        }
    }
}

public class P10_HorizontalSum {
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
        Evaluate E = new Evaluate();
        E.Horiz(arr, input, input2);

        sc.close();
    }
}
