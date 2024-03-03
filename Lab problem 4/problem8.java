import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int x=input.nextInt();
        System.out.println("Enter the 2nd number:");
        int y=input.nextInt();
        if (x==y) 
        {
           System.out.println(0);
        }
        else if (x % 6 == y % 6)
         {
            System.out.println(Math.min(x, y));
        } else 
        {
            System.out.println(Math.max(x, y));
        }
        
    }
    
}
