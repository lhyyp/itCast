package demo_025_jdk8新特性;

import java.util.Arrays;
import java.util.Comparator;

public class Day_001_main {
    public static void main(String[] args) {
        show(() ->{
            System.out.println(1);
        });
        startThread(() -> System.out.println(System.currentTimeMillis()+Thread.currentThread().getName()));
        String[] arr = { "CCC", "DDDD", "AAA"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println("-----------");
        System.out.println(Arrays.toString(arr));

    }

    private static Comparator<String> getComparator() {
        return  (o1,  o2) -> o1.compareTo(o2);

    }

    private static void startThread(Runnable rab) {
        new Thread(rab).start();
    }

    private static void show(Day_001_interface IT) {
        IT.methods();
    }


}
