import java.util.Scanner;

class Employee
{
    private String name;
    private double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public double getsalary(){
        return salary;
    }

    void displayEmployee(){

        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getsalary());
    }
}

class Developer extends Employee
{
    private String Language;

    Developer(String Language,String name, double salary)
    {
        super(name, salary);
        this.Language = Language;
    }

    public String getLang()
    {
        return Language;
    }

    void displayDev()
    {
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getsalary());
        System.out.println("Language: "+getLang());
        System.out.println();
    }
}

class SeniorDeveloper extends Developer
{
    private int Exp;
    private String Specialization;

    SeniorDeveloper(String Language,String name, double salary,int Exp, String Specialization)
    {
        super(Language,name,salary);
        this.Exp = Exp;
        this.Specialization = Specialization;
    }

    public int getExp()
    {
        return Exp;
    }

    public String getSpecialization()
    {
        return Specialization;
    }

    void displaySeniorDev()
    {
        System.out.println("Name: "+getName());
        System.out.println("Salary: "+getsalary());
        System.out.println("Language: "+getLang());
        System.out.println("Experience: "+getExp());
        System.out.println("Specialization: "+getSpecialization());
    }

}

public class P29_DevClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num of people: ");
        int input = sc.nextInt();

        SeniorDeveloper[] SD = new SeniorDeveloper[input];

        for(int i=0; i<SD.length;i++)
        {
            System.out.print("Enter the name: ");
            String name = sc.next();

            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter the language: ");
            String language = sc.next();

            System.out.print("Enter the Experience: ");
            int Exp = sc.nextInt();

            System.out.println("Enter the Specialization: ");
            String Sp = sc.next();

            SD[i] = new SeniorDeveloper(language, name, salary, Exp, Sp);
        }

        int index = 0;
        double max = SD[0].getsalary();

        for(int i=1;i<SD.length;i++)
        {
            if(SD[i].getsalary()>max)
            {
                index = i;
                max = SD[i].getsalary();
            }
        }

        for(int i=0; i<SD.length; i++)
        {
            SD[i].displaySeniorDev();
        }

        System.out.println("The Highest salary person: ");
        SD[index].displaySeniorDev();
        sc.close();
    }
}
