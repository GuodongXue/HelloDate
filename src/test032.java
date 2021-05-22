public class test032 {
    public static void main(String[] args) {
        //字符串转date
        java.sql.Date  d1 =  java.sql.Date.valueOf("2017-3-8");

        //sql date to util date
        java.util.Date d2 = d1;

        System.out.println(d2);
    }
}
