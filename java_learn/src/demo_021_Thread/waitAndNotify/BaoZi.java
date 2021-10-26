package demo_021_Thread.waitAndNotify;

public class BaoZi {
    String pi;
    String xian;
    Boolean flag = false;

    @Override
    public String toString() {
        return "Baozi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                ", flag=" + flag +
                '}';
    }

    public BaoZi(String pi, String xian, Boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public BaoZi() {
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
