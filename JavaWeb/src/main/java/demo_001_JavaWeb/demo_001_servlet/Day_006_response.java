package demo_001_JavaWeb.demo_001_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/Day_006_response")
public class Day_006_response extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        BufferedReader reader = req.getReader();
//        String line = null;
//        while ((line=reader.readLine()) !=null) {
//            System.out.println(line);
//        }
//        System.out.println("--------------");
//        String user = req.getParameter("user");
//        System.out.println(user);
//        String[] bobs = req.getParameterValues("bob");
//        for (String bob : bobs) {
//            System.out.println(bob);
//        }
        req.setCharacterEncoding("utf-8");
        Map<String, String[]> pm = req.getParameterMap();
        Set<String> set = pm.keySet();
        for (String s : set) {
            String[] strings = pm.get(s);
            for (String string : strings) {
                System.out.println(s+":"+string);
            }
        }
        System.out.println(req.getAttribute("hello"));
    }
}
