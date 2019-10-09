package com.springboot.springboot.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: SJH
 * @ClassName: MyServlet
 * @Description:
 */
@WebServlet(urlPatterns = "/my/servlet", asyncSupported = true/*默认false不支持异步*/ )
public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1
        //resp.getWriter().print("Hello Word!");

        //2异步非阻塞
        AsyncContext asyncContext = req.startAsync();

        asyncContext.start(()->{
            try {
                resp.getWriter().print("Hello Word!");
                //触发完成（超时处理）
                asyncContext.complete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


    }
}
