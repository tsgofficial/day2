import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        double newSalary = 0.0;
        double reajuste = 0.0;
        int percentual = 0;

        if (salary <= 400.00) {
            percentual = 15;
        } else if (salary <= 800.00) {
            percentual = 12;
        } else if (salary <= 1200.00) {
            percentual = 10;
        } else if (salary <= 2000.00) {
            percentual = 7;
        } else {
            percentual = 4;
        }

        reajuste = salary * percentual / 100.0;
        newSalary = salary + reajuste;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);

        scanner.close();
    }
}
