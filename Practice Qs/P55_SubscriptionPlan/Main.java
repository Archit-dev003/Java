package P55_SubscriptionPlan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Plans:");
        System.out.println("BASIC - Rs. 199/month");
        System.out.println("STANDARD - Rs. 399/month");
        System.out.println("PREMIUM - Rs. 699/month");
        System.out.println();
        System.out.print("Enter subscription plan: ");
        String input = sc.next().toUpperCase();
        System.out.print("Enter months: ");
        int month = sc.nextInt();

        try {
            Plan P = Plan.valueOf(input);
            Subscription S = new Subscription(P);

            System.out.println();

            System.out.println("Selected Plan: "+input);
            S.getValue(month);
            
        } 
        catch (IllegalArgumentException E) {
            System.out.println("Enter a valid plan name!");
        }

        sc.close();
    }
}
