public class p3 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "";

        char firstChar1 = (str1.length() > 0) ? str1.charAt(0) : '#';
        char lastChar2 = (str2.length() > 0) ? str2.charAt(str2.length() - 1) : '#';

        String result = Character.toString(firstChar1) + Character.toString(lastChar2);

        System.out.println(result);
    }
}
