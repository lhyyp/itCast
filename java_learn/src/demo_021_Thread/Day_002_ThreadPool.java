package demo_021_Thread;

import java.util.concurrent.*;

public class Day_002_ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        // 清空线程池
        es.shutdown();
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
    }
}
