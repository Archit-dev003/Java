import java.util.Scanner;

class BankAccount
{
    private double balance=10000;
    protected int accountNum;
    String branchName;
    public String holderName;

    BankAccount( int accountNum, String branchName, String holderName)
    {
        this.accountNum = accountNum;
        this.branchName = branchName;
        this.holderName = holderName;
    }

    public double getBalance()
    {
        return balance;
    }

    protected  void setBalance(double balance)
    {
        this.balance = balance;
    }

}

class SavingAccount extends BankAccount
{
    private int interest = 5;

    SavingAccount(int accountNum, String branchName, String holderName)
    {
        super(accountNum, branchName, holderName);
    }

    public int getInterest()
    {
        return interest;
    }

    double interestRate()
    {
        double calc = ((interest * getBalance()) / 100.0);
        return calc;
    }

    public void deposite(int deposite)
    {
        if(deposite>0)
        {
            setBalance(getBalance() + deposite);
            System.out.println("Done");
        }
        else{
            System.out.println("Enter a valid deposite");
        }
    }

    public void withdraw(int withdraw)
    {
        if(withdraw>0 && withdraw<=getBalance())
        {
            setBalance(getBalance() - withdraw);
            System.out.println("Done");
        }
        else{
            System.out.println("Enter a valid withdrawl");
        }
    }

    public void printStatus()
    {
        System.out.println("----Account Details----");
        System.out.println();
        System.out.println("Account Holder: "+holderName);
        System.out.println("Account Num: "+accountNum);
        System.out.println("Branch: "+branchName);
        System.out.println("Final Balance: "+getBalance());
        System.out.println("Interest: "+interestRate());
        System.out.println();
    }

    public void accountDisplay()
    {
        System.out.println(holderName);
    }
}

public class P35_BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----Welcome!----");
        System.out.println();
        System.out.print("Enter the number of account: ");
        int input = sc.nextInt();

        SavingAccount S[] = new SavingAccount[input];

        for(int i = 0; i < S.length; i++)
        {
            System.out.print("Enter holder name: ");
            String name = sc.next();

            System.out.print("Enter Account num: ");
            int accountNum = sc.nextInt();

            System.out.print("Enter branch: ");
            String branch = sc.next();
            
            S[i] = new SavingAccount(accountNum, branch, name);
            System.out.println();
            
        }

        int select = 1;
        while(select!=0)
        {
            System.out.println("Select the account to access!");
            for(int i=0; i<S.length; i++)
            {
                System.out.print(i+1+". ");
                S[i].accountDisplay();
            }

            select = sc.nextInt();
            
            System.out.println("Enter the num of operation to perform");
            System.out.println("1. Deposite");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");

            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter the amount of deposite: ");
                    int deposite = sc.nextInt();
                    S[select-1].deposite(deposite);
                    break;

                case 2:
                    System.out.print("Enter the amount of withdrawl: ");
                    int withdraw = sc.nextInt();
                    S[select-1].withdraw(withdraw);
                    break;

                case 3:
                    System.out.println("Interest amount: "+S[select-1].interestRate());
                    //S[select].interestRate();
                    break;

                case 4:
                    S[select-1].printStatus();
                    break;
                
                case 5:
                    select = 0;
                    break;

                default:
                    System.out.println("Enter a valid value!");
                    break;
            }
        }

        for(int i=0; i<S.length; i++)
        {
            S[i].printStatus();
        }

        int index = 0;
        double max = S[0].getBalance();
        for(int i = 0; i<S.length; i++)
        {
            if(S[i].getBalance()>max)
            {
                max = S[i].getBalance();
                index = i;
            }
        }
        System.out.println("----Highest Balance----");
        S[index].printStatus();
        
        sc.close();
    }
}
