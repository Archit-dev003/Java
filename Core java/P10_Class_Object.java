class Calculation
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public double add(int n1,double n2)
    {
        return n1+n2;
    }

    public String Output()
    {
        return "Done";
    }
}

public class P10_Class_Object {
    public static void main(String[] args) {
        
        int n1=4;
        int n2=5;

        //C is a reference variable
        Calculation C = new Calculation();
        System.out.println(C.add(n1,n2));
        C.Output();
    }
}
