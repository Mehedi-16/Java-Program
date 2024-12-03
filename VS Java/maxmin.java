import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int[] num = new int[5];
for (int i = 0; i < num.length; i++) 
{
    num[i]=input.nextInt();
}
int max=num[0];
int min=num[0];
for (int i = 1; i < num.length; i++)
 {
    if (max<num[i])
     {
        max=num[i];
    }
     if (min>num[i])
     {
        min=num[i];
    }
 }
 System.out.println("Maximum: "+max);
 System.out.println("Minimum: "+min);
    }
}
