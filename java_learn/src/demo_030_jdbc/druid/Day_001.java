package demo_030_jdbc.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Day_001 {
    public static void main(String[] args) throws Exception {
        // 3 加载配置文件
        Properties pro = new Properties();
        ClassLoader cl = Day_001.class.getClassLoader();
        InputStream rs = cl.getResourceAsStream("demo_030_jdbc/druid/druid.properties");
        pro.load(rs);
        // 获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection conn = ds.getConnection();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+":"+conn);
        }

    }
}
