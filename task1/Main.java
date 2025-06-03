package task1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "F-150", 2020);
        System.out.println("Vehicle Details:");
        vehicle.displayDetails();

        System.out.println("\nCar Details:");
        Car car = new Car("Honda", "Accord", 2023, 4);
        car.displayDetails();
    }
}