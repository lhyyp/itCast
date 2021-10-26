package demo_009_interface;

public class Day_001 implements Hello, Hell_1 {
    @Override
    public void methodsAbs() {

    }

    @Override
    public void abs() {

    }

    @Override
    public void hell() {
        Hello.super.hell();
        System.out.println("我重写了HELL");
    }

    @Override
    public Void HELL_0() {
        return null;
    }
}
