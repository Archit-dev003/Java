import java.util.Scanner;

class Calculation
{
    public void IdentityMatrix(int[][] arr)
    {
    int temp=arr[0][0];
        boolean Identity=true;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                if(i==j){

                    if(temp!=arr[i][j]){
                        Identity=false;
                        break;
                    }
                }
                else 
                    if(i!=j)
                    {
                        if(arr[i][j]!=0){
                            Identity=false;
                            break;
                        }
                    } 
            }
        }
        if(Identity){
            System.out.println("The matrix is an identity matrix!");
        }
        else{
            System.out.println("The matrix is not an identity matrix!");
        }
    }

    public void symmetry(int arr[][])
    {
        boolean Symmetry=true;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr.length!=arr[i].length||arr[i][j]!=arr[j][i])
                {
                    Symmetry=false;
                    break;
                }
            }
        }
        if(Symmetry==true){
            System.out.println("The matrix is symmetric!");
        }
        else{
            System.out.println("The matrix is not symmetric!");
        }
    }

    public void Diagonal(int arr[][])
    {
        int Sum=0;
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length;j++)
            {
                if(i==j){
                    Sum +=arr[i][j];
                }
            }
        }
        System.out.println("The Sum of main diagonal is: "+Sum);
    }

    public void SecDiagonal(int arr[][])
    {
        int SecSum=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i+j==arr.length-1){
                    SecSum += arr[i][j];
                }
            }
        }
        System.out.println("The Sum of secondary diagonal is: "+SecSum);
    }
    
    public void EvOd(int arr[][])
    {
        int Ecount=0;
        int Ocount=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]%2==0){
                    Ecount++;
                }
                else
                    if(arr[i][j]%2!=0){
                        Ocount++;
                    }
            }
        }
        System.out.println("Total Even values: "+Ecount);
        System.out.println("Total Odd values: "+Ocount);
    }

    public void PoNe(int arr[][])
    {
        int zero=0;
        int Pcount=0;
        int Ncount=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>0){
                    Pcount++;
                }
                else
                    if(arr[i][j]<0){
                        Ncount++;
                    }
                else 
                    if(arr[i][j]==0){
                    zero++;
                }
            }
        }
        System.out.println("Total Positive values: "+Pcount);
        System.out.println("Total Negative values: "+Ncount);
        System.out.println("Total Zero values: "+zero);
    }
}

public class P18_matrixproperties {
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
        Calculation C = new Calculation();
        C.IdentityMatrix(arr);
        C.symmetry(arr);
        C.Diagonal(arr);
        C.SecDiagonal(arr);
        C.EvOd(arr);
        C.PoNe(arr);
        sc.close();
    }
}