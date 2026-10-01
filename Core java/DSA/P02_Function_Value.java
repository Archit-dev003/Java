public class P02_Function_Value {
    static void change(int x)
    {
        x = 30;
    }
    public static void main(String[] args) {
        int a = 330;
        change(a);
        System.out.println(a);
    }
}
