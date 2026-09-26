import java.util.Scanner;

class Employee
{
    private double salary;
    protected int employeeID;
    public String name;

    Employee(double salary,int employeeID,String name)
    {
        this.salary = salary;
        this.employeeID = employeeID;
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }
}

class Manager extends Employee
{
    int teamSize;

    Manager(double salary,int employeeID,String name,int teamSize)
    {
        super(salary,employeeID,name);
        this.teamSize = teamSize;
    }

    void displayManagerDetails()
    {
        System.out.println("---Manager Details---");
        System.out.println("Name: "+name);
        System.out.println("Salary: "+getSalary());
        System.out.println("EmployeeID: "+employeeID);
        System.out.println("Team Size: "+teamSize);
    }
}

public class P34_ProtectedEmployee {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();

        Manager M[] = new Manager[input];
        for(int i=0; i<M.length; i++)
        {
            System.out.print("Enter the Name: ");
            String name = sc.next();
            System.out.print("Enter the salary: ");
            double salary  = sc.nextDouble();
            System.out.print("Enter the EmployeeID: ");
            int employeeID = sc.nextInt();
            System.out.print("Enter the Team Size: ");
            int teamSize = sc.nextInt();
            System.out.println();
            M[i] = new Manager(salary, employeeID, name, teamSize);
        }

        int index = 0;
        int max = M[0].teamSize;
        
        for(int i=0; i<M.length; i++)
        {
            if(M[i].teamSize>max)
            {
                max = M[i].teamSize;
                index = i;
            }
        }

        for(int i=0; i<M.length; i++)
        {
            M[i].displayManagerDetails();
            System.out.println();
        }

        System.out.println("Manager with highest team: ");
        M[index].displayManagerDetails();
         
        sc.close();
    }
    
}