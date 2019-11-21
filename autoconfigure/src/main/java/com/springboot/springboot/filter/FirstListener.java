package com.springboot.springboot.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author: SJH
 * @ClassName: FirstListener
 * @Description:
 */
public class FirstListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("FirstListener.contextDestroyed(上下文监听器)");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("FirstListener.contextInitialized(上下文监听器)");
    }
}
