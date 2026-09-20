import java.util.Scanner;
class Data
{
    private String Name;
    private int Marks;
    int max;
    
    // Data(String Name, int Marks)
    // {
        //     if(Marks>=0||Marks<=100)
        //     {
        //         this.Marks = Marks;
        //     }
        //     this.Name = Name;
        // }
        public void SetName(String Name){
            this.Name = Name;
        }
        public void SetMarks(int Marks){
            if(Marks>=0 && Marks<=100)
        {
            this.Marks = Marks;
            
            if(Marks>max){
                max = Marks;
            }
        }
    }
    
    public String GetName() {
        return Name;
    }

    public int GetMarks() {
        return Marks;
    }

}
public class P22_ControlledM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Studs: ");
        int input = sc.nextInt();

        String Name;
        int Marks;

        Data[] D = new Data[input];

        for(int i=0; i<D.length;i++)
        {
            D[i] = new Data();

            System.out.print("Enter the Name: ");
            Name = sc.next();
            D[i].SetName(Name);

            System.out.print("Enter the Marks: ");
            Marks = sc.nextInt();
            D[i].SetMarks(Marks);
        }

        for(int i=0; i<D.length; i++)
        {
            System.out.println(D[i].GetName()+" : "+D[i].GetMarks());
        }
        sc.close();
    }
}
