public class Plane extends Vehicle {

    private int flightAltitude;
    private int numberPassengers;

    public Plane(String name, double coordinateX, double coordinateY, int speed, int price, int yearOfManufacture, int flightAltitude, int numberPassengers) {
        super(name, coordinateX, coordinateY, speed, price, yearOfManufacture);
        this.flightAltitude = flightAltitude;
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name=" + name +
                ", numberPassengers=" + numberPassengers +
                ", flightAltitude='" + flightAltitude + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", speed=" + speed +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
