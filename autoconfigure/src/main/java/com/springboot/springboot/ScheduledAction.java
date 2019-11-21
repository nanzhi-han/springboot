package com.springboot.springboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: SJH
 * @ClassName: ScheduledAction
 * @Description: 定时任务
 */
@Configuration
@EnableScheduling//开启定时任务
@EnableAsync//开启多线程
public class ScheduledAction {

    @Async//标记其为一个异步任务
    @Scheduled(cron = "*/2 * * * * ?")
    public void hello() {
       /* System.out.println("hello!: " + Thread.currentThread().getName());
        String format = new SimpleDateFormat("yyyy--MM--ss").format(new Date());
        System.out.println("******  ni  hao"+format+"****");*/
    }
}
