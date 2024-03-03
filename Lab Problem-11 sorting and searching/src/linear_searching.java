import java.util.Scanner;

public class linear_searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("insert the searching value: ");
        int a = in.nextInt();
        int[] arr = new int[10];
        int i;
        System.out.println("enter the values: ");
        for (i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (arr[i] == a) {
                System.out.println("found at " + (i + 1));
                // count = 1;
                break;
            } else {
                count = 0;
            }
        }
        if (count == 0) {
            System.out.println("not found");
        }
    }
}
