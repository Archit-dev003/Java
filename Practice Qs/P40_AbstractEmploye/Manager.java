class Manager extends Employee
{
    private double bonus=20;

    Manager(String name, double salary)
    {
        super(name, salary);
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
