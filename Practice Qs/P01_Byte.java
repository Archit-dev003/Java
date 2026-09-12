public class Byte {

    public static void main(String[] args) {
        
        int a = 130;
        byte b = (byte)a;
        System.out.println(b);

        //If The value obtained is less then 256 to % then we use 2's complement to convert it
        // 2's complement = inverse the int 8 bit code, then add 1 at the end
    }
}
