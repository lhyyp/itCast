package demo_008_abstract.redPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Day_001 {
    static int id = 0;
    public static void main(String[] args) {
        Boss boss = new Boss("张三", 100);
        List<Integer> sendList = boss.send(20, 10);
        List<Staff> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String name = String.valueOf(id);
            userList.add(new Staff(0, name));
            id++;
        }
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            generateRandom(indexList);
        }
        System.out.println(indexList);
        for (int i = 0; i < indexList.size(); i++) {
            userList.get(indexList.get(i)).grab(sendList.get(i));
            userList.get(indexList.get(i)).show();
        }
        boss.show();

    }
    public static void generateRandom( List<Integer> indexList) {
        int index = new Random().nextInt(100);
        if (!indexList.contains(index)) {
            indexList.add(index);
        }else {
            generateRandom(indexList);
        }
    }
}
