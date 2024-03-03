import java.util.Scanner;

public class problem10 {
    public static void main(String[] arg) {
        int test = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = input.nextInt();
        if (n < 1) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }
        if ((n & (n - 1)) != 0) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }
        if (test == 0) {
            System.out.print(Boolean.toString((n & 0x55555555) != 0));
        }
        System.out.print("\n");
    }
}
