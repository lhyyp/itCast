package demo_025_jdk8新特性;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Day_005_stream {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("xe");
        arr.add("xexx");
        Stream<String> x = arr.stream()
                .filter(s -> s.startsWith("x") && s.length() > 2);
//        x.forEach(i-> System.out.println(i));
        System.out.println("--");
        Stream<String> limit = arr.stream()
                .map(i -> i + "dd")
                .skip(2)
                .limit(2);
//        limit.forEach(i-> System.out.println(i));
        System.out.println("-----77----");
        Stream<String> concat = Stream.concat(limit, x);
        concat.forEach(i-> System.out.println(i));


    }
}




