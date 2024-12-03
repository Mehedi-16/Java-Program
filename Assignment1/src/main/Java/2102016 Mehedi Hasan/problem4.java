import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon:");
        double n=input.nextDouble();
        System.out.print("Input the length of one of the sides:");
        double s=input.nextDouble();
        double area=(n*s*s)/(4*Math.tan(Math.PI/n));
        System.out.println("The area is: "+area);
        
    }
    
}
