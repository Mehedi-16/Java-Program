public class problem13 {
    public static void main(String[] args) {
        String originalString = "50101";
        if (originalString.length() >= 3) {
            String lastThreeChars = originalString.substring(originalString.length() - 3);
            String newString = lastThreeChars + lastThreeChars + lastThreeChars + lastThreeChars;
            
            System.out.println("Original String: " + originalString);
            System.out.println("New String: " + newString);
        } 
        else {
            System.out.println("Original string must have a length of 3 or more.");
        }
    }
}
