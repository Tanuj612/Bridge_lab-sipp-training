import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        // Operations
        double result1 = a + b * c;       // Multiplication before addition
        double result2 = a * b + c;       // Multiplication before addition
        double result3 = c + a / b;       // Division before addition
        double result4 = a % b + c;       // Modulus before addition

        // Output
        System.out.printf("The results of Double Operations are: %.2f, %.2f, %.2f, and %.2f\n",
                          result1, result2, result3, result4);

        scanner.close();
    }
}
