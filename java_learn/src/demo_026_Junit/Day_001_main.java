package demo_026_Junit;

public class Day_001_main {
    public static void main(String[] args) {
        Day_001_Calculator C = new Day_001_Calculator();
        int add = C.add(1, 3);
        System.out.println(add);
        int add1 = C.sub(1, 3);
        System.out.println(add1);
    }
}
