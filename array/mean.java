import java.util.Scanner;
public class mean {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
    int [] arr=new int[n];
    int sum=0;
    for(int index=0;index<n;index++){
        arr[index]=sc.nextInt();
        sum += arr[index];
        
    }
    double mean = sum / (double) n;
    
    System.out.println("The mean is: " + mean);
}
}