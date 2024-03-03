import java.util.Scanner;

public class p8 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int[] ar1 = new int[3];
        System.out.println("Enter the first Array: ");
        for (int i = 0; i < 3; i++) {
            ar1[i] = input.nextInt();
        }
        if (ar1[0]==4 ||ar1[0]==7) 
        {
            System.out.println("true");
        }
        else
        System.out.println("False");
}
}