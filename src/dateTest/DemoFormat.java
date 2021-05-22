package dateTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoFormat {
    //DateFormat df = new DateFormat();
    public static void main(String[] args) {

        //string 转 date
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = df1.parse("2018-3-6 12:36:34");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String str = df1.format(new Date());
        System.out.println(str);

        Date d2 = new Date();
        System.out.println(d2.toString());
    }
}
