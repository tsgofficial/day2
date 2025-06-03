package task1;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel = 0.0;
    }

    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled " + amount + " liters. Total fuel: " + fuel + " liters.");
        } else {
            System.out.println("Please enter a valid fuel amount.");
        }
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel: " + fuel + " liters");
    }

    public double getFuel() {
        return fuel;
    }
}
