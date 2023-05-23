public class Ship extends Vehicle {

    private String portRegistry;
    private int numberPassengers;

    public Ship(String name, double coordinateX, double coordinateY, int speed, int price, int yearOfManufacture, String portRegistry, int numberPassengers) {
        super(name, coordinateX, coordinateY, speed, price, yearOfManufacture);
        this.portRegistry = portRegistry;
        this.numberPassengers = numberPassengers;

    }

    @Override
    public String toString() {
        return "Ship{" +
                "name=" + name + '\'' +
                ", numberPassengers=" + numberPassengers +
                ", portRegistry='" + portRegistry + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", speed=" + speed +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
