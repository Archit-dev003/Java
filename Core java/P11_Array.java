import java.util.*;

public class P11_Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int input2 = sc.nextInt();
        //int Array[]=new int[input];
        int Array2[][]=new int[input][input2];

        // for(int i=0; i<input; i++)
        // {
        //     Array[i]=sc.nextInt();
        // }
        for(int i=0; i<input; i++)
        {
            for(int j=0; j<input2; j++)
            {
                Array2[i][j]=sc.nextInt();
            }
        }

        for(int row[] : Array2)
        {
            for(int value : row)
            {
                System.out.print(value+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
