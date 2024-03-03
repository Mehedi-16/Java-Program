import java.util.Scanner;
 public class problem10 {
 public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = input.nextInt();  
		System.out.print("Input the second number: ");
		int b = input.nextInt(); 
		int d = a / b;
		int result = a - (d* b);
		System.out.println(result); 
	}
 }
