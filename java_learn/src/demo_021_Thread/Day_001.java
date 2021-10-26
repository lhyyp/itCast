package demo_021_Thread;

public class Day_001 {
    public static void main(String[] args) {
        RunnableImpi run = new RunnableImpi();
        Thread T = new Thread(run);
        Thread T1 = new Thread(run);
        Thread T2 = new Thread(run);
        T.start();
        T1.start();
        T2.start();

    }
}
