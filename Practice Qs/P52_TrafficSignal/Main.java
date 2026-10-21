import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light: ");
        String signal = sc.next().toUpperCase();
        
        try {
            TrafficSignal Signal = TrafficSignal.valueOf(signal);

            Traffic T = new Traffic(Signal);
            T.getSignal();
        }

        catch (Exception e) {
           System.out.println("Enter a valid signal");
        }

        sc.close();
    }
}
