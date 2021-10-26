package demo_016_集合Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Day_001 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        System.out.println(coll);
        boolean lhyyp = coll.add("lhyyp");
        System.out.println(lhyyp+":"+coll);
        coll.add("二营长");
        coll.remove("lhyyp1");
        System.out.println(coll);
        boolean hh = coll.contains("二营长");
        System.out.println(hh);
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
    public static void add() {}
}
