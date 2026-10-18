class Value
{
    void print(int n)
    {
        if (n > 0)
        {
            System.out.print(n+ " ");
            print(n);
        }
    }
}

public class P22_Recursion_Nto1 {
    public static void main(String[] args) {
        new Value().print(5);
    }
}
