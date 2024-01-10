public class Fabrica {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory("Gasolina", "Vermelho", 4);
        MotorVehicle car = carFactory.create();
        System.out.println("Tipo de combustível: " + car.getFuelType());
        System.out.println("Cor: " + car.getColor());
        System.out.println("Número de portas: " + car.getNumberOfDoors());
    }
}
