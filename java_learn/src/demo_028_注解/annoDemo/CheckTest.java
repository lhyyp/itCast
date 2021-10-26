package demo_028_注解.annoDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator cal = new Calculator();
        Class cls = cal.getClass();
        Method[] methods = cls.getMethods();
        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\\\work\\\\java_learn\\\\src\\\\demo_028_注解\\\\annoDemo\\\\bug.txt"));
        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(cal);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName()+"方法出错了");
                    bw.newLine();
                    // e.getCause() 获取到异常实体类
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------");
                    bw.newLine();
                }
            }
        }
        bw.write("一共"+num+"异常");
        bw.flush();
        bw.close();
    }
}
