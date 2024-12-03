import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar1 = new int[3];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < 3; i++) {
            ar1[i] = input.nextInt();
        }
        
        int max = ar1[0];
        for (int i = 1; i < 3; i++) {
            if (ar1[i] > max) {
                max = ar1[i];
            }
        }
        
        System.out.println("Max is: " + max);
    }
}
