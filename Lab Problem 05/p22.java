import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        

        int Count1 = 0;
        int Count2 = 0;
        
        for (int num : arr) {
            if (num % 2 == 0) {
                Count1++;
            } else {
                Count2++;
            }
        }
        

        System.out.println("Number of even elements: " + Count1);
        System.out.println("Number of odd elements: " + Count2);
    }
}
