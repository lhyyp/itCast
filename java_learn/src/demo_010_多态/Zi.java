package demo_010_多态;

public class Zi extends Fu {
    int num = 30;
    private final String name;
     public int a = 2;
    protected int b = 3;
    int c= 1;
    int d= 0;

    public Zi() {
        name = "name";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Methods() {
        System.out.println("Zi方法"+ num);
    }
    public void MethodsZI() {
        System.out.println("Zi特有方法"+ num);
    }
}
