public class Vehicle {

    protected String name;
    protected double coordinateX;
    protected double coordinateY;
    protected int speed;
    protected int price;
    protected int yearOfManufacture;


    public Vehicle(String name, double coordinateX, double coordinateY, int speed, int price, int yearOfManufacture) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.speed = speed;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "name=" + name + ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", speed=" + speed +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture;
    }
}
