import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private double newSalary;
    private double bonus;
    private int percent;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonus();
    }

    private void calculateBonus() {
        if (salary <= 400.00) {
            percent = 15;
        } else if (salary <= 800.00) {
            percent = 12;
        } else if (salary <= 1200.00) {
            percent = 10;
        } else if (salary <= 2000.00) {
            percent = 7;
        } else {
            percent = 4;
        }

        bonus = salary * percent / 100.0;
        newSalary = salary + bonus;
    }

    public void printSalaryInfo() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", bonus);
        System.out.printf("Em percentual: %d %%\n", percent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("John Doe", 500.00);
        employee.printSalaryInfo();

        scanner.close();
    }
}
