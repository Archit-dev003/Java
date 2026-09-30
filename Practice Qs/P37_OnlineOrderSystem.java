import java.util.Scanner;

class Order
{
    private int orderID;
    private String cusID;
    private double baseAmount;
    private double finalFair;

    Order(int orderID, String cusID, double baseAmount)
    {
        this.baseAmount = baseAmount;
        this.cusID = cusID;
        this.orderID = orderID;
    }

    void setFinalFair(double finalFair)
    {
        this.finalFair = finalFair;
    }

    public double getFinalFair() {
        return finalFair;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getCusID() {
        return cusID;
    }

    public double getBaseAmount() {
        return baseAmount;
    }
    
    void calcPrice()
    {

    }
    void printDetails()
    {

    }
}

class Regular extends Order
{
    Regular(int orderID, String cusID, double baseAmount)
    {
        super(orderID, cusID, baseAmount);
    }

    @Override 
    void calcPrice()
    {
        setFinalFair(getBaseAmount()+50);
    }

    @Override 
    void printDetails()
    {
        System.out.println("Order ID: "+getOrderID());
        System.out.println("Customer: "+getCusID());
        System.out.println("Type: Regular");
        System.out.println("Base Amount: "+getBaseAmount());
        System.out.println("Final Amount: "+getFinalFair());
    }
}

class Express extends Order
{
    Express(int orderID, String cusID, double baseAmount)
    {
        super(orderID, cusID, baseAmount);
    }
    @Override 
    void calcPrice()
    {
        setFinalFair(getBaseAmount()+150);
    }

    @Override 
    void printDetails()
    {
        System.out.println("Order ID: "+getOrderID());
        System.out.println("Customer: "+getCusID());
        System.out.println("Type: Express");
        System.out.println("Base Amount: "+getBaseAmount());
        System.out.println("Final Amount: "+getFinalFair());
    }
}

class Premium extends Order
{
    Premium(int orderID, String cusID, double baseAmount)
    {
        super(orderID, cusID, baseAmount);
    }

    @Override 
    void calcPrice()
    {
        setFinalFair(getBaseAmount()-(getBaseAmount()*(0.1)));
    }

    @Override 
    void printDetails()
    {
        System.out.println("Order ID: "+getOrderID());
        System.out.println("Customer: "+getCusID());
        System.out.println("Type: Premium");
        System.out.println("Base Amount: "+getBaseAmount());
        System.out.println("Final Amount: "+getFinalFair());
    }
}

public class P37_OnlineOrderSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of order: ");
        int input = sc.nextInt();

        Order O[] = new Order[input];

        for(int i=0; i<O.length; i++)
        {
            System.out.println("Order "+(i+1));
            System.out.print("Type (1-Regular, 2-Express, 3-Premium): ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Order ID: ");
                    int orderID = sc.nextInt();
                    System.out.print("Customer ID: ");
                    String cusID = sc.next();
                    System.out.print("Base Amount: ");
                    double baseAmount = sc.nextDouble();
                    
                    O[i] = new Regular(orderID, cusID , baseAmount);
                    O[i].calcPrice();
                    break;
                case 2:
                    System.out.print("Order ID: ");
                    orderID = sc.nextInt();
                    System.out.print("Customer ID: ");
                    cusID = sc.next();
                    System.out.print("Base Amount: ");
                    baseAmount = sc.nextDouble();

                    O[i] = new Express(orderID, cusID , baseAmount);
                    O[i].calcPrice();
                    break;
                case 3:
                    System.out.print("Order ID: ");
                    orderID = sc.nextInt();
                    System.out.print("Customer ID: ");
                    cusID = sc.next();
                    System.out.print("Base Amount: ");
                    baseAmount = sc.nextDouble();

                    O[i] = new Premium(orderID, cusID , baseAmount);
                    O[i].calcPrice();
                    break;
                
                default:
                    System.out.println("Enter valid details!");
                    break;
            }
        }

        double fair=0;

        for(int i=0; i<O.length; i++)
        {
           fair += O[i].getFinalFair();
        }

        System.out.println();
        System.out.println("========== ORDER DETAILS ==========");
        System.out.println();

        for(int i=0; i<O.length; i++)
        {
           O[i].printDetails();
           System.out.println();
        }
        System.out.println("========== SUMMARY ==========");
        System.out.println();
        System.out.print("Total Revenue: "+fair);
        System.out.println();

        double min = O[0].getFinalFair();
        int index = 0;

        for (int i = 0; i < O.length; i++) {
            if(O[i].getFinalFair()<min)
            {
                min = O[i].getFinalFair();
                index = i;
            }
        }
        
        System.out.println();
        System.out.println("Lowest Order: ");
        O[index].printDetails();
        try {
            Thread.sleep(1000);
            System.out.println("Program ended!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        sc.close();
    }    
}
