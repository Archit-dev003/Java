import java.util.Scanner;

class Vehicle
{
    private int vehicleNum;
    private int baseFair;
    private int finalFair;

    Vehicle(int vehicleNum, int baseFair)
    {
        this.vehicleNum = vehicleNum;
        this.baseFair = baseFair;
    }

    int getBaseFair()
    {
        return baseFair;
    }

    void setFinalFair(int finalFair)
    {
        this.finalFair = finalFair;
    }

    int getFinalFair()
    {
        return finalFair;
    }

    int getVehicleNum()
    {
        return vehicleNum;
    }

    void printDetails()
    {
        System.out.println("Vehicle Number: "+vehicleNum);
        System.out.println("Base Fair: "+baseFair);
    }
}

class Bus extends Vehicle
{
    private int seats;
    
    Bus(int vehicleNum, int baseFair, int seats)
    {
        super(vehicleNum, baseFair);
        this.seats = seats;

        if (baseFair > 0)
            setFinalFair(baseFair + 50);
    }

    @Override 
    void printDetails()
    {
        System.out.println("Vehicle Number: "+getVehicleNum());
        System.out.println("Type: Bus");
        System.out.println("Base Fair: "+getBaseFair());
        System.out.println("Seats: "+seats);
        System.out.println("Final Fair: "+getFinalFair());
    }

}

class Taxi extends Vehicle
{
    private int distance;

    Taxi(int vehicleNum, int baseFair, int distance)
    {
        super(vehicleNum, baseFair);
        this.distance = distance;

        if (baseFair > 0)
            setFinalFair(baseFair + 100);
    }

    @Override 
    void printDetails()
    {
        System.out.println("Vehicle Number: "+getVehicleNum());
        System.out.println("Type: Taxi");
        System.out.println("Base Fair: "+getBaseFair());
        System.out.println("Distance: "+distance);
        System.out.println("Final Fair: "+getFinalFair());
    }
}

public class P36_TransportManagement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of vehicles: ");
        int input = sc.nextInt();

        Vehicle V[] = new Vehicle[input];

        for(int i=0; i<V.length; i++)
        {
            System.out.println("Vehicle "+(i+1));
            System.out.print("Type (1. Bus 2. Taxi): ");
            int type = sc.nextInt();

            if(type == 1)
            {
                System.out.print("Enter the Vehicle Number: ");
                int vehicleNum = sc.nextInt();
                System.out.print("Enter the Base fair: ");
                int baseFair = sc.nextInt();
                System.out.print("Enter seats:");
                int seats = sc.nextInt();

                V[i] = new Bus(vehicleNum, baseFair, seats);
                System.out.println();
            }
                
            else if(type == 2)
            {
                System.out.print("Enter the Vehicle Number: ");
                int vehicleNum = sc.nextInt();
                System.out.print("Enter the Base fair: ");
                int baseFair = sc.nextInt();
                System.out.print("Enter Distance:");
                int distance = sc.nextInt();

                V[i] = new Taxi(vehicleNum, baseFair, distance);
                System.out.println();
            }
        }

        System.out.println("----Vehicle Details----");
        for(int i=0; i<V.length;i++)
        {
            V[i].printDetails();    
            System.out.println();
        }

        int index = 0;
        int max = V[0].getFinalFair();
        for(int i = 0; i<V.length; i++)
        {
            if(V[i].getFinalFair()>max)
            {
                max = V[i].getFinalFair();
                index = i;
            }
        }
        System.out.println("----Highest Fair----");
        V[index].printDetails();
        sc.close();
    }    
}
