public class array{
 public static void main(String[] args)
 {
	int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
	int ctr1 = 0;
    int ctr2 = 0;
      
    for(int i = 0; i < array_nums.length; i++) {
        if(array_nums[i] == 10)
            ctr1++;
                        
        if(array_nums[i] == 20)
            ctr2++;
    }                                      
    System.out.printf(String.valueOf(ctr1 > ctr2));
	System.out.printf("\n");
  }
}
