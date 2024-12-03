
import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter input X and Y Values: ");
      int x=input.nextInt();
      int y=input.nextInt();
       int max=Math.max(x, y);
       System.out.println("maximum: "+max);
       int min=Math.min(x, y);
        System.out.println("minimum: "+min);
        int abs=Math.abs(x);
        System.out.println("Abs Value: "+abs);
        double power=Math.pow(x,y);
        System.out.println("power : "+power);
        int Round=Math.round(5.3f);
        System.out.println("Round of x : "+Round);//nearest number
        
    }
    
}
