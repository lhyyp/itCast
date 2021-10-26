package demo_025_jdk8新特性;

public class Day_006_Lambda {
    public static void main(String[] args) {
        P((s) -> System.out.println(s+"1"), "1");
        P((s) -> System.out.println(s+"2"), "2");
        Day_006 d = new Day_006();
        P(System.out::println, "3");
        P(d::out, "4");


    }

    private static void P(Day_006_interface D, String a) {
        D.methods(a);
    }

}
