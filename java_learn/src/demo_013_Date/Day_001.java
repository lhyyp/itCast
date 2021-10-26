package demo_013_Date;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day_001 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d = new Date(1631946451054L);
        System.out.println(d);
        SimpleDateFormat ss = new SimpleDateFormat("yyyy年mm月dd日 HH时mm分ss秒");
        String str = ss.format(d);
        System.out.println(str);
        System.out.println(ss.format(1631947503652L));
        System.out.println("--------------");
        Calendar ca = Calendar.getInstance();
        ca.set(9998, 9, 22);
        ca.add(Calendar.YEAR, 1);
        ca.add(Calendar.DATE, -8);
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
        System.out.println(ca.get(Calendar.DATE));
        System.out.println(ca.getTime());
        System.out.println(ss.format(ca.getTime()));
    }

}
