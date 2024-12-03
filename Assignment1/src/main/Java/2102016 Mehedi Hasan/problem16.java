import java.text.SimpleDateFormat;
import java.util.Date;

public class problem16 {
    public static void main(String[] args) 
    {
        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date=new Date();
        System.out.println(f.format(date));
    }
}
