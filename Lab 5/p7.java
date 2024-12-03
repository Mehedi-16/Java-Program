import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ar1 = new int[3];
        System.out.println("Enter the first Array: ");
        for (int i = 0; i < 3; i++) {
            ar1[i] = input.nextInt();
        }
        
        int[] ar2 = new int[3];
        System.out.println("Enter the second Array: ");
        for (int i = 0; i < 3; i++) {
            ar2[i] = input.nextInt();
        }
        
        System.out.print("["+ar1[0]+",");
        System.out.println(ar2[2]+"]");
    }
}
