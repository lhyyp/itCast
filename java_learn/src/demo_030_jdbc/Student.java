package demo_030_jdbc;

import java.util.Objects;

public class Student {
    private int id;
    private String iphone;
    private String name;
    private  int class_id;
    private  int mgr;
    private  double balance;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", iphone='" + iphone + '\'' +
                ", name='" + name + '\'' +
                ", class_id=" + class_id +
                ", mgr=" + mgr +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && class_id == student.class_id && mgr == student.mgr && Double.compare(student.balance, balance) == 0 && Objects.equals(iphone, student.iphone) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iphone, name, class_id, mgr, balance);
    }

    public Student(int id, String iphone, String name, int class_id, int mgr, double balance) {
        this.id = id;
        this.iphone = iphone;
        this.name = name;
        this.class_id = class_id;
        this.mgr = mgr;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
