import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion logic
        double miles = km / 1.6;

        // Output
        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);

        input.close();
    }
}
