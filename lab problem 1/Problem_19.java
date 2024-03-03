import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");

        int decimalNumber = input.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);



        System.out.println("Binary number is: " + binaryNumber);
    }
}
