import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd value: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd value: ");
        int c = input.nextInt();
        if ((Math.abs(a-b)>=20 || Math.abs(b-c)>=20|| Math.abs(c-a)>=20) )
         {
            System.out.println("The result is: True");
        } 
        else {
            System.out.println("The result is: False");
        }
    }

}
