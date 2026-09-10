public class P03_Conversion {
    public static void main(String[] args) {
        
        byte a = 27;
        int b = a;  //Implicit = converion(Automatic)
        System.out.println(b);  //Valid

        int k = 29;
        // byte c = k;  //Not valid
        byte c = (byte)k;  //Explicit = casting(Manual)
        System.out.println(c);  //Valid

        int e = 267;
        byte n = (byte)e;  //conversion --> input % 256
        System.out.println(n);   //Valid

        float f = 8.3f;
        int m = (int)f; 
        System.out.println(m); // Valid


        //Type Promotion
        byte q = 10;
        byte w = 40;
        int result = q*w; //allowing out of range value of byte to iny is Type P.
        System.out.println(result);
    }
}
