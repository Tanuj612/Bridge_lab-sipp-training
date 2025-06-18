import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Conversion logic
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, inches);
        
        scanner.close();
    }
}
