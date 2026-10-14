import java.util.Scanner;

public class P46_Wrapper {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a num: ");
    String S1 = sc.next();

    System.out.print("Enter a num: ");
    String S2 = sc.next();

    Integer n1 = Integer.parseInt(S1);
    Integer n2 = Integer.parseInt(S2);

    int num = n1;

    int big = Integer.compare(num, n2);
    
    if(big>0)
    {
        System.out.println("Larger value: "+num);
    }
    else if(big<0)
    {
        System.out.println("Larger value: "+n2);
    }
    else if(big==0)
    {
        System.out.println("Both are equal");
    }

    int sum = num+n2;
    System.out.println("Sum: "+sum);

    System.out.println("Sum in string: "+String.valueOf(sum));

    sc.close();
  }  
}
