class Value
{
    void print(int n, int current)
    {
        if (n >= current)
        {
            System.out.print(current + " ");
            print(n, current + 1);
        }
    }
}

public class P21_Recursion_1toN {
    public static void main(String[] args) {
        new Value().print(5, 1);
    }
}
