package demo_030_jdbc.druid;

import org.springframework.jdbc.core.JdbcTemplate;

public class Day_003_jdbcTemplate {
    public static void main(String[] args) {
        // 创建template
        JdbcTemplate tem = new JdbcTemplate(DruidUtils.getDataSource());
        String sql = "update student set balance = 400 where id = ?";
        // 调用方法
        int update = tem.update(sql, 1);
        System.out.println(update);

    }
}
