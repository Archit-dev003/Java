import java.util.Scanner;

class Employee
{
    private double salary;
    String department;
    protected int employeeID;
    public String name;

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    void information()
    {
        System.out.println("Name: "+name);
        System.out.println("EmployeeID: "+employeeID);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }

}

public class P33_EmployeeAccessControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();

        Employee E[] = new Employee[input];

        for(int i=0; i<E.length; i++)
        {
            E[i] = new Employee();
            System.out.print("Enter Name: ");
            String name = sc.next();
            E[i].name = name;

            System.out.print("Enter EmployeeID: ");
            int employeeID = sc.nextInt();
            E[i].employeeID = employeeID;

            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();
            E[i].setSalary(salary);
            
            System.out.print("Enter Department: ");
            String department = sc.next();
            E[i].department = department;
        }

        for(int i=0; i<E.length; i++)
        {
            E[i].information();
            System.out.println();
        }
        sc.close();
    }
}