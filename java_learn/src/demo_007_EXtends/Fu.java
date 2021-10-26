package demo_007_EXtends;

public class Fu {
    int age ;
    int num = 79;
    public Fu() {
        System.out.println("fu");
    }
    public Fu(int num) {
        age = num;
        System.out.println(num);
        System.out.println("父类的构造方法");
    }
    public static void FuMethods() {
        System.out.println("父类的方法");
    }
    public void ZiMethods() {
        System.out.println("父类ZHONG子类的方法");
    }
}
