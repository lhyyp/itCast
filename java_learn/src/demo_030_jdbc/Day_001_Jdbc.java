package demo_030_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Day_001_Jdbc {
    public static void main(String[] args) throws Exception {
        // 1、导入驱动 jar 包
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lhyyp", "root", "root");
        String sql = "UPDATE student set  balance  = 100  where id = 1";
        Statement stat = conn.createStatement();
        int i = stat.executeUpdate(sql);
        System.out.println(i);
        stat.close();
        conn.close();
    }
}
