package com.snow.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public static String time(){
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        String format = sdf.format(date);
        System.out.println("现在时间：" + format); // 输出已经格式化的现在时间（24小时制）
        return format;
    }
}
