package demo_012_Object;

public class Day_001 {
    public static void main(String[] args) {
        Person p = new Person(11, "hhh");
        System.out.println(p.getClass());
        Person p2 = new Person(11, "hhh");
        System.out.println(p2.equals(p));
    }
}
