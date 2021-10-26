package demo_028_注解;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import demo_027_反射.Person;

import java.lang.annotation.Retention;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Pro(className = "demo_028_注解.Person", MethodsName = "eat")
public class ProTest {
    public static void main(String[] args) throws Exception {
        // 1解析注解
        //  1.1获取该类的字节码文件对象
        Class<ProTest> pro = ProTest.class;
        //2获取上边的注解对象
        Pro ano = pro.getAnnotation(Pro.class);
        // 3调用注解对象中定义的抽线方法，获取返回值
        String s = ano.className();
        String s1 = ano.MethodsName();

        Class<?> cls = Class.forName(s);
        // 4加载类进内存
        Method method = cls.getMethod(s1);
        // 5创建对香
        Object o = cls.newInstance();
        // 6获取对象方法
        Method method1 = cls.getMethod(s1);
        // 7 调用方法
        method1.invoke(o);

    }
}
