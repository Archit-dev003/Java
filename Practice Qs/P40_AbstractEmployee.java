abstract class Employee
{
    private String name;
    private double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    abstract void calculateBonus();

    void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        
    }
}

class Developer extends Employee
{
    private double bonus=10;
    Developer(String name, double salary, double bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }
    
    void displayDetails() {
        System.out.println("Name :"+getName());
        System.out.println("Salary: "+getSalary());
    }

    double calc;
    @Override 
    void calculateBonus() {
        
        bonus = getSalary()*bonus/100;
        System.out.println("Bonus: "+bonus);
    }
    double getBonus()
    {
        return bonus;
    }

}
class Manager extends Employee
{
    private double bonus;

    Manager(String name, double salary, double bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }

    void displayDetails() {
        System.out.println("Name :"+getName());
        System.out.println("Salary: "+getSalary());
        System.out.println("Bonus : "+bonus);
    }

    double calc;
    @Override
    void calculateBonus() {
        
        bonus = getSalary()*bonus/100;
        System.out.println("Bonus: "+bonus);
    }
        
}

public class P40_AbstractEmployee {
    public static void main(String[] args) {
        Employee E = new Developer("joy", 200000,10);
        E.calculateBonus();
        E.displayDetails();
        Employee E2 = new Manager("Joy2", 400000,20);
        E2.calculateBonus();
        E2.displayDetails();
    }    
}
