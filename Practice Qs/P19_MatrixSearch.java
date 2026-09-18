import java.util.Scanner;
class Search
{
    public void search(int arr[][],int val)
    {
        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                if(arr[i][j]==val)
                {
                    System.out.println(val+" found at "+"("+i+","+j+")");
                    count++;
                }
            }
        }
        if(count==0){
            System.out.println("Value doesn't exist!");
        }
        System.out.println("Occurrences: "+count);
    }

    public void LS(int arr[][])
    {
        int Max = arr[0][0];
        int Min = arr[1][1];
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                if(arr[i][j]>Max)
                {
                    Max=arr[i][j];
                }
                else
                    if(arr[i][j]<Min)
                    {
                        Min=arr[i][j];
                    }
            }
        }

        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                if(arr[i][j]==Max)
                {
                    System.out.println("Largest: "+Max+" at "+"("+i+","+j+")");
                }
                else if(arr[i][j]==Min)
                {
                    System.out.println("Smallest: "+Min+" at "+"("+i+","+j+")");
                }
            }
        }
    }
}
public class P19_MatrixSearch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int row = sc.nextInt();

        System.out.print("Enter Column: ");
        int column = sc.nextInt();

        int arr[][]=new int[row][column];
        System.out.print("Enter Values: ");
        for(int i=0; i<arr.length;i++)
        {
           for(int j=0; j<arr[i].length;j++)
           {
                arr[i][j]=sc.nextInt();
           }
        }
        System.out.print("Value you want to search: ");
        int value = sc.nextInt();
        Search S = new Search();
        S.search(arr, value);
        S.LS(arr);
        sc.close();
    }    
}
