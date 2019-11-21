package com.springboot.springboot.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: SJH
 * @ClassName: FirstFilter
 * @Description: 过滤器
 */
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(FirstFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("进入过滤器");
        System.out.println("进入过滤器");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("结束过滤器");
        logger.info("结束过滤器");
    }

    @Override
    public void destroy() {

    }
}
