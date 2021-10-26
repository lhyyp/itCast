package demo_030_jdbc.druid;

import java.util.Objects;

public class Student {
    private int id;
    private String phone;
    private String name;
    private  Integer class_id;
    private  Integer mgr;
    private  Double balance;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", class_id=" + class_id +
                ", mgr=" + mgr +
                ", balance=" + balance +
                '}';
    }

    public Student(int id, String phone, String name, Integer class_id, Integer mgr, Double balance) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.class_id = class_id;
        this.mgr = mgr;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public Integer getMgr() {
        return mgr;
    }

    public Double getBalance() {
        return balance;
    }
}
