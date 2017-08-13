package com.test.demo.time;

import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 01210368 on 2017/7/28.
 * 时间工具类
 */
public class DateUtil {

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd") ;
    public static final String USER_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String USER_TIME_FORMAT_ONE = "yyyy/MM/dd HH:mm:ss";
    public static final String USER_TIME_FORMAT_TWO = "yyyy/MM/dd";
    public static final String USER_TIME_FORMAT_THREE = "yyyyMM";
    public static final String USER_TIME_FORMAT_Four = "yyyy/MM";

    /**
     * 获取当前的时间戳
     *
     * @author dingfangwen
     * @created 2014-8-11 下午4:09:03
     *
     * @return
     */
    public static long getCurrentSeconed(){
        Date date = new Date();
        return date.getTime()/1000;
    }

    /**
     * date类型变秒
     *
     * @author dingfangwen
     * @created 2014-8-11 下午4:06:21
     *
     * @param date
     * @return
     */
    public static long getDateSecond(Date date){
        return date.getTime()/1000 ;
    }

    /**
     * 将秒转化成时间类型
     *
     * @author dingfangwen
     * @created 2014-8-11 下午4:07:22
     *
     * @param second
     * @return
     */
    public static Date second2Date(long second){
        return new Date(second*1000L) ;
    }

    public static Date dateFormat2Date(Date date,String format){
        try {

            String dateStr = dateToString(date, format);
            Date result = stringToDate(dateStr,format);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }

    /**
     * 获取今天的0点时间，并转化成秒
     *
     * @author dingfangwen
     * @created 2014-8-11 下午4:06:46
     *
     * @return
     */
    public static long getNowDay0dian(){
        try {
            String s = df.format(new Date());
            long l = df.parse(s).getTime();
            return l / 1000;
        } catch (Exception e) {
            e.printStackTrace() ;
        }
        return 0 ;
    }

    /**
     * 验证当前的时间是否在该之间段之间
     *
     * @author dingfangwen
     * @created 2014-4-17 下午5:22:36
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public static boolean checkNowIsValidate(int startTime,int endTime){
        boolean isNowIsValidate = false;
        int nowTime =Long.valueOf(System.currentTimeMillis() / 1000L).intValue();
        if(startTime < nowTime && nowTime < endTime){
            isNowIsValidate = true;
        }
        return isNowIsValidate;
    }


    /**
     * @param date
     * @return y-m-d
     */
    public static String dateToString(Date date){
        String dateStr = "";
        try {
            dateStr = DateUtil.df.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    public static String dateToString(Date date,String format){
        String dateStr = "";
        try {
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(
                    format);
            dateStr = localSimpleDateFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateStr;
    }

    public static String secondsToString(Integer seconds){
        String dateStr = "";
        if(seconds != null) {
            Date date = second2Date(seconds);
            dateStr = dateToString(date);
        }
        return dateStr;
    }

    public static Date getLastMath(Date date){
        if(date == null){
            return  null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        return calendar.getTime();
    }

    public static boolean isTimeBetween(Date value,Date startTime,Date endTime){
        if(value == null || startTime == null || endTime == null){
            return false;
        }
        if((value.after(startTime) && value.before(endTime)) || value.equals(startTime)
                || value.equals(endTime)){
            return true;
        }
        return false;
    }

    public static Date stringToDate(String time,String format){
        Date date = null;
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat(
                format);
        try {
            date = localSimpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static long stringToSecond(String time,String format){
        Date date = stringToDate(time,format);
        long seconds = 0;
        if(date != null){
            seconds = getDateSecond(date);
        }
        return seconds;
    }

    public static String secondsToString(Integer seconds,String format){
        String dateStr = "";
        if(seconds != null && !StringUtils.isEmpty(format)) {
            Date date = second2Date(seconds);
            try {
                dateStr = dateToString(date, format);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dateStr;
    }
}
