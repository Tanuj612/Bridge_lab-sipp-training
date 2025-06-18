import java.util.Scanner;

public class youngest_tallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] ages = new int[n];
        int[] heights = new int[n];
        int maxHeight = Integer.MIN_VALUE;  
        int minAge = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt(); 
            heights[i] = sc.nextInt(); 
            
        }
        int height = 0;
        int age = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                height=i;
            }
            if (ages[i] < minAge) {
                minAge = ages[i];
                age=i;
            }
        }
        if(age==1){
            System.out.println("youngest: " + "Akbar");
        }
        else if(age==2){
            System.out.println("youngest: " + "Anthony");
        }
        else {
            System.out.println("youngest: " + "Amar");
        }

        
        if(height==1){
            System.out.println("tallest: " + "Akbar");
        }
        else if(height==2){
            System.out.println("tallest: " + "Anthony");
        }
        else {
            System.out.println("tallest: " + "Amar");
        }

    }
    
}
