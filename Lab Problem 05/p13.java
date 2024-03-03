import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = input.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = input.nextInt();
        }
        
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++) {
            resultArray[i] = array1[i] * array2[i];
        }

        System.out.println("Multiplication result:");
        for (int i = 0; i < size; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
