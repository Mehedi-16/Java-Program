import java.util.Scanner;

public class FActorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=input.nextInt();
        int Fact=1;
        for(int i=1;i<=n;i++)
        {
            Fact=Fact*i;  
            
        }
System.out.println("Factorial is: "+Fact);
        
    }
    
}
