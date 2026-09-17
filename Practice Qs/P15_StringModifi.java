import java.util.Scanner;

public class P15_StringModifi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String Sentence = sc.nextLine();

        String ModiSent=Sentence.replace(" ", "-");
        System.out.println("Original: "+Sentence); 
        System.out.println("Modified: "+ModiSent); 
        System.out.println("Original Length: "+Sentence.length()); 
        System.out.println("Modifed Length: "+ModiSent.length()); 
        System.out.println("Equals: "+Sentence.equals(ModiSent));
        sc.close();
    }
}
