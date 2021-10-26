package demo_020_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day_001 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String put = map.put("li", "lll");
        System.out.println(put);
        String p1 = map.put("li0", "lll11");
        System.out.println(p1);
        System.out.println(map);
        boolean li = map.containsKey("li");
        System.out.println(li);

        Set<String> set = map.keySet();
        System.out.println("--------------");
        for (String string : set) {
            System.out.println(string+":"+map.get(string));
        }
        System.out.println("--------------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            String s = map.get(key);
            System.out.println(key+ ":"+ s);
        }


        System.out.println("----------2-------");
        Set<Map.Entry<String, String>> en = map.entrySet();
        for (Map.Entry<String, String> entry : en) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
