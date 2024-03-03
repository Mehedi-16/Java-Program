
import java.util.ArrayList;

public class problem3 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        number1.add(50);
        number1.add(20);
        number1.add(30);
        number1.add(60);
        System.out.println(number1);
        number2.add(10);
        number2.add(60);
        number2.add(70);
        number2.add(80);
        number1.addAll(number2);
        System.out.println(number1);
    }
}
