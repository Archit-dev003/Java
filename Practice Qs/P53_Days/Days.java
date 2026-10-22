enum InnerDays {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Days {

    private InnerDays day;

    Days(InnerDays day)
    {
        this.day = day;
    }
    public void getDays()
    {
        switch (day) {
            case MONDAY:
                System.out.println(" - Weekday");
                break;
            case TUESDAY:
                System.out.println(" - Weekday");
                break;
            case WEDNESDAY:
                System.out.println(" - Weekday");
                break;
            case THURSDAY:
                System.out.println(" - Weekday");
                break;
            case FRIDAY:
                System.out.println(" - Weekday");
                break;
            case SATURDAY:
                System.out.println(" - Weekend");
                break;
            case SUNDAY:
                System.out.println(" - Weekend");
                break;
            default:
                break;
                
        }
    }
}
