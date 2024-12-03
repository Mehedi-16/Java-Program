import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Radius: ");
        double r=input.nextDouble();
        double perimeter=2*Math.PI*r;
        System.out.println("Perimeter is : "+perimeter);
        double area=Math.PI*r*r;
        System.out.println("Area is : "+area);
    }
    
}
