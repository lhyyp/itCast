package itCast.web.servletContext;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Day_001_servletContext")
public class Day_001_servletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        String str = "a.png";
        String mimeType = sc.getMimeType(str);
        System.out.println(mimeType); // -> image/png
        sc.setAttribute("hh", "sc");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
