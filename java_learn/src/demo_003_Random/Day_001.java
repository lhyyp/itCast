package demo_003_Random;

import java.util.Random;

public class Day_001 {
    public static void main(String[] args) {
        Random rs = new Random();
        System.out.println("随机数：" + rs.nextInt(100));
        System.out.println("随机数：" + rs.nextBoolean());
    }
}
