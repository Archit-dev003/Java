class Student
{
    private static String Sname;
    private String Name;
    
    Student(int id)
    {
        System.out.println("Student Created");
    }
    static 
    {
        System.out.println("Student class loaded");
    }

    public static String getSname() {
        return Sname;
    }

    public String getName() {
        return Name;
    }

    public void setSname(String Sname)
    {
        this.Sname = Sname;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }
}
public class P27_StaticBlock {
    public static void main(String[] args) {
        
        Student S = new Student(1);
        S.setName("joy");
        S.setSname("Oxford");
        System.out.println(S.getName()+" : "+S.getSname());
        Student S2 = new Student(2);
        S2.setName("joy2");
        S2.setSname("Oxford2");
        System.out.println(S2.getName()+" : "+S2.getSname());
    }    
}
