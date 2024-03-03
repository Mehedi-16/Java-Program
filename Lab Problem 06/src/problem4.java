import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {
        int[] originalArray = { 5, 20, 15, 10, 25, 30, 10, 40, 10 };

        int lastIndex = -1;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            if (originalArray[i] == 10) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            int[] newArray = Arrays.copyOfRange(originalArray, 0, lastIndex);
            System.out.println("Original Array: " + Arrays.toString(originalArray));
            System.out.println("New Array: " + Arrays.toString(newArray));
        } else {
            System.out.println("The array does not contain the value 10.");
        }
    }
}
