package demo_028_注解;

/**
 * @since 1.5
 *      *@Override
 *       *@Deprecated 表示已过时，他不推荐使用
 *       @SuppressWarnings("all") 压制警告
 */
public class Day_001_main {

    @Override
    public String toString() {
        return "Day_001_main{}";
    }
    @Deprecated
    public  void show(){
    }

    @SuppressWarnings("all")
    public  void show2(){}

    public  void show3(){}
}






