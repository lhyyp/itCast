package demo_006_Static;

import java.util.Arrays;

public class Day_001 {
    public static void main(String[] args) {
        Student one = new Student("lhyyp", 15);
        Student.room = "101";
        Student two = new Student("hhhh", 18);
        System.out.println(Student.room);
        String str = "sfsdfbcvbfrge";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
    }
}
