public class reverse_number {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int reversedNumber = 0;

        while (n != 0) {
            int digit = n % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            n /= 10; 
        }

        System.out.println(reversedNumber); 
    }
}
