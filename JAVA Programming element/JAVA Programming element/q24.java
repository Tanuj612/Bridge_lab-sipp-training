import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: salary and bonus
        System.out.print("Enter the salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output
        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f\n",
                          salary, bonus, totalIncome);

        scanner.close();
    }
}
