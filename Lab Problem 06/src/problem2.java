import java.util.ArrayList;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(50);
        number.add(20);
        number.add(30);
        number.add(60);
        boolean b = number.contains(10);
        boolean c = number.contains(30);
        System.out.println(b);
        System.out.println(c);
    }
}
