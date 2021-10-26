package demo_030_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Day_002_jdbc_query {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List <Student> arr = new ArrayList<>();
        try {
            // 1、注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            String SQL = "select * from student";
            conn = DriverManager.getConnection("jdbc:mysql:///lhyyp", "root", "root");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
            Student stu = null;
            while (rs.next()) {
                stu  = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setIphone(rs.getString("phone"));
                stu.setClass_id(rs.getInt("class_id"));
                stu.setMgr(rs.getInt("mgr"));
                stu.setBalance(rs.getDouble("balance"));
                arr.add(stu);
            }
            System.out.println(arr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs!=null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
