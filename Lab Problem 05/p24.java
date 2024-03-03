import java.util.*;

public class p24 {
    public static void main(String[] args) {
        int[] array_nums = {10, 17, 28, 15, 37, 13, 0, 2, 44, 39};

        int i = 0;
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        for (int j = 0; j < array_nums.length; j++) {
            if (array_nums[j] % 2 == 0) {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
            }
        }

        System.out.println("New Array: " + Arrays.toString(array_nums));
    }
}
