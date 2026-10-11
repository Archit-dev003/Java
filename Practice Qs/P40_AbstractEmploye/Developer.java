class Developer extends Employee
{
    private double bonus=10;
    
    Developer(String name, double salary)
    {
        super(name, salary);
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

}
