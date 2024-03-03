public class problem22 {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        int maxBegin = 0;
        int maxEnd = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            if (sum < 0) {
                sum = 0;
                begin = end + 1;
            } else {
                if (sum > max) {
                    max = sum;
                    maxBegin = begin;
                    maxEnd = end;
                }
            }
            end++;
        }
        return max;
    }
}
