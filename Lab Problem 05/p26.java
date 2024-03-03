import java.util.Scanner;
 public class p26 {
 public static void main(String[] args)
 {
	  int[] array = {50, 70, 18, 25, 20, 13, 40};
      boolean testd = false;
	  int result=0;
	  int x = 10;
	  int y = 20;
    
    for(int i = 0; i < array.length; i++) {
        if(array[i] == x)
            testd = true;
                    
        if(testd && array[i] == y)
		{
         System.out.printf( String.valueOf(true));	
         result = 1		 ;
		}
    }
     if (result==0)                             
	   {	 
         System.out.printf( String.valueOf(false));
	    }
		System.out.printf("\n");
    }
}
