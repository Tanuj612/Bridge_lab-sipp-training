import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + "positive");
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is even");
                } else {
                    System.out.println(arr[i] + " is odd");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + "negative");
            } else {
                System.out.println(arr[i] + "zero");
            }
        }
        if(arr[0]==arr[n-1]) {
            System.out.println("First and last elements are equal");
        } else if(arr[0]> arr[n-1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("Last element is greater than first element");
        }
    }
    
}
