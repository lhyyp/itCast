package demo_014_Stringbuilder;

public class Day_001 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("adc");
        System.out.println(str);
        str.append("dddd");
        System.out.println(str);
        String s = str.toString();
        System.out.println(s);
        System.out.println(s.equals(str));
    }
}
