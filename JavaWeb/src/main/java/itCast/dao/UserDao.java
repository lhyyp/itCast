package itCast.dao;


import itCast.domain.User;
import itCast.util.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate tem = new JdbcTemplate(DruidUtils.getDataSource());

    /**
     * 登录
     * @param loginUser 只有用户名密码
     * @return User 全部信息
     */
    public User login(User loginUser) {
        try {
            System.out.println(loginUser);
            String SQL = " select * from user where userName = ? and password = ?";
            User user = tem.queryForObject(SQL,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUserName(), loginUser.getPassword()
            );
            return user;
        }catch (Exception e) {
            return null;
        }

    }
}
