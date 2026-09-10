public class P04_Operations {
    public static void main(String[] args) {
        
        //arithmatic op
        float f=3.5f;
        float e= 4.5f;
        double result = f*e;
        System.out.println(result);

        int a = 3;
        int op = a++; //Post increment = first fetch then increment
        // int op = ++a; //Pre increment = first increment then fetch
        System.out.println(op);

        //Relational op
        String val = "ke";
        String val2 = "k";
        System.out.println(val == val2);

        //logical op
        int b =2;
        int c=3;
        int k =5;
        boolean op2 = c<b || k>a;
        System.out.println(op2);
    }
}
