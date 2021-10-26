package demo_021_Thread.waitAndNotify;

public class Person extends Thread{
    private BaoZi bz;

    public Person(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run() {
        while (true){
            synchronized (bz) {
                if(bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("person: 吃包子");
                bz.notify();
                bz.flag = false;
                System.out.println("person: 吃完了，快去做包子");
                System.out.println("---------");
            }
        }
    }
}
