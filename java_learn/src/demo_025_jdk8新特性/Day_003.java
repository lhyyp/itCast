package demo_025_jdk8新特性;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Day_003 {
    public static void main(String[] args) {
        String[] arr = { "二哈","金毛", "藏獒" };
        print(arr, (s) -> {
            System.out.println(s.split("")[0]);
        }, (s)-> {
            System.out.println(s.split("")[1]);
        });
        Boolean d = checkStr("hello word", (s) -> {
            if (s.length() > 3) {
                System.out.println(s);
            }
            return s.length() > 3;
        });
        System.out.println(d);
        Boolean w = checkStrQ(
            "hello yy word",
            (s) ->  s.length() > 3,
            (s) -> s.contains("y")
        );
        System.out.println(w);

    }

    private static void print(String[] arr, Consumer<String> c1, Consumer<String> c2) {
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }

    private static Boolean checkStr(String str, Predicate<String> c1) {
        return c1.test(str);
    }
    private static Boolean checkStrQ(String str, Predicate<String> c1, Predicate<String> c2) {
        return c1.and (c2).negate().test(str);
//        return c1.test(str) && c2.test(str);
    }
}
