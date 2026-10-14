import java.util.Scanner;

public class P48_NumFrequency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter total num: ");
        int input = sc.nextInt();

        int arr[] = new int[input];

        for(int i=0; i<input; i++)
        {
            System.out.print("Enter value: ");
            arr[i] = sc.nextInt();
        }
        
        boolean visit[] = new boolean[input];

        for(int i=0; i<input; i++)
        {
            int count = 0;
            for(int j=0; j<input; j++)
            {
                if(arr[i]==arr[j] && !visit[j])
                {
                    count++;
                    visit[j] = true;
                }
            }

            if(visit[i] && count>0)
            {
                System.out.println(arr[i]+" has frequency of "+count);
                System.out.println();
            }
        }
        sc.close();
    }
}
