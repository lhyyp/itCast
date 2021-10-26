package demo_001_JavaWeb.demo_001_servlet;

import javax.servlet.*;
import java.io.IOException;

public class Day_001 implements Servlet {

    /**
     * 初始化方法
     * 在 Servlet 被创建时执行，只会执行一次
     * servlet被创建时间：
     *  <servlet>
            <load-on-startup>-5</load-on-startup>
        </servlet>
            值为负数时：第一次访问时创建，
            值为零或正树时：启动被创建
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }


    /**
     * 获取 ServletConfig 对象
     * ServletConfig： Servlet 配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    /**
     * 提供方法
     * 每一次 Servlet 被访问时执行,
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hell p");

    }


    /**
     * 获取 Servlet 的信息、版本、作者等
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }


    /**
     * 销毁方法
     * 在服务器正常关闭时执行，只会执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy.....");

    }
}
