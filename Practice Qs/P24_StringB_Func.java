public class P24_StringB_Func {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("ABCDEFGHIJ");
        st.delete(2, 4);
        st.insert(2,"XYZ");
        st.setCharAt(5, 'Q');
        st.reverse();
        System.out.println(st);

        StringBuilder sb = new StringBuilder("aaabbccccddeee");
        for (int i = 1; i < sb.length(); i++)
        {
            if(sb.charAt(i)==sb.charAt(i-1))
            {
                sb.deleteCharAt(i-1);
                i--;
            }
            
        }
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Java is very powerful");
        int Start = 0;
        for(int i=0; i<sb2.length();i++)
        {
            if(sb2.charAt(i)==' ')
            {
                String Val = sb2.substring(Start, i);
                StringBuilder Valc = new StringBuilder(Val);
                Valc.reverse();
                sb2.replace(Start, i, Valc.toString());
                Start = i+1;
            }
            else if(i==sb2.length()-1)
            {
                String Val = sb2.substring(Start, i+1);
                StringBuilder Valc = new StringBuilder(Val);
                Valc.reverse();
                sb2.replace(Start, i+1, Valc.toString());
                
            }
        }
        System.out.println(sb2);
    }
}
