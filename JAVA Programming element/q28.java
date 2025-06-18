import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: sides of the triangular park
        System.out.print("Enter the length of side 1 in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 in meters: ");
        double side3 = scanner.nextDouble();

        // Compute perimeter
        double perimeter = side1 + side2 + side3;

        // Total distance to run = 5 km = 5000 meters
        double totalDistance = 5000.0;

        // Calculate number of rounds
        double rounds = totalDistance / perimeter;

        // Output
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);

        scanner.close();
    }
}
