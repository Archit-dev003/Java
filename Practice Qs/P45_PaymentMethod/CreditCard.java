
public class CreditCard implements Payment{
    
    private double balance;
    private long CardNumber;

    CreditCard(double balance, long CardNumber)
    {
        this.balance = balance;
        this.CardNumber = CardNumber;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println();
            System.out.println("$"+amount+ " added successfully!");
        }
        else if(amount <= 0)
        {
            System.out.println("Enter a Valid value!");
        }
        System.out.println();
        System.out.println("Balance : $"+balance);
    }

    public void withdraw(double amount)
    {
        if(amount <= balance && amount > 0)
        {
            balance -= amount;
            System.out.println();
            System.out.println("$"+amount+" withdraw successfully!");
        }
        else if(amount <= 0)
        {
            System.out.println();
            System.out.println("Enter a valid value!");
        }
        else if(amount > balance)
        {
            System.out.println();
            System.out.println("Not enough balance!");
        }
        System.out.println();
        System.out.println("Balance : $"+balance);
        System.out.println("Card Number: "+CardNumber);
    }
}
