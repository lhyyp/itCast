package demo_027_反射;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Day_001_main {
    public static void main(String[] args) throws Exception {
        //  方法1
        Class<?> aClass = Class.forName("demo_027_反射.Person");
        System.out.println(aClass);

        //  方法2
        Class<Person> p = Person.class;
        System.out.println(p);
        // 1-- getFields() 只能获取 public 修饰的成员变量
        Field[] fields = p.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field aa = p.getField("aa");
        // 2-- 获取私有变量
        Field name = p.getDeclaredField("name");
        // 2--1 忽略访问权限修饰符安全检查（暴力反射）
        name.setAccessible(true);
        // 3-- 获取构造方法
        System.out.println("获取构造方法");
        Constructor<Person> cc = p.getConstructor(String.class, int.class);
        System.out.println(cc);
        Person lhyyp = cc.newInstance("lhyyp", 22);
        System.out.println(lhyyp);


        //  方法3
        Person p1 = new Person();
        Class<? extends Person> aClass1 = p1.getClass();
        System.out.println(aClass1);
        aa.set(p1, "hello");
        System.out.println(p1);
        // 获取成员变量 aa
        Object o = aa.get(p1);
        System.out.println(o);

        Object o1 = name.get(p1);
        System.out.println(o1);


    }
}
