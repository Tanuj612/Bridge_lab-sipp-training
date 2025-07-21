public class q5 {
    public static void main(String[] args) {
        // Fixed values
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount and final fee
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Output
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
    }
}
