package P51_Order;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter OrderStatus ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Status: ");
        String Status = sc.next().toUpperCase();

        try {
            OrderStatus status = OrderStatus.valueOf(Status);

            Order O = new Order(id);
            O.setOrderStatus(status);
            O.getStatus();
        }
         catch (Exception e) {
            System.out.println("Invalid OrderStatus status!");
        }
        
        sc.close();
    }
}
