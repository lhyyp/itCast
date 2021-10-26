package demo_009_interface;

public class Day_002 implements Hello{
    @Override
    public void methodsAbs() {
        System.out.println("methodsAbs");
    }

    @Override
    public void abs() {
        System.out.println("abs");
    }
}
