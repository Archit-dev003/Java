package P55_SubscriptionPlan;

enum Plan {

    BASIC(199),
    STANDARD(399),
    PREMIUM(699);

    private final int price;

    Plan(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Subscription {
    
    private Plan P;

    Subscription(Plan P)
    {
        this.P = P;
    }

    public void getValue(int month)
    {
        int value = P.getPrice()*month;
        System.out.println("Monthly price: Rs. "+P.getPrice());
        System.out.println("Total Price: Rs. "+value);
    }
}
