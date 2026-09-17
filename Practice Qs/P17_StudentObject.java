class Student{
    String name;
    int Rollno;
    int marks;
}

public class P17_StudentObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name="Arav";
        s2.name="Jay";
        s3.name="May";

        s1.Rollno=23;
        s2.Rollno=12;
        s3.Rollno=34;

        s1.marks=54;
        s2.marks=66;
        s3.marks=89;

        Student[] st = {s1,s2,s3};
        for(Student stud:st )
        {
            System.out.println(stud.name+" : "+stud.Rollno+", "+stud.marks);
        }
    }    
}
