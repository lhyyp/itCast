package demo_030_jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Day_007_jdbc_pool {
    public static void main(String[] args) throws SQLException {
//        ComboPooledDataSource ds = new ComboPooledDataSource();
        ComboPooledDataSource ds = new ComboPooledDataSource("myApp");
        for (int i = 0; i <= 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i +":"+ conn);
            if(i == 5) {
                conn.close();
            }
        }

    }
}
