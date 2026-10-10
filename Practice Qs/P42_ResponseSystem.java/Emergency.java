class Emergency
{
    private String type;
    private String location;
    private String priority;
    private String status="PENDING";
    
    public Emergency(String type, String location, String priority) {
        this.type = type;
        this.location = location;
        this.priority = priority;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    void displayDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Emergency Details");
        System.out.println("----------------------------------------");

        System.out.println("Type     : "+type);
        System.out.println("Location : "+location);
        System.out.println("Priority : "+priority);
        System.out.println("Status   :"+status);
    }

}
