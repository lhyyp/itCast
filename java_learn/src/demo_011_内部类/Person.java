package demo_011_内部类;

public class Person {
    String name;
    public class Heart {
        public Heart() {
        }
        public Heart(String a) {
            name = a;
        }

        public void beat() {
            System.out.println("我是：" + name + "跳动的心脏");
        }
    }
    public void Methods() {
        new Heart().beat();
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
