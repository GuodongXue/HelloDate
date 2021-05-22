package dateTest;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        //创建一个date对象
        Date d = new Date();
        System.out.println(d.toGMTString());//这个方法叫过时了， 废弃了
        System.out.println(d.toLocaleString());
        Long time01 = System.currentTimeMillis();
        System.out.println(time01);

        java.sql.Date date001 = new java.sql.Date(1621718300867L);
        //只打年月日， 继承自util的date
        System.out.println(date001);
        //Date d2 = date001; //把子类转成父类
        //java.sql.Date d3 = (java.sql.Date)d2;
        java.sql.Date date = java.sql.Date.valueOf("2019-3-8");

    }
}
