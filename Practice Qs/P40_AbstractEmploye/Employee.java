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
