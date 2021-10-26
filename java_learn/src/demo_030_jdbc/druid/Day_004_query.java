package demo_030_jdbc.druid;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day_004_query {
    private JdbcTemplate tem = new JdbcTemplate(DruidUtils.getDataSource());

    @Test
    public void update() {
        String sql = "update student set balance = 400 where id = ?";
        int update = tem.update(sql, 1);
        System.out.println(update);
    }

    @Test
    public void add() {
        String sql = "INSERT INTO student (name ) VALUES (?)";
        int update = tem.update(sql, "郭靖");
        System.out.println(update);
    }

    @Test
    public void delete() {
        String sql = "delete from student where name = ?";
        int update = tem.update(sql, "郭靖");
        System.out.println(update);
    }

    @Test
    public void select() {
        String sql = "select * from student ";
        List<Map<String, Object>> maps = tem.queryForList(sql);
        for (int i = 0; i < maps.size(); i++) {
            Map<String, Object> obj = maps.get(i);
            Set<String> strings = obj.keySet();
            for (String string : strings) {
                System.out.println(string+":"+obj.get(string));
            }
            System.out.println(maps.get(i));
        }
        System.out.println(maps);
    }

    @Test
    public void select1() {
        String sql = "select * from student ";
        List<Student> query = tem.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setPhone(rs.getString("phone"));
                stu.setClass_id(rs.getInt("class_id"));
                stu.setMgr(rs.getInt("mgr"));
                stu.setBalance(rs.getDouble("balance"));
                return stu;
            }
        });
        System.out.println(query);
    }

    @Test
    public void select2() {
        String sql = "select * from student ";
        List<Student> query = tem.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println(query);
    }
    @Test
    public void select3() {
        String sql = "select count(id) from student ";
        Long aLong = tem.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }
}
