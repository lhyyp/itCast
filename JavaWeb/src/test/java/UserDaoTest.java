import itCast.dao.UserDao;
import itCast.domain.User;
import org.junit.Test;



public class UserDaoTest {
    @Test
    public void testLogin() {
        User user = new User();
        user.setUserName("lhyyp");
        user.setPassword("123");
        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        System.out.println(login);
    }
}
