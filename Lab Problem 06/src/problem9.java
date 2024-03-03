
import java.util.Scanner;

public class problem9 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = input.nextInt();
        if (n > 0) {
            System.out.println("Number of rows: " + ((int) ((Math.sqrt(8 * (long) n + 1) - 1) / 2)));
        }
    }
}
