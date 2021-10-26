package itCast.web.servlet;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckCode")
public class CheckCode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int width = 100;
        int height = 50;

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics gs = img.getGraphics();
        gs.setColor(Color.pink);
        gs.fillRect(0,0,width,height);
        gs.setColor(Color.BLUE);
        gs.drawRect(0,0,width - 1,height - 1);
        gs.setFont(new Font(null, 0, 25));

        String ss = "qwertyuiopasdfghjklzxcvbnm0123456789";
        Random ran = new Random();

        for (int i = 0; i < 4; i++) {
            int i1 = ran.nextInt(ss.length());
            gs.drawString(String.valueOf(ss.charAt(i1)), 15 + 20 * i, 30);
        }
        gs.setColor(Color.green);
        for (int i = 0; i < 10; i++) {
            int i1 = ran.nextInt(width);
            int i2 = ran.nextInt(height);
            int i3 = ran.nextInt(width);
            int i4 = ran.nextInt(height);
            gs.drawLine(i1, i2, i3, i4);
        }

//        response.setContentType("text/html;charset=utf-8");

        ImageIO.write(img, "jpg", response.getOutputStream());


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
