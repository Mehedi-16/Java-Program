import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

     if (secondNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("True");
        } 
        else {
            System.out.println("False");
        }
    }
}
