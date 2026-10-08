// package student;

public class Student
{
    private String name;
    private int rollno;
    private int classNumber;
    private String[] subjectName={"maths","science","hindi","english","socialScience"};
    private int[] subjectMarks;

    public Student(String name, int rollno, int classNumber, int[] subjectMarks) {
        this.name = name;
        this.rollno = rollno;
        this.classNumber = classNumber;
        this.subjectMarks = subjectMarks;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String[] getSubjectName() {
        return subjectName;
    }

    public int[] getSubjectMarks() {
        return subjectMarks;
    }


    public void displayDetails(){};

    public void percentage(){};

    public void highAndLow(){};
}

