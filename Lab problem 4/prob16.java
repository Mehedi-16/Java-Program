import java.util.Scanner;

public class prob16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a String: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        if (words.length >= 2) {
            String penultimateWord = words[words.length - 2];
            System.out.println("Penultimate word: " + penultimateWord);
        } else {
            System.out.println("The sentence does not contain a penultimate word.");
        }
    }
}
