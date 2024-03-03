 import java.util.Scanner;
public class probleem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) 
        {
            char character = str.charAt(i);

            if (Character.isLetter(character)) {
                letterCount++;
            } else if (Character.isDigit(character)) {
                numberCount++;
            } else if (Character.isWhitespace(character)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Other character count: " + otherCount);
    }
 
}
