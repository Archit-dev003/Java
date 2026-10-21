enum TrafficSignal {
    RED,
    YELLOW,
    GREEN
}

public class Traffic {
    
    private TrafficSignal traffic;

    Traffic(TrafficSignal traffic)
    {
        this.traffic = traffic;
    }

    public TrafficSignal getTrafficSignal()
    {
        return traffic;
    }

    public void setTrafficSignal(TrafficSignal traffic)
    {
        this.traffic = traffic;
    }

    public void getSignal()
    {
        switch (traffic) {
            case RED:
                System.out.println("STOP! Do not cross.");
                break;
            case YELLOW:
                System.out.println("WAIT! Prepare to stop.");
                break;
            case GREEN:
                System.out.println("GO! You may cross.");
                break;
            default:
                break;
        }
    }
}
