package demo_019_set;

import java.util.HashSet;

public class Day_002_hashSet {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("lhy", 12);
        Student s2 = new Student("lhy", 13);
        Student s3 = new Student("lhy", 12);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s3));
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

    }
}
