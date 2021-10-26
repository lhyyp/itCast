package demo_001_JavaWeb.demo_001_servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Day_007_forward")
public class Day_007_forward extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(req.getContextPath());
        System.out.println("Day_007_forward被访问了");
        // 重定向
        resp.sendRedirect("/JavaWeb/Day_005_Servlet");
        req.setAttribute("hello", "word");
        // 转发
        // 注意：1、只能访问服务器内部资源
        req.getRequestDispatcher("/Day_006_response").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
