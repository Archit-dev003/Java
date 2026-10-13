
public class UPI implements Payment{
    
    private String UPIId;
    private double balance;

    public UPI(String UPIId, double balance) {
        this.UPIId = UPIId;
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
        }
        else if(amount == 0 || amount < 0)
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
        System.out.println("UPI Id: "+UPIId);
    }
}
