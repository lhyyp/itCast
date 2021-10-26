package demo_007_EXtends;

public class Day_001 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println("年龄："+ zi.age);
        System.out.println(zi.num);
        zi.ZiMethods();
        Zi.FuMethods();
        Zi Z2 = new Zi(99);
        System.out.println(zi.num);
    }
}
