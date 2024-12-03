
public class java {

    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 1, 3, 4, 7};
        bubble(arr);
        System.out.println("sorting:  ");
        print(arr);
    }

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i]);
        }
    }

}
