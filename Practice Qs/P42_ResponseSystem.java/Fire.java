class Fire extends EmergencyService
{
    
    void dispatch(Emergency E) {
        if(E.getStatus().equals("PENDING"))
        {
            E.setStatus("DISPATCHED");

            System.out.println("Dispatching Fire Unit...");
            System.out.println();
            System.out.println(E.getType()+" Unit dispatched to "+E.getLocation());
            System.out.println();
            System.out.println("Status: "+E.getStatus());
        }

        else if(E.getStatus().equals("DISPATCHED"))
        {
            System.out.println("-> Unit is already dispatched.");
            System.out.println();
            System.out.println("Status: "+E.getStatus());
        }
        else if(E.getStatus().equals("RESPONDING"))
        {
            System.out.println("Resolve the emergency before dispatching");
            System.out.println("Status: "+E.getStatus());
        }
    }

    void response(Emergency E) {
        if(E.getStatus().equals("DISPATCHED"))
        {
            E.setStatus("RESPONDING");

            System.out.println("Emergency akready Responded.");
            System.out.println();
            System.out.println("Status: "+E.getStatus());
        }

        else if(E.getStatus().equals("RESOLVED"))
        {
            System.out.println("Emergency already resolved");
            System.out.println("Status: "+E.getStatus());
        }

        else if(E.getStatus().equals("RESPONDING"))
        {
            System.out.println("Emergency already Responded");
            System.out.println("Status: "+E.getStatus());
        }
    }

    void resolve(Emergency E) {
        if(E.getStatus().equals("RESPONDING"))
        {
            E.setStatus("RESOLVED");

            System.out.println("Emergency resolved successfully.");
            System.out.println();
            System.out.println("Status: "+E.getStatus());
        }

        else if(E.getStatus().equals("RESOLVED"))
        {
            System.out.println("Emergency already resolved");
            System.out.println("Status: "+E.getStatus());
        }

        else if(E.getStatus().equals("DISPATCHED"))
        {
            System.out.println("Response before resolving");
            System.out.println("Status: "+E.getStatus());
        }
    }

}
