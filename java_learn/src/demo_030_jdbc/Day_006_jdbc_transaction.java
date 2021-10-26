package demo_030_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Day_006_jdbc_transaction {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt1 = null;
        try {
            // 1、注册驱动
            conn = Day_003_jdbcUtils.getConnection();
            // 开启事务
            conn.setAutoCommit(false);
            // 定义sql
            String SQL = " UPDATE student set  balance  = balance - ?  where id = ?";
            String SQL1 = " UPDATE student set  balance  = balance + ?  where id = ?";
            // 获取执行sql 对象
            stmt = conn.prepareStatement(SQL);
            stmt1 = conn.prepareStatement(SQL1);
            // 给问号赋值
            stmt.setDouble(1, 500);
            stmt.setInt(2, 1);
            stmt1.setDouble(1, 500);
            stmt1.setInt(2, 2);
            // 执行sql
            stmt.executeUpdate();
            int i = 3/0;
            stmt1.executeUpdate();
            // 提交事务
            conn.commit();

        } catch (Exception e) {
            try {
                // 回滚事务
                if(conn != null) conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            Day_003_jdbcUtils.close(stmt, conn);
            Day_003_jdbcUtils.close(stmt1, null);
        }
    }
}