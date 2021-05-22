import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.getActualMaximum(Calendar.DATE));
        cal.set(Calendar.YEAR, 2001);
        cal.set(Calendar.MONTH, 6);
        System.out.println(cal);

        //字符串转calendar类型
        java.sql.Date d = java.sql.Date.valueOf("2019-3-5");
        cal.setTime(d);
        System.out.println(d);
    }
}
