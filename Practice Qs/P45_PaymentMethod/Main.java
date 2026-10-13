import java.util.Scanner;

interface Payment {

    void deposit(double amount);
    void withdraw(double amount);

}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Payment P = new Payment() {
            @Override
            public void deposit(double amount) {
                
            }
            @Override
            public void withdraw(double amount) {
                
            }
        };

        int input = 0;
        while(input !=4)
        {
            
            System.out.println("Enter the payment method");
            System.out.println("1. Cash");
            System.out.println("2. Credit Card");
            System.out.println("3. UPI");
            System.out.println("4. Exit");

            System.out.println();
            input = sc.nextInt();
            System.out.println();
            
            double balance;
            switch (input) {
                
                case 1:
                    System.out.print("Enter a Initial amount: ");
                    balance = sc.nextDouble();
                    P = new Cash(balance);
                    break;
                case 2: 
                    System.out.print("Enter a Initial amount: ");
                    balance = sc.nextDouble();
                    System.out.print("Enter Card Number: ");
                    long CreditCard = sc.nextLong();

                    P = new CreditCard(balance, CreditCard);
                    break;
                case 3:
                    System.out.print("Enter a Initial amount: ");
                    balance = sc.nextDouble();
                    System.out.print("Enter UPI ID: ");
                    String UPIID = sc.next();
                    P = new UPI(UPIID,balance);
                    break;
                case 4:
                    System.out.println("Session Terminated!");
                    
                    break;
                default:
                    System.out.println("Enter invalid value!");
                    System.out.println();
                    break;
            }

            if(input<4)
            {
                int input2 = 0;
                do {
                    System.out.println("Select a method:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Exit");

                    input2 = sc.nextInt();

                    switch (input2) {
                        case 1:
                            System.out.println();
                            System.out.print("Enter the amount: ");
                            double amount = sc.nextDouble();
                            P.deposit(amount);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println();
                            System.out.print("Enter the amount: ");
                            amount = sc.nextDouble();
                            P.withdraw(amount);
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Session Terminated!");
                            break;
                        default:
                            System.out.println("invalid Input!");
                            break;
                    }
                } while (input2 != 3);
            }
            
        }
        sc.close();
    }
}
