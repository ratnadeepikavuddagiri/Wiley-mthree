import java.util.*;
import java.text.*;

class AirTicket{
    String passenger;
    String source;
    String destination;

    public AirTicket(String passenger, String source, String destination) {
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "AirTicket [passenger=" + passenger + ", destination=" + destination + ", source=" + source + "]";
    }
}

public class PassengerOnboarding {
    
    public static void main(String[] args) throws ParseException {
        AirTicket airTicket = new AirTicket("Deepika","Hyderabad","Delhi");
        System.out.println(airTicket);
        Date dateOfJourney = new SimpleDateFormat("dd/MM/yyyy").parse(args[0]);
        System.out.println("Date of Journey : " +dateOfJourney);
    }
}
