public class problem1 {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 10, 50, 20, 10 };
        int count10 = 0;
        int count20 = 0;
        for (int b : a) {
            if (b == 10) {
                count10++;
            } else if (b == 20) {
                count20++;
            }

        }
        if (count10 < count20) {
            System.out.println("count 10 is greater than 20");
        } else if (count10 > count20) {
            System.out.println("count 20 is greater than 10");
        } else {
            System.out.println("count 20 is equa with 10");
        }
    }
}
