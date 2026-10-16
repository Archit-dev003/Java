import java.util.Scanner;

public class P19_Divisor {

    public static void main(String[] args) {

        int n,count=0;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                arr[count]=i;
                count++;
            }
        }

        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
