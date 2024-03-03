import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = "The quick brown fox";
        String str2 = "";

        int len = str1.length();

        for (int i = len - 1; i >= 0; i--) 
        {
            str2 = str2 + str1.charAt(i);
        }

        System.out.println(str2);
    }
}
