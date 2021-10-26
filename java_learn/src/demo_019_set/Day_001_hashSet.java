package demo_019_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Day_001_hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
