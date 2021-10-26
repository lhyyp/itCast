package itCast.web.servlet;

import itCast.dao.UserDao;
import itCast.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");



//        String userName = req.getParameter("userName");
//        String password = req.getParameter("password");
//
//        User user = new User();
//        user.setUserName(userName);
//        user.setPassword(password);

        Map<String, String[]> map = req.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserDao userDao = new UserDao();
        User loginUser = userDao.login(user);

        if (loginUser == null){
            req.getRequestDispatcher("/errorServlet").forward(req, res);
        }else {
            req.setAttribute("user", user);
            req.getRequestDispatcher("/successServlet").forward(req, res);
        }

    }
}
