package demo_022_Lambda;

public class LamableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
