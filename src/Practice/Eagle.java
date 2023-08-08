package Practice;

public class Eagle extends Animal implements FlightCapable {


    @Override
    public void makeNoise() {
        System.out.println("Screech (in FREEDOM)");
    }

    @Override
    public void takeOff() {
        System.out.println("Flap wings (in FREEDOM)");
    }
}
