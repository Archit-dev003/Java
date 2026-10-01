class Marks
{
    int marks;
}

public class P03_Function_Ref {
    static void ChangeMarks(Marks m)
    {
        m.marks = 100;
    }
    public static void main(String[] args) {
        Marks M = new Marks();
        M.marks = 50;
        
        System.out.println(M.marks);

    }
}
