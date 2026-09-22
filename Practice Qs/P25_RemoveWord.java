public class P25_RemoveWord {
    public static void main(String[] args) {
        
        StringBuilder sc = new StringBuilder("Java is easy and Java is powerful");
        // int start=0;
        // for(int i=0; i<sc.length(); i++)
        // {
        //     if(sc.charAt(i)==' '){
        //         StringBuilder sc2 = new StringBuilder(sc.substring(start, i));
        //         if(sc2.toString().equals("Java")){
        //             sc.delete(start, i);
        //         }
        //         start = i+1;
        //     }
        // }
        // System.out.println(sc);
        int index;
        while((index = sc.indexOf("Java"))!=-1){
            sc.delete(index, index+4);
        }
        System.out.println(sc);
    }
}
