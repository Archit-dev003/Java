import java.util.Scanner;

class Vehicle
{
    private String Brand;
    private double Price;

    Vehicle(String Brand, double Price)
    {
        this.Brand = Brand;
        this.Price = Price;
    }

    public String getBrand()
    {
        return Brand;
    }

    public double getPrice()
    {
        return Price;
    }

    void display()
    {
        System.out.println("Brand: "+Brand);
        System.out.print("Price: "+Price);
        System.out.println();
    }
}

class Car extends Vehicle
{
    private int Seats;

    Car(String Brand, double Price, int Seats)
    {
        super(Brand, Price);
        this.Seats = Seats;
    }

    public int getSeats()
    {
        return Seats;
    }

    @Override 
    void display()
    {
        
        super.display();
        System.out.println("Seats: "+Seats);
        System.out.println();
    }
}

public class P30_CarOverride {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of Brands: ");
        int input = sc.nextInt();
        
        Car C[] = new Car[input];
        for(int i = 0;i<C.length;i++)
        {
            System.out.print("Enter the Brand: ");
            String Brand = sc.next();
            System.out.print("Enter the Price: ");
            double Price = sc.nextDouble();
            System.out.print("Seats: ");
            int Seats = sc.nextInt();

            C[i] = new Car(Brand, Price, Seats);
        }
        for(int i = 0; i<C.length; i++)
        {
            C[i].display();
        }
    }
}
