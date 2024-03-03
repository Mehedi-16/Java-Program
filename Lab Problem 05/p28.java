public class p28 {
    public static void main(String[] args) {
        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};

        int count = 0;
        boolean result = false;

        for (int i = 0; i < array_nums.length; i++) {
            if (array_nums[i] == 20) {
                count++;
                if (i > 0 && array_nums[i - 1] == 20) {
                    result = true;
                    break;
                }
            }
        }

        if (!result) {
            System.out.println(count == 3);
        } else {
            System.out.println(false);
        }
    }
}
