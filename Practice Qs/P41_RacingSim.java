abstract class Vehicle
{
    private String name;
    private int speed;
    private int fuel;
    private int distance;

    public Vehicle(String name, int speed, int fuel, int distance) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.distance = distance;
    }

    abstract boolean accelerate();

    public void displayStatus()
    {
        System.out.println(name+" -> "+distance+"m | "+"fuel: "+fuel);
    }

    protected void addDistance()
    {
        distance += speed;
    }

    protected boolean fuelReduce(int amount)
    {
        if(fuel-amount>=0)
        {
            fuel -= amount;
            System.out.println("Acceleration continue...");
            return true;
        }
        else{
            return false;
        }
    }

    abstract int getAmount();

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }
    
}

class SportsCar extends Vehicle
{
    private int amount = 20;

    SportsCar(String name, int speed, int fuel, int distance)
    {
        super(name, speed, fuel, distance);
        
    }

    @Override
    public void displayStatus()
    {
        System.out.println(getName()+" -> "+getDistance()+"m | "+"fuel: "+getFuel());
    }

    @Override 
    public int getAmount()
    {
        return amount;
    }

    @Override
    boolean accelerate() {
        if(fuelReduce(amount)==true)
        {
            addDistance();
            return true;
        }
        return false;
    }

}

class Truck extends Vehicle
{
    private int amount = 30;

    Truck(String name, int speed, int fuel, int distance)
    {
        super(name, speed, fuel, distance);
        
    }

    @Override
    public void displayStatus()
    {
        System.out.println(getName()+" -> "+getDistance()+"m | "+"fuel: "+getFuel());
    }

    @Override 
    public int getAmount()
    {
        return amount;
    }

    @Override
    boolean accelerate() {
        if(fuelReduce(amount)==true)
        {
            addDistance();
            return true;
        }
        return false;
    }

}

class Bike extends Vehicle
{
    private int amount = 15;

    Bike(String name, int speed, int fuel, int distance)
    {
        super(name, speed, fuel, distance);
        
    }

    @Override
    public void displayStatus()
    {
        System.out.println(getName()+" -> "+getDistance()+"m | "+"fuel: "+getFuel());
    }

    @Override 
    public int getAmount()
    {
        return amount;
    }

    @Override
    boolean accelerate() {
        if(fuelReduce(amount)==true)
        {
            addDistance();
            return true;
        }
        return false;
    }

}
public class P41_RacingSim {
    public static void main(String[] args) {

        Vehicle V[] = new Vehicle[3];

        V[0] = new SportsCar("Audi", 130, 100, 10);
        V[1] = new Truck("Truck", 80, 100, 10);
        V[2] = new Bike("Bike", 100, 100, 10);
        
        for(int i=0; i<V.length; i++)
        {
            for(int round=0; round<=10; round++)
            {
                if(!V[i].accelerate())
                {
                    System.out.println("Not enough fuel");
                    V[i].displayStatus();
                    break;
                }
            }
            System.out.println();
        } 
        sc.close();
    }
}
