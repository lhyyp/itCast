package demo_010_多态;

public class Day_001 {

    public static void main(String[] args) {
        Fu one = new Zi();
        one.Methods();
        one.MethodsFU();
        System.out.println(one.num);
        Zi one1 = (Zi) one;
        one1.MethodsZI();
    }
}
