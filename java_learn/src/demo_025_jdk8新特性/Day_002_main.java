package demo_025_jdk8新特性;

import java.util.function.Supplier;

public class Day_002_main {
    public static void main(String[] args) {
        String str = getString(() -> "胡歌");
        System.out.println(str);
        Integer[] a = {55, 88, 100};
        int b = getInteger(() -> {
            int max = a[0];
            for (Integer integer : a) {
                if(integer> max){
                    max = integer;
                }
            }
            return  max;
        });
        System.out.println(b);
        System.out.println("-----------------");
        System.out.println(getIntegers(new int[]{55, 88, 100}));
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }
    private static Integer getIntegers(int[] sup) {
        int max = sup[0];
        for (Integer integer : sup) {
            if(integer> max){
                max = integer;
            }
        }
        return  max;
    }
}
