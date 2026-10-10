abstract class EmergencyService
{
    abstract void dispatch(Emergency E);

    abstract void response(Emergency E);

    abstract void resolve(Emergency E);
    
}
