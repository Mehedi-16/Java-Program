import java.util.Scanner;

class insertion {
    void soritng(int arr[], int n) {
        int i, j;
        int temp;
        for (i = 0; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}

public class insertion_sorting {
    public static void main(String[] args) {
        int i;
        insertion obj = new insertion(); 
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter numbers:");
        for (i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        int n = 10;
        obj.soritng(arr, n); 
        System.out.println("sorted array\n");
        for (i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
