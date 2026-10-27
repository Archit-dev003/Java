interface Machine
{
    public String start();
}

class Appliance implements Machine
{
    String name;
    
    Appliance(String name)
    {
        this.name = name;
    }

    @Override
    public String start() {
        return null;
    }
}

class Fan extends Appliance
{
    Fan(String name)
    {
        super(name);
    }
    
    @Override
    public String start()
    {
        System.out.println("Fan is running");
        return null;
    }
}

class WashingMachine extends Appliance
{
    WashingMachine(String name)
    {
        super(name);
    }
    
    @Override
    public String start()
    {
        System.out.println("WashingMachine is operating");
        return null;
    }
}

public class P54_Exercise {
    public static void main(String[] args) {
        Machine fan = new Fan("Fan");
        fan.start();
        Machine washingMachine = new WashingMachine("WashingMachine");
        washingMachine.start();
    }
}
