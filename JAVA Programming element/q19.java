import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Celsius to Fahrenheit conversion
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.printf("The %.2f celsius is %.2f fahrenheit\n", celsius, fahrenheitResult);

        scanner.close();
    }
}
