import java.util.Scanner;

public class ar8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        int result = sumDigitsUntilSingleDigit(num);

        System.out.println("The sum of digits until a single digit is: " + result);
    }

    public static int sumDigitsUntilSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
