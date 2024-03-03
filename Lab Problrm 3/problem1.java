import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); {
            System.out.print("Enter First Input: ");
            int x=input.nextInt();
            System.out.print("Enter Secend Input: ");
            int y=input.nextInt();
            if(x!=y)
            {
                System.out.println(x+"!="+y);
            }
            if(x<y)
            {
                System.out.println(x+"<"+y);
            }
            if(x<=y)
            {
                System.out.println(x+"<="+y);
            }
        }
        
    }
    
}
