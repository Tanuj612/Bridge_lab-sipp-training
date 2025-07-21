public class check_even_odd {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int [] even=new int[n/2 +1];
        int [] odd=new int[n/2 +1];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                even[evenIndex++] = a;
            } else {
                odd[oddIndex++] = a;
            }
        }
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        
      
    
}
}
