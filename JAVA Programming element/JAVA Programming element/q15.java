import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;           // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760;       // 1 mile = 1760 yards

        // Output
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f\n", distanceInYards, distanceInMiles);

        scanner.close();
    }
}
