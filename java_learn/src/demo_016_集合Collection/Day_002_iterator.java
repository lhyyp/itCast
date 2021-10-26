package demo_016_集合Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Day_002_iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("1");
        coll.add("lhyyp");
        Iterator<String> it = coll.iterator();
        System.out.println(it);
        ha(it);
        for (String s : coll) {
            System.out.println(s);
        }
        coll.forEach(i -> {
            System.out.println(i);
        });
    }
    public static void ha(Iterator<String> it) {
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
