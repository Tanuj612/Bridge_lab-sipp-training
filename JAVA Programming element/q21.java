import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum handshakes using combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is: " + handshakes);

        scanner.close();
    }
}
