package demo_030_jdbc.druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Day_002 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DruidUtils.getConnection();
            String sql = "INSERT INTO student (name ) VALUES (?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "hello word");
            int i = pstmt.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DruidUtils.close(pstmt, conn);
        }



    }
}
