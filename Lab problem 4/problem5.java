import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x=input.nextInt();
        System.out.println("Enter the secend number:");
        int y=input.nextInt();
        int count=0;
        System.out.println("Enter the divided number:");
        int p=input.nextInt();
        for (int i = x; i <=y; i++) 
        {
            if(i%p==0)
            {
                 count++;
            }
        }
        System.out.println(count);
    }
    
}
