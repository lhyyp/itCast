package demo_016_集合Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Day_003_collections {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList();
        Collections.addAll(arr, "a", "b", "c", "dsdsdd", "e");
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("=-----------");
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(arr);
        ArrayList<Student> S = new ArrayList<>();
        Student S1 = new Student("hhh", 32);
        Student S2 = new Student("hhh", 2);
        Student S3 = new Student("hhh", 332);
        S.add(S1);
        S.add(S2);
        S.add(S3);
        System.out.println(S);
        Collections.sort(S);
        System.out.println(S);
        

    }
}
