import java.util.Scanner;

public class Primetest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,count=0,totalprime=0;
        System.out.print("Enter initial Number: ");
         m = input.nextInt();

         System.out.print("Enter Ending Number: ");
         n = input.nextInt();

        for(int i=m;i<=n;i++)
        {
           for(int j=2;j<i;j++)
           {
                  if (i % j == 0)
                   {
                    count++;
                    break;
                   }
           }
         if(count==0)
         {
            System.out.println(i);
            totalprime++;
         }
         count=0;
        }  
        System.out.println("Total Prime: "+totalprime);
    }
}
        
       