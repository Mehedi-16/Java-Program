import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Input: ");
        
        String binary1 =input.next();
        String binary2 = input.next();

        int decimal1 = Integer.parseInt(binary1,2);
        int decimal2 = Integer.parseInt(binary2, 2);

        int sum = decimal1 + decimal2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Binary Sum: " + binarySum);
    }
}
