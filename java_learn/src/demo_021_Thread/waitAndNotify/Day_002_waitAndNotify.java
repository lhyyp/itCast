package demo_021_Thread.waitAndNotify;

public class Day_002_waitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("a:老板，有包子没？");
                        try {
                            obj.wait(5000);
                            System.out.println("aaa"+33333);
                            System.out.println("-------------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("b:老板，有包子没？");
                        try {
                            obj.wait(5000);
                            System.out.println("bbbb"+33333);
                            System.out.println("-------------");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("老板：正在做包子。。。");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板：包子做好了");
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
