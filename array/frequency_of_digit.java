import java.util.Scanner;

public class frequency_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] frequency = new int[10]; 
        while (n != 0) {
            int digit = n % 10; 
            frequency[digit]++; 
            n /= 10; 
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Frequency of " + i + ": " + frequency[i]);
        }
    }
    
}
