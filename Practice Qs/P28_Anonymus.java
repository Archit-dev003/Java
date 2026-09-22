class St
{
    St()
    {
        System.out.println("Student Created");
    }
    void dispaly()
    {
        System.out.println("hello from student");
    }
}
public class P28_Anonymus {
    public static void main(String[] args) {
        
        St S= new St();
        S.dispaly();
        new St().dispaly();
    }    
}
