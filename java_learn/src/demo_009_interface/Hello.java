package demo_009_interface;

public interface Hello {
    public static final int num = 0;
    public abstract void methodsAbs();
    void abs();
    default void hell() {
        System.out.println("这是新添加的默认方法");
        say();
    }
    static void eat() {
        System.out.println("静态方法");
        say();
    }

    static void say(){
        System.out.println("aaa");
        System.out.println("bbb");
    }
}
