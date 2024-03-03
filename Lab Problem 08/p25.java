import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the rhombus: ");
        int numRows = input.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
