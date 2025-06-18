public class input_array {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] arr = new int[10]; 
        int sum=0;
        int index=10;
        for (int i = 0; i < 10; i++) {
            int a=sc.nextInt();
            if(a<=0 ){
                index = i; 
                break;
            }
            arr[i] = a;
            sum += arr[i];

        }
        
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(sum);
    }
    
}
