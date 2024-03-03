
import java.util.Scanner;

public class Problem_7 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=input.nextInt();
        for(int i=1;i<=10;i++)
        {
        System.out.println(num+"X"+i+"="+num*i );
        }
}
}
