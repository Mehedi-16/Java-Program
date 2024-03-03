import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int numRows = s.nextInt();

        for (int i = 1; i <= numRows; i++) {
            
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("@");
            }

            System.out.println();
        }
    }
}
