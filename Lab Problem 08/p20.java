import java.util.Scanner;

public class p20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int numRows = s.nextInt();

        int currentNumber = 1;

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
        }
    }
}
