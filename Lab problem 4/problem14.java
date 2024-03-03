public class problem14 {
    public static void main(String[] args) {
        String inputString = "MEHEDI HASAN";
        if (inputString.length() % 2 == 0) {
            int middleIndex = inputString.length() / 2;
            String firstHalf = inputString.substring(0, middleIndex);
            System.out.println("First half of the string: " + firstHalf);
        } else {
            System.out.println("The input string does not have an even length.");
        }
    }
}
