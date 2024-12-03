import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        
        if (n < 2) 
        {
            System.out.println("Array length should be at least 2.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) 
        {
            array[i] = input.nextInt();
        }
        
        if (array[0] ==10 || array[n - 1]==10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
