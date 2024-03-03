import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd value: ");
        int b = input.nextInt();
        int c = a + b;
        System.out.print("Enter 3rd value: ");
        int d = input.nextInt();
        if (c == d) {
            System.out.println("The result is: True");

        } else {
            System.out.println("The result is: False");
        }
    }

}
