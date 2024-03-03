
public class problem5 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 1};
        int[] numbers2 = {1, 2, 3, 4, 5, 6};

        int l = 3;

        boolean areSame = areSameAtStartAndEnd(numbers1, l);
        System.out.println("Are the first and last " + l + " elements the same in numbers1? " + areSame);

        areSame = areSameAtStartAndEnd(numbers2, l);
        System.out.println("Are the first and last " + l + " elements the same in numbers2? " + areSame);
    }

    public static boolean areSameAtStartAndEnd(int[] arr, int l) {
        if (arr.length < 2 * l) {
            return false;
        }
        for (int i = 0; i < l; i++) {
            if (arr[i] != arr[arr.length - l + i]) {
                return false;
            }
        }

        return true;
    }
}

