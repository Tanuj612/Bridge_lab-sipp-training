import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in cm): ");
        double height = scanner.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert area to square inches (1 inch = 2.54 cm ⇒ 1 sq in = 2.54 * 2.54 = 6.4516 sq cm)
        double areaSqIn = areaSqCm / 6.4516;

        // Output
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaSqIn, areaSqCm);

        scanner.close();
    }
}
