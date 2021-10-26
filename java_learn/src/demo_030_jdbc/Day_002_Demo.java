package demo_030_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Day_002_Demo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            String SQL = "INSERT INTO student (name ) VALUES ('王五1')";
             conn = DriverManager.getConnection("jdbc:mysql:///lhyyp", "root", "root");
             stmt = conn.createStatement();
            int i = stmt.executeUpdate(SQL);
            System.out.println(i);
            if(i > 0 ) {
                System.out.println("插入成功");
            }else{
                System.out.println("插入失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if(stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
