package demo_021_Thread.waitAndNotify;

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                bz.pi = "破皮";
                bz.xian = "二锅头";
                System.out.println("包子铺正在生产包子:包子皮" + bz.pi);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产包子:包子皮" + bz.pi);
            }
        }
    }
}
