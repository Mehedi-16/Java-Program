import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Height:");
        double h=input.nextDouble();
        System.out.println("Enter Width:");
        double w=input.nextDouble();
        double p=2*(h+w);
        System.out.println("Perimeter: "+p);
        double a=h*w;
        System.out.println("Area : "+a);
        
    }
    
}
