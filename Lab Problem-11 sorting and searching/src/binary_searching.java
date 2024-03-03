import java.util.Scanner;

class searching {
    int value1(int a[], int n, int data) {
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (data == a[mid]) {
                return mid;
            } else if (data >= a[mid]) {
                l = mid + 1;
            } else if (data < a[mid]) {
                r = mid - 1;
            }
        }
        return -1;
    }
}

public class binary_searching {
    public static void main(String[] args) {
        searching obj1 = new searching();

        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("insert the searching value: ");
        int data = in.nextInt();

        int[] arr = new int[10];
        System.out.println("insert the values:");
        for (i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        int n = arr.length;

        int result = obj1.value1(arr, n, data);

        if (result != -1) {
            System.out.println("found at index " + result);
        } else {
            System.out.println("not found");
        }
    }
}
