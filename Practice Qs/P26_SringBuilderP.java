public class P26_SringBuilderP {
    public static void main(String[] args) {
        
        StringBuilder sc = new StringBuilder("programming");
        
        int val = sc.indexOf("programming");
        sc.replace(val, "programming".length(), "development");
        
        sc.insert(0, "Java ");
        sc.append(" language");
        sc.reverse();
        System.out.println(sc);
    }
    
}