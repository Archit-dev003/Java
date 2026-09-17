import java.util.Scanner;

public class P14_String {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.print("Enter a Char: ");
        String Char = sc.nextLine();


        int L =input.length();

        System.out.println("Length: "+L);
        System.out.println("0th Char: "+input.charAt(0));
        System.out.println("Last Char: "+input.charAt(L-1));
        
        if(Char.isEmpty()){
                System.out.println("Empty target!");
                sc.close();
                return;
            }

        int Count=0;
        for (char x : input.toCharArray()) {
            
            if(x == Char.charAt(0))
            {
                Count++;
            }
        }
        if(Count == 0){
            System.out.println("Value Dosen't exist!");
        }
        else{
        System.out.println("Count: "+Count);
    }
    sc.close(); 
    }

}
