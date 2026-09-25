class Vehicle
{
    private String Brand;
    public void start()
    {
        System.out.println("Vehicle Start");
    }
    
    public String getBrand()
    {
        return Brand;
    }
}

class Car extends Vehicle
{
    int seat;
    @Override 
    public void start()
    {
        System.out.println("Car Start");
    }
}

class Bike extends Vehicle
{
    Boolean HaveGear;
    @Override 
    public void start()
    {
        System.out.println("Bike Start");
    }
}

public class P31_Polymorphism {
    public static void main(String[] args) {
        
        Vehicle V[] = new Vehicle[4];
        V[0] = new Bike();
        V[1] = new Car();
        V[2] = new Bike();
        V[3] = new Car();

        for(int i = 0; i<V.length; i++)
        {
            V[i].start();
        }
    }    
}
