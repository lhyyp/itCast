package demo_021_Thread.waitAndNotify;

public class Day_003_waitAndNotify {
    public static void main(String[] args) {
        BaoZi BZ = new BaoZi();
        new BaoZiPu(BZ).start();
        new Person(BZ).start();

    }
}
