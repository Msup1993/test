package src.date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date d = c.getTime();

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(c.getTime());
        c.add(c.MONDAY,-1);
        System.out.println(c.getTime());


    }

}
