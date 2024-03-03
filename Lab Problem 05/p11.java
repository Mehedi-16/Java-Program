import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Enter 3 elements for the array:");

        for (int i = 0; i < 3; i++) {
            array[i] = input.nextInt();
        }
        
        if (array.length >= 3) 
        {
            int temp = array[0];
            array[0] = array[2];
            array[2] = temp;

            System.out.println("Array after swapping:");
            for (int i = 0; i < 3; i++)
             {
                System.out.print(array[i] + " ");
            }
        } 
    }
}
