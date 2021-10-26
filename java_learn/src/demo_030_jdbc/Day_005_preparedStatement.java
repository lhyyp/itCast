package demo_030_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Day_005_preparedStatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Student> arr = new ArrayList();
        try {
            // 1、注册驱动
            conn = Day_003_jdbcUtils.getConnection();
            String SQL = "select * from student where id = ? or name = ?";
            stmt = conn.prepareStatement(SQL);
//            // 给问号赋值
            stmt.setInt(1, 1);
            stmt.setString(2, "悟空");
            rs = stmt.executeQuery();
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