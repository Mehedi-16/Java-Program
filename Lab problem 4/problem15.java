public class problem15 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";
        if (str1.length() != str2.length()) {
            String shortString, longString;
            if (str1.length() < str2.length()) {
                shortString = str1;
                longString = str2;
            } else {
                shortString = str2;
                longString = str1;
            }

            String result = shortString + longString + shortString;
            System.out.println("Resulting string: " + result);
        } else {
            System.out.println("Both input strings have the same length.");
        }
    }
}
