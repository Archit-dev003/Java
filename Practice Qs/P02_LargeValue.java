public class P02_LargeValue {
    public static void main(String[] args) {
        
        int a = 2;
        int b = 3;
        int c = 3;

        if(a>=b && a>=c)
            System.out.println("Greater: "+a);
        else if(b>=a && b>=c)
            System.out.println("Greater: "+b);
        else if(c>=a && c>=b)
            System.out.println("Greater: "+c);
    }
}
