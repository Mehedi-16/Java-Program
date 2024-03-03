import java.util.Scanner;
public class problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value: ");
        int n=input.nextInt();
        int nn=n*11;
        int nnn=n*111;
        int result=n+nn+nnn;
        System.out.println("Output: " + n + " + " + nn + " + " + nnn);
        System.out.println("Result: "+result);
        
    }

    
}
