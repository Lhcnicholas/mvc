package com.qjdchina.config;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Des
 * @Author Li-Nic
 * @Date 2018/5/15
 **/
public class MyServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = getInitParameter("name");
        System.out.println("Hello "+name+",This is my servlet");

        if (req instanceof HttpServletRequest && res instanceof HttpServletResponse) {
            service((HttpServletRequest) req,(HttpServletResponse) res);
        }
    }

    @Override
    public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();

        outputStream.println("<html>");
        outputStream.println("<body>");
        outputStream.println("<h1>Hello,This is my servlet</h1>");
        outputStream.println("</body>");
        outputStream.println("</html>");

        outputStream.close();
    }

}
