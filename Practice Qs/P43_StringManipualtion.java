public class P43_StringManipualtion {
    public static void main(String[] args) {
        
        StringBuilder S = new StringBuilder("Java is very very powerful");

        int start = 0;
        int end = 0;
    
        for(int i=0; i<S.length();i++)
        {
            if(S.charAt(i) == ' ')
                {    
                    String sub = S.substring(start,end+1);

                if(sub.equals("very"))
                {
                    S.delete(start, end+2);
                    break;
                }
                start = i+1;
            }
            end = i;
        }
        System.out.println(S);
    }    
}
