package demo_001_JavaWeb.demo_001_servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "Servlet", value = "/Day_005_Servlet")
public class Day_005_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // 1、获取请求方式
        String method = req.getMethod();
        System.out.println("1:" + method);
        // 2、获取虚拟目录
        String cp = req.getContextPath();
        System.out.println("2:" + cp);
        // 3、获取Servlet 路径
        String sp = req.getServletPath();
        System.out.println("3:" + sp);
        // 4、获取请求参数
        String qs = req.getQueryString();
        System.out.println("4:" + qs);
        // 5、获取请求URI
        String URI = req.getRequestURI();
        System.out.println("5-1:" + URI);
        StringBuffer URL = req.getRequestURL();
        System.out.println("5-2:" + URL);
        // 6、获取协议及版本
        String protocol = req.getProtocol();
        System.out.println("6:" + protocol);
        // 7、获取ip
        String remoteAddr = req.getRemoteAddr();
        System.out.println("7:" + remoteAddr);
        // 8、获取请求头
        String cookie = req.getHeader("Cookie");
        System.out.println(cookie);
        Enumeration<String> hn = req.getHeaderNames();
        while (hn.hasMoreElements()){
            String s = hn.nextElement();
            System.out.println(s+":"+req.getHeader(s));
        }
        System.out.println("----------");
        System.out.println(req.getHeader("referer"));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
