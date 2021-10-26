package demo_005_String;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Day_001 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.toUpperCase(Locale.ROOT));
        byte [] bt = { 97, 98, 99 };
        char [] ch = { 'a', 'b', 'c' };
        String str2 = new String(bt);
        System.out.println(str2);
        String str1 =  new String(ch);
        System.out.println(str1);
        System.out.println(str2 == str1);
        System.out.println("===============");
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.toUpperCase(Locale.ROOT).equals(str2));
        System.out.println(str.charAt(1));
        System.out.println("===========fffff===========");
        String[] bs = str.split("b");
        System.out.println(bs);
        System.out.println("==============a,.s========");

    }
}
