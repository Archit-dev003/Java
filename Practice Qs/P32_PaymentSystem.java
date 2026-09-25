import java.util.Scanner;

class Payment
{
    private String customerName;
    private double amount;

    Payment(String customerName, double amount)
    {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public double getAmount()
    {
        return amount;
    }

    void ProcessPayment()
    {
        System.out.print("Customer: "+customerName);
        System.out.print("Amount: "+amount);
    }
}

class CreditCardPayment extends Payment
{
    private long cardNumber;

    CreditCardPayment(String customerName,double amount, long cardNumber)
    {
        super(customerName,amount);
        this.cardNumber = cardNumber;
    }

    public long getCardNumber()
    {
        return cardNumber;
    }

    @Override 
    void ProcessPayment()
    {
        System.out.println("Processing Credit Card Payment");
        System.out.println("Customer: "+ getCustomerName());
        System.out.println("Amount: "+ getAmount());
        System.out.println("Card Number: "+ cardNumber);
    }
}

class UPIPayment extends Payment
{
    private long upiId;

    UPIPayment(String customerName,double amount, long upiId)
    {
        super(customerName, amount);
        this.upiId = upiId;
    }

    public long getUpiId()
    {
        return upiId;
    }

    void ProcessPayment()
    {
        System.out.println("Processing UPI Payment");
        System.out.println("Customer: "+getCustomerName());
        System.out.println("Amount: "+getAmount());
        System.out.println("UPI ID: "+upiId);
    }
}

public class P32_PaymentSystem {
    public static void main(String[] args) {
        
        System.out.print("Number of Payments: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Payment P[] = new Payment[input];

        for(int i=0; i<P.length; i++)
        {
            System.out.print("Type: ");
            int Type = sc.nextInt();
            if(Type == 1)
            {
                System.out.print("Customer: ");
                String customer = sc.next();
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                System.out.print("Card Number: ");
                long cardNumber = sc.nextInt();

                P[i] = new CreditCardPayment(customer, amount, cardNumber);
                System.out.println();
            }
            else if(Type == 2)
            {
                System.out.print("Customer: ");
                String customer = sc.next();
                System.out.print("Amount: ");
                double amount = sc.nextDouble();
                System.out.print("UPI ID: ");
                long upiId = sc.nextInt();

                P[i] = new UPIPayment(customer, amount, upiId);
                System.out.println();
            }
        }

        for(int i=0; i<P.length; i++)
        {
           P[i].ProcessPayment();
           System.out.println();
        }
        sc.close();
    }    
}
