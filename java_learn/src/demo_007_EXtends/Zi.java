package demo_007_EXtends;

public class Zi extends Fu {
    int num = 77;
    public Zi() {
//        super(6666);
        this(4444);
        System.out.println("zi");
    }
    public Zi(int num) {
        this.num  = num;

    }
    public void ZiMethods() {
        super.ZiMethods();
        System.out.println("子类的方法");
    }
}
