package work;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/work")
public class week1_work implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //2. 获取文档输出流
        PrintWriter out = resp.getWriter();
        FileInputStream ip = new FileInputStream("src/main/webapp/index.html");
        BufferedReader rd = new BufferedReader(new InputStreamReader(ip));
        String str = null;
        while ((str = rd.readLine()) != null)
        {
            out.println(str);
        }
        ip.close();
        rd.close();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
