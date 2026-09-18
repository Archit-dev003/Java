import java.util.Scanner;

class Student
{
    private int Marks;
    private String Name;

    
    Student(int Marks, String Name)
    {
        this.Marks = Marks;
        this.Name = Name;
    }


    public int getMarks() {
        return Marks;
    }   

    public String getName() {
        return Name;
    }
 
}

public class P20_StudentManagement {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int value = sc.nextInt();
        Student[] St = new Student[value];

        String Name;
        int Marks;

        for(int i=0; i<St.length; i++)
        {
            System.out.print("Enter the name of students: ");
            Name=sc.next();
            System.out.print("Enter the marks of students: ");
            Marks=sc.nextInt();
            St[i] = new Student(Marks, Name);
        }
        
        for(int i=0; i<St.length; i++)
        {
            System.out.println(St[i].getName()+" : "+St[i].getMarks());
        }
        sc.close();
    }        
}