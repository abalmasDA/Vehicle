public class Car extends Vehicle {


    public Car(String name, double coordinateX, double coordinateY, int speed, int price, int yearOfManufacture) {
        super(name, coordinateX, coordinateY, speed, price, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", speed=" + speed +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
