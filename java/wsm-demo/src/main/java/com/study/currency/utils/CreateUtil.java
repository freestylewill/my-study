package com.study.currency.utils;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 生成啥啥啥工具类
 */
public class CreateUtil {

    public static Long id() {
        Format format = new SimpleDateFormat("yyyyMMddHHmmss");
        int a = (int) (Math.random() * 10.0D);
        int b = (int) (Math.random() * 10.0D);
        int c = (int) (Math.random() * 10.0D);
        int d = (int) (Math.random() * 10.0D);
        String date = format.format(new Date());
        StringBuffer sb = new StringBuffer();
        sb.append(date).insert(a, b);
        sb.insert(b, c);
        sb.insert(c, d);
        sb.insert(d, a);
        sb.insert(d, b);
        String createdId = sb.toString();
        return Long.parseLong(createdId);
    }
}