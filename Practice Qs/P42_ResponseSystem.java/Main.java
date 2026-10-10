import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        EmergencyService[] ES = new EmergencyService[3];

        System.out.println("========================================");
        System.out.println("      EMERGENCY RESPONSE SYSTEM      ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Enter emergency type:");
        System.out.println("1. Fire");
        System.out.println("2. Medical");
        System.out.println("3. Police");

        System.out.print("Enter choice: ");
        String input = sc.next();
        System.out.println("Enter location: ");
        String loaction = sc.next();
        System.out.println("Enetr Priority: ");
        String priority = sc.next();

        Emergency E = new Emergency(input, loaction, priority);
        int inputVal=0;
        if(input.equals("Fire"))
        {
            ES[0] = new Fire();
            inputVal = 1;
        }
        else if(input.equals("Medical"))
        {
            ES[1] = new Medical();
            inputVal = 2;
        }
        else if(input.equals("Police"))
        {
            ES[2] = new Police();
            inputVal = 3;
        }

        System.out.println("========================================");
        System.out.println("             EMERGENCY MENU             ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("1. Dispatch Unit");
        System.out.println("2. Start Response");
        System.out.println("3. Resolve Emergency");
        System.out.println("4. View Details");
        System.out.println("5. Exit");
        System.out.println();

        System.out.print("Enter Choice: ");
        int input2 = 0;

        while(input2!=5)
        {
            input2 = sc.nextInt();    
            switch (input2) {
                case 1:
                    ES[inputVal].dispatch(E);
                    break;
                case 2: 
                    ES[inputVal].response(E);
                    break;
                case 3:
                    ES[inputVal].resolve(E);
                case 4: 
                    E.displayDetails();
                case 5:
                    input2 = 5;
                default:
                    System.out.println("Enter a valid value!");
                    break;
            }
        }
        sc.close();
    }
}
