import java.util.Scanner;

public class P16_StringBuilder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("First name: ");
        String input = sc.nextLine();

        System.out.println("Last Name: ");
        String input2 = sc.nextLine();

        System.out.println("Age: ");
        String input3 = sc.nextLine();
        
        System.out.println("City: ");
        String input4 = sc.nextLine();

        StringBuilder sb = new StringBuilder("My name is ");
        sb.append(input);
        sb.append(" ");
        sb.append(input2);
        sb.append( ", i am ");
        sb.append(input3);
        sb.append(" years old and i live in ");
        sb.append(input4);
        // sb.append(", Nice to meet you! ");
        sb.append(" Welcome!");

        System.out.println(sb);
        sc.close();
    }    
}
