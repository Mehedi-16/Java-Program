
import java.util.Scanner;
public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } 
            else {
                n = (n * 3) + 1;
            }
        }
        System.out.println(n);
    }
}
