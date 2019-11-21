package com.springboot.springboot.bootstrap;

import com.springboot.springboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 仓储的引导类
 *
 * @author: SJH
 * @ClassName: RepositoryBootstrap
 * @Description:
 */
@ComponentScan(basePackages = "com.springboot.springboot.repository") //扫描此类
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //myFirstLevelRepository Bean是否存在
        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("myFirstLevelRepository : " + myFirstLevelRepository);

        //关闭上下文
        context.close();
    }

}
