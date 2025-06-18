import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();

        // Integer operations
        int result1 = a + b * c;       // Multiplication before addition
        int result2 = a * b + c;       // Multiplication before addition
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulus before addition

        // Output
        System.out.printf("The results of Int Operations are: %d, %d, %d, and %d\n", result1, result2, result3, result4);

        scanner.close();
    }
}
