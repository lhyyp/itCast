package demo_021_Thread;

public class RunnableImpi implements Runnable {
    private int num = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (num > 0) {
            payTicket();
//            synchronized (obj) {
//                if (num > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + '：' + num);
//                    num--;
//                }
//            }
        }
    }
    public synchronized void payTicket(){
        if (num > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + '：' + num);
            num--;
        }
    }


}
