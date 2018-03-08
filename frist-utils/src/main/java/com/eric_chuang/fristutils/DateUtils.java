package com.eric_chuang.fristutils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by cjchuang on 2018/3/8.
 */

public class DateUtils {
    public static String getTime(Date date) {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("kk:mm");
        return timeFormatter.format(date);
    }
}
