import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon:");
        double s=input.nextDouble();
        double area=(6 * s*s)/(4*Math.tan(Math.PI/6));
        System.out.println("The area of the hexagon is: "+area);
    }
    
}
