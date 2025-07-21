import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        for(int i : arr){
            if(i >= 18){
                System.out.printf("The student with the age %d can vote%n",i);
            }
            else {
                System.out.printf("The student with the age %d can not vote%n",i);
            }
        }
    }
}
