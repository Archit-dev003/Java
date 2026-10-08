class Methods extends Student
{

    Methods(String name, int rollno, int classNumber, int[] subjectMarks)
    {
        super(name, rollno, classNumber, subjectMarks);
    }

    @Override 
    public void percentage()
    {
        int total=0;

        for(int i=0; i<getSubjectName().length; i++)
        {
            total += getSubjectMarks()[i];
        }

        System.out.println("Total Marks: "+total);

        double percent = total/5.0;

        System.out.println("Percentage: "+percent);
    }

    @Override
    public void highAndLow()
    {
        int max = getSubjectMarks()[0];
        int min = getSubjectMarks()[0];
        int minSub = 0;
        int maxSub = 0;

        for(int i=1; i<getSubjectName().length; i++)
        {
            if(getSubjectMarks()[i]>max)
            {
                max = getSubjectMarks()[i];
                maxSub = i;
            }
            else if(getSubjectMarks()[i]<min)
            {
                min = getSubjectMarks()[i];
                minSub = i;
            }
        }
        System.out.println("Highest Marks obtained is: "+max+" in "+getSubjectName()[maxSub]);
        System.out.println("Lowest Marks obtained is: "+min+ " in "+getSubjectName()[minSub]);
    }

    @Override
    public void displayDetails() {
        System.out.println("-------Student Report-------");
        System.out.println();
        System.out.println("Student Name: "+getName());
        System.out.println("Class: "+getClassNumber());
        System.out.println("Roll No. : "+getRollno());

        for(int i=0; i<getSubjectMarks().length; i++)
        {
            System.out.print(getSubjectName()[i]);
            System.out.println(getSubjectMarks()[i]);
        }
        System.out.println();
        highAndLow();
        System.out.println();
        percentage();
        System.out.println();
        System.out.println("-------END-------");
    }
}
