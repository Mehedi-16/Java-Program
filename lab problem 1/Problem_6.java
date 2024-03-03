
import java.util.Scanner;


public class Problem_6 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input First Number: ");
        int x=input.nextInt();
        System.out.println("Input Secend Number: ");
        int y=input.nextInt();
        int sum=x+y;
        System.out.println("Sum is: "+sum);
        int sub=x-y;
        System.out.println("Sub is: "+sub);
        int mul=x*y;
        System.out.println("Mul is: "+mul);
        double div=x/y;
        System.out.println("Div is: "+div);
        double mod=x%y;
        System.out.println("Mod is: "+mod);
        
    
}
}