import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");

        int decimalNumber = input.nextInt();

        String hexaNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexa is: " + hexaNumber);
    }
}
