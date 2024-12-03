import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter  number : ");
        int n = input.nextInt();
        
        if (n < 2) 
        {
            System.out.println("Array length should be at least 2.");
            return;
        }
       System.out.println("Enter the first array: ");
        int[] array1 = new int[n];

        for (int i = 0; i < n; i++) 
        {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter the secend array: ");
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) 
        {
            array2[i] = input.nextInt();
        }
        
        if ((array1[0] == array1[n - 1]) || (array2[0] == array2[n - 1]))
        {
            System.out.println("true");
        } 
        else {
            System.out.println("false");
        }
    }
}
