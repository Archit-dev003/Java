public class p05_Condition {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;
        int c = 7;

        if(a>b && a>c)
            System.out.println("Greater value: "+a);

        else if(b>a && b>c)
            System.out.println("Greater Value: "+ b);
        
        else if(c>a && c>b)
            System.out.println("Greater value: "+ c);
    }
}
