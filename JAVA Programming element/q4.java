public class q4 {
    public static void main(String[] args) {
        // Radius of the Earth in kilometers
        double radiusKm = 6378.0;

        // Volume of a sphere: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Conversion factor: 1 cubic mile = 4.16818 × 10^9 cubic meters
        // 1 mile = 1.6 km ⇒ 1 km = 1/1.6 mile ⇒ 1 km³ = (1/1.6)^3 ≈ 0.244140625 mi³
        double volumeMiles3 = volumeKm3 * Math.pow(1 / 1.6, 3);

        // Output
        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm3, volumeMiles3);
    }
}
