import java.util.Scanner;

public class p9 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int[] ar = new int[3];
        System.out.println("Enter the Array: ");
        for (int i = 0; i < 3; i++) {
            ar[i] = input.nextInt();
        }
        System.out.println("["+ar[1]+","+ar[2]+","+ar[0]+"]");
    }
}