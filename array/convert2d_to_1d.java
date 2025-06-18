import java.util.Scanner;

public class convert2d_to_1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] arr2d = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        
        int rows = arr2d.length;
        int cols = arr2d[0].length;
        int[] arr1d = new int[rows * cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1d[i * cols + j] = arr2d[i][j];
            }
        }
      
        for (int value : arr1d) {
            System.out.print(value + " ");
        }
    }
    
}
