package demo_004_Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class Day_002ArrayList {
    public static void main(String[] args) {
        demo();
    }
    public static void demo() {
        ArrayList<Person> arr = new ArrayList();
        Person one = new Person("HHH", 1);
        boolean fl = arr.add(one);
        arr.add(one);
        System.out.println("添加" + fl);
        System.out.println("长度：" + arr.size());
        System.out.println(arr.get(0).getName());
        System.out.println(arr.isEmpty());
        System.out.println("remove:" + arr.remove(0));
        System.out.println(arr.isEmpty());
    }
}
