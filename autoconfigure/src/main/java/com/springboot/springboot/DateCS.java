package com.springboot.springboot;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: SJH
 * @ClassName: DateCS
 * @Description: 两个时间相差几天
 */
public class DateCS {

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date();
        Calendar instance = Calendar.getInstance();
        //当前时间之后15天
        instance.add(Calendar.DATE,15);

        Date time1 = instance.getTime();

        long time = (time1.getTime() - date.getTime()) / (1000 * 60 * 60 * 24);
        int intValue = new Long(time).intValue();

        System.out.println("时间天数： "+intValue);
    }
}
