package demo_020_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day_001 {
    public static void main(String[] args) throws ParseException {
        Throwable ERR = new Throwable();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        date = sdf.parse("1999-4-9");
        System.out.println(date);
        try {
            getElement(new int[]{1, 2, 4, 6}, 20);
        }catch (Exception E){
            System.out.println(E.getMessage());
            System.out.println(E.toString());
        }finally {
            System.out.println("finally");
        }

    }

    public static int getElement(int[] arr, int index) {
        System.out.println(index);
        if (arr == null) throw new NullPointerException("arr是空");
        if (index <0) throw new NullPointerException("index是空");
        if (index > arr.length) throw new ArrayIndexOutOfBoundsException("长度超出异常");
        int ele = arr[index];
        return ele;

    }
}
