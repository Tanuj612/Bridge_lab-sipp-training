import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion: 1 pound = 2.2 kg
        double weightInKg = weightInPounds / 2.2;

        // Output
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n", weightInPounds, weightInKg);

        scanner.close();
    }
}
