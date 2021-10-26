package demo_030_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Day_004_jdbcUtilsDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Student> arr = new ArrayList();
        try {
            // 1、注册驱动
            conn = Day_003_jdbcUtils.getConnection();
            String SQL = "select * from student";
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
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Day_003_jdbcUtils.close(rs, stmt, conn);
        }
    }
}
