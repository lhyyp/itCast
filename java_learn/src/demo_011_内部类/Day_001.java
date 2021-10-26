package demo_011_内部类;

public class Day_001 {
    public static void main(String[] args) {
        Person per = new Person("lhyyp");
        per.Methods();
        Person.Heart jj = new Person("HHHH").new Heart("二营长");
        jj.beat();
        createMy().Methods();
    }
    public static MyInterface createMy () {
        MyInterface some = new MyInterface() {
            @Override
            public void Methods() {
                System.out.println("MyInterface");
            }
        };
        return some;
    }
}
