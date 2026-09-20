import java.util.Scanner;
class Constructor
{
    private String product;
    private int price;
    private int quantity;

    Constructor()
    {
        product="ROG";
        price=90000;
        quantity=2;
    }
    Constructor(String product,int price,int quantity)
    {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public int GetTotal()
    {
        return price*quantity;
    }

}
public class P23_CDecisionProb {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product: ");
        String product = sc.next();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        Constructor C = new Constructor();
        Constructor C2 = new Constructor(product,price,quantity);

        System.out.println(C2.getProduct()+" : "+C2.getPrice()+" : "+C2.getQuantity());
        System.out.println("Total Value: "+C2.GetTotal());
        sc.close();
    }
}
