import java.util.Scanner;

class College
{
    private static String College;
    private String Name;
    private int Marks;

    public void SetCollege(String college)
    {
        College = college;
    }

    College(String Name,int Marks)
    {
        this.Name=Name;
        this.Marks=Marks;

    }

    public static String getCollege() {
        return College;
    }
    String GetName()
    {
        return Name;
    }
    int GetMarks()
    {
        return Marks;
    }
}
public class P21_College {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num of students: ");
        int input = sc.nextInt();

        String name;
        int marks;
        String Clgname;
        College[] C = new College[input];
        
        for(int i=0; i<C.length; i++)
        {
            System.out.print("Enter the name: ");
            name = sc.next();

            System.out.print("Enter the marks: ");
            marks = sc.nextInt();

            C[i] = new College(name,marks);
            
            System.out.print("Enter the College name: ");
            Clgname = sc.next();
            C[i].SetCollege(Clgname);
        }
        

        for(int i=0; i<C.length; i++)
        {
            System.out.println(C[i].GetName()+" : "+C[i].GetMarks()+" : "+College.getCollege());
        }
        sc.close();
    }    
}
