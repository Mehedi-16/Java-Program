import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter yhe Input: ");
        int x=input.nextInt();
        int y=input.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swaping x:"+x);
        System.out.println("After Swaping y:"+y);

    }
    
}
