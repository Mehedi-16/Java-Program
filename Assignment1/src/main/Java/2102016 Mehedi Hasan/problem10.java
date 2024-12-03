import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = input.next().charAt(0);

        int asciiValue = (int) inputChar;

        System.out.println("The ASCII value of " + inputChar + " is: " + asciiValue);
    }
}
