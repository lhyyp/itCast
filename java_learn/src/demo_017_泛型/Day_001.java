package demo_017_泛型;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day_001 {
    public static void main(String[] args) {
        List aa = Arrays.asList("A", "B", "X" ) ;
        String[] nn = {"A", "B", "X" };
//        Collections.shuffle(aa);
        System.out.println(aa);
        System.out.println(Arrays.toString(nn));
    }
}
