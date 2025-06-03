package task1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford", "F-150", 2020);
        System.out.println("Vehicle Details:");
        vehicle.displayDetails();

        Car car = new Car("Honda", "Accord", 2023, 4);
        System.out.println("\nCar Details:");
        car.displayDetails();

        Truck truck = new Truck("Honda", "Accord", 2023, 4);
        truck.refuel(50.0);
        System.out.println("\nTruck Details:");
        truck.displayDetails();
    }
}