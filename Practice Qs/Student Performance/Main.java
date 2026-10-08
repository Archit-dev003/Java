import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of students: ");
        int input = sc.nextInt();

        Student[] S = new Student[input];

        for(int i=0; i<S.length; i++)
        {
            System.out.println("Studemt no.: "+(i+1)+" Details");
            System.out.print("Enter the name: ");
            String name = sc.next();

            System.out.print("Enter class: ");
            int classNum = sc.nextInt();

            System.out.print("Enter rollno: ");
            int rollNo = sc.nextInt();

            System.out.println("Enter subject marks-");
            System.out.println();
            int[] subjectMarks = new int[5];
            S[i] = new Methods(name, rollNo, classNum, subjectMarks);

            for(int j=0; j<subjectMarks.length; j++)
            {
                System.out.print(S[i].getSubjectName()[j]+" : ");
                subjectMarks[j] = sc.nextInt(); 
            }
            System.out.println();
        }
        
        for(int i=0; i<S.length;i++)
        {
            System.out.println();
            S[i].displayDetails();
        }

        sc.close();
    }    
}
