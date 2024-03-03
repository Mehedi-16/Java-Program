import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string (length > 3): ");
        String inputString = input.nextLine();

        if (inputString.length() > 3)
         {
            String resultString = inputString.substring(inputString.length() - 3) + inputString + inputString.substring(inputString.length() - 3);
            System.out.println("Result: " + resultString);
        } else {
            System.out.println("String length must be greater than 3.");
        }
    }
}
