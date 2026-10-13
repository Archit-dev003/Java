
public class Cash implements Payment{

    private double balance;

    Cash(double balance)
    {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println();
            System.out.println("$"+amount+ " added successfully!");
        }
        else if(amount == 0 || amount < 0)
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
            System.out.println();
            System.out.println("Balance : $"+balance);
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
    }
}
