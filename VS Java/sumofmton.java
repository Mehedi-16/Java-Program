import java.util.Scanner;

public class sumofmton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        n = input.nextInt();
        for (int i = 3; i <= n; i=i+2) {
            sum = sum + i;
        }
        System.out.print("Sum is: " + sum);
    }

}
