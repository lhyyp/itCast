package demo_025_jdk8新特性;

import java.util.function.Function;

public class Day_004_function {
    public static void main(String[] args) {
        int helLo = change(
                "1235",
                (s) -> Integer.parseInt(s)
        );
        System.out.println(helLo);
        int helLo1 = change2(
                "1235",
                (s) -> Integer.parseInt(s),
                (s) -> s+=1
        );
        System.out.println(helLo1);
    }

    private static Integer change(String s, Function<String, Integer> fun) {
        return fun.apply(s);
    }
    private static Integer change2(String s, Function<String, Integer> fun, Function<Integer, Integer> fun1) {
        Integer apply = fun.andThen(fun1).apply(s);
        System.out.println(apply);
        return apply;
    }
}
