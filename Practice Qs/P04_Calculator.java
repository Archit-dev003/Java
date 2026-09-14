public class P04_Calculator {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 

        
        while(again=="y")
        {
            if(operator=='+')
            {
                double Result=num1+num2;
                System.out.println("Result: "+Result);
                System.out.println("Thank you for using the calculator.");
                again="n";
            }
            else if(operator=='-')
            {
                double Result=num1-num2;
                System.out.println("Result: "+Result);
                System.out.println("Thank you for using the calculator.");
                again="n";
            }
            else if(operator=='*')
            {
                double Result=num1*num2;
                System.out.println("Result: "+Result);
                System.out.println("Thank you for using the calculator.");
                again="n";
            }
            else if(operator=='/')
            {
                double Result=num1/num2;
                System.out.println("Result: "+Result);
                System.out.println("Thank you for using the calculator.");
                again="n";
            }
        }

        
    }
}
