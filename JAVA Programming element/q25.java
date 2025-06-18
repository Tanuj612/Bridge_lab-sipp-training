import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Fahrenheit temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Conversion formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius\n", fahrenheit, celsius);

        scanner.close();
    }
}
