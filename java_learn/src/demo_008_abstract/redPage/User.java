package demo_008_abstract.redPage;

public class User {
    private int num;
    private String name;

    public User(int num, String name) {
        this.num = num;
        this.name = name;
    }
    public void show() {
        System.out.println("我叫：" + name +",我有"+ num);
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
