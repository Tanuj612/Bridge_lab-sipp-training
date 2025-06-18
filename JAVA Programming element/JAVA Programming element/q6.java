public class q6 {
    public static void main(String[] args) {
        // Fixed values
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculations
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        // Output using a single print statement
        System.out.printf(
            "The Cost Price is INR %.2f and the Selling Price is INR %.2f\nThe Profit is INR %.2f and the Profit Percentage is %.2f%%\n",
            costPrice, sellingPrice, profit, profitPercent);
    }
}
