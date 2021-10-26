package demo_022_Lambda;

public class Day_001 {
    public static void main(String[] args) {
        LamableImpl l = new LamableImpl();
        Thread th = new Thread(l);
        th.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t = new Thread(runnable);
        t.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        System.out.println("-------------");
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }).start();

    }
}
