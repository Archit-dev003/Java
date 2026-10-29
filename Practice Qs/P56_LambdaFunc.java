import java.util.Scanner;

@FunctionalInterface 
interface TextProcessor
{
    public void process(String text);
}

public class P56_LambdaFunc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        System.out.println("Choose Operation:");
        System.out.println("1. Uppercase");
        System.out.println("2. Remove Whitespace");
        System.out.println("3. Reverse");

        System.out.println();
        System.out.print("Enter operation: ");
        int operation = sc.nextInt();

        TextProcessor uppercase = (text) -> 
        {
                String output;
                output = text.toUpperCase();
                System.out.println(output);         
        };
            
        TextProcessor removeWhitespace = (text) ->
        {
            String output;
            output = text.replaceAll(" ", "");
            System.out.println(output);
        };
        
        TextProcessor reverse = (text) ->
        {
            StringBuilder S = new StringBuilder(text);
            System.out.println(S.reverse());
        };
        
        switch (operation) {
                    case 1:
                        uppercase.process(input);
                        break;
                    case 2:
                        removeWhitespace.process(input);
                        break;
                    case 3:
                        reverse.process(input);
                        break;
                    default:
                        System.out.println("Enter a valid opeartion!");
                        break;
                }

        sc.close();
        
    }
}
