public class Plane extends Vehicle {

    private final int flightAltitude;
    private final int numberPassengers;

    public Plane(String name, double coordinateX, double coordinateY, int speed, int price, int yearOfManufacture, int flightAltitude, int numberPassengers) {
        super(name, coordinateX, coordinateY, speed, price, yearOfManufacture);
        this.flightAltitude = flightAltitude;
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        return "Plane: " + super.toString() + ", numberPassengers=" + numberPassengers + ", flightAltitude=" + flightAltitude;
    }
}
