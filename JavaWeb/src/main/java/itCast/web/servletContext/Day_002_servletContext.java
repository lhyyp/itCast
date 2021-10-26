package itCast.web.servletContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Day_002_servletContext", value = "/Day_002_servletContext")
public class Day_002_servletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        System.out.println(sc.getAttribute("hh"));
        // 获取文件的服务器路径
        String realPath = sc.getRealPath("/c.txt");
        System.out.println(realPath);
        String realPath1 = sc.getRealPath("/b.txt");
        System.out.println(realPath1);
        String realPath2 = sc.getRealPath("/a.txt");
        System.out.println(realPath2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
