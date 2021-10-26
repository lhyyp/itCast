package demo_026_Junit.test;

import demo_026_Junit.Day_001_Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Day_001_CalculatorTest {
    /**
     * Before
     * 会在测试方法之前执行
     */
    @Before
    public void  init() {
        System.out.println("init-------------");
    }

    /**
     * 测试add方法
     */
    @Test
    public void addTest(){
        Day_001_Calculator c = new Day_001_Calculator();
        int add = c.add(1, 2);
        System.out.println(add);
        Assert.assertEquals(4, add);
    }

    /**
     * After
     *  会在测试方法之后执行
     */
    @After
    public void close() {
        System.out.println("----------------close");
    }
}
