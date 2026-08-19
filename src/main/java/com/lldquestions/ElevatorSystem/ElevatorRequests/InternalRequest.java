package main.java.com.lldquestions.ElevatorSystem.ElevatorRequests;


//Passenger inside elevator wants to go to floor X.
public class InternalRequest extends Request{
    public InternalRequest(int floor){
        super(floor);
    }

    @Override
    public String toString(){
        return "InternalRequest floor: " + getFloor();
    }

}
