import java.util.Scanner;

class sorting1 {
    void value(int arr[], int n) {
        int i, j, temp;
        boolean swapped;

        for (i = 0; i < n; i++) {
            swapped = false;
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }
}

public class bubble_sorting {
    public static void main(String[] args) {
        int i;
        sorting1 obj = new sorting1();
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter numbers:");
        for (i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        int n = 10;
        obj.value(arr, n);
        System.out.println("sorted array\n");
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
