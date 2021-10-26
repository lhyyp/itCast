package demo_015_包装类;

public class Day_001 {
    public static void main(String[] args) {
        Integer aa = new Integer(1);
        System.out.println(aa);
        double bb = new Integer("11");
        System.out.println("bb:"+ bb);
        Integer cc = new Integer('a');
        System.out.println(cc);
        int i = cc.intValue();
        System.out.println(i);
        int i1 = Integer.parseInt("222");
        System.out.println(Integer.toString(i1));


    }
}
