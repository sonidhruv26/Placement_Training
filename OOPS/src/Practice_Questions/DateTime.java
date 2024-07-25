package Practice_Questions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date d1 = new Date(2003-1900,3-1,26,10,10,10);
        Date d2 = new Date(2023-1900,4-1,06);
        System.out.println(d2.compareTo(d1));

        DateFormat df = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss EEEE");
        String strDate = df.format(d1);
        System.out.println(strDate);
    }
}
