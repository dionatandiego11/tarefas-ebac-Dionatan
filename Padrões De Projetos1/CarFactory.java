public class CarFactory extends MotorVehicleFactory {
    private String fuelType;
    private String color;
    private int numberOfDoors;

    public CarFactory(String fuelType, String color, int numberOfDoors) {
        this.fuelType = fuelType;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car(this.fuelType, this.color, this.numberOfDoors);
    }
}