import java.util.Scanner;

public class problem6 {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int count=0;
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) 
            {
                count++;
            }
        }
        System.out.print(count);
    }
}