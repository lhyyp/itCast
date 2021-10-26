package demo_018_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day_01 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("a");
        arr.add(2,"a");
        System.out.println(arr);
        LinkedList<String> a = new LinkedList<>();
        a.add("a");
        a.push("b");

        System.out.println(a);
        a.addFirst("fff");
        System.out.println(a);
        a.addLast("ee");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
    }

}
