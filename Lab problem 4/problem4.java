import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the secend:");
        int secend=input.nextInt();
        int hour=secend/3600;
        int minute=(secend -(3600*hour))/60;
        secend=(secend -(3600*hour)-(minute*60));
        System.out.println(" "+hour+":"+minute+":"+secend);

    }
    
}
