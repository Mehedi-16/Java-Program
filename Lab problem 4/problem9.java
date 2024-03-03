import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int x=input.nextInt();
        System.out.println("Enter the 2nd number:");
        int y=input.nextInt();
     if (x < 25 || x > 75 || y < 25 || y > 75)
      {
        System.out.println("False");
      }
    
        int d1=x/10;
        int d2=x%10;
        int d3=x/10;
        int d4=x%10;
     if (d1==d3 || d1==d4 || d2==d3 || d2==d4) 
     {
       System.out.println("True"); 
     }
    }
    
    
    
    }