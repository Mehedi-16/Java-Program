import java.util.Scanner;

public class Peroblem_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input First Number: ");
        double x=input.nextDouble();
        System.out.println("Input Secend Number: ");
        double y=input.nextDouble();
        System.out.println("Input 3rd Number: ");
        double z=input.nextDouble();
        double result = (x+y+z)/3;
        System.out.println("Average is: "+result);

    }
}
