public class Car implements MotorVehicle {
    private String fuelType;
    private String color;
    private int numberOfDoors;

    public Car(String fuelType, String color, int numberOfDoors) {
        this.fuelType = fuelType;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void build() {
        System.out.println("Build Car");
    }

    @Override
    public String getFuelType() {
        return this.fuelType;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}