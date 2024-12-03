import java.util.Scanner;

public class problem2 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();

        int r,sum=0;
        while(num!=0)
        {
          r=num%10;
          sum=sum+r;
          num=num/10;

        }
        System.out.println("The sum of the digits is:"+sum);

        
        
    }
    
}
