package dateTest;

import java.util.Calendar;
import java.util.Scanner;

public class MakeCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the date, example: 2019-3-7");
        String strDate = sc.next();


        //将字符串转成date
        java.sql.Date d = java.sql.Date.valueOf(strDate);

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        //output the weekday
        System.out.println("Sun\tMon\tTue\tWed\tThr\tFri\tSat");
        //遍历1-本月最大天的数字
        //求1号是那一天
        int max = cal.getActualMaximum(Calendar.DATE);
        int nowday = cal.get(Calendar.DATE);
        cal.set(Calendar.DATE, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int space = dayOfWeek-1;

        int count =space;
        for(int i = 1; i<= space; i++){
            System.out.print("\t");
        }
        for(int i = 1; i<= max; i++){
            //Current day
            if(i== nowday){
                System.out.print(i+"*\t");
            }else {
                System.out.print(i + "\t");
            }
            count++;
            if(count%7==0){
                System.out.println();
            }
        }

    }
}
