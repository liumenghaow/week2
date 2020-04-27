package com.liumenghao.week2.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateUtil {
	
	
	public static int getAgeByBirthday(Date birthday) {
		Calendar c=Calendar.getInstance();
		int s_year=c.get(Calendar.YEAR);
		int s_month=c.get(Calendar.MONTH);
		int s_date=c.get(Calendar.DAY_OF_MONTH);
		
		c.setTime(birthday);//用出生日期初始化日历类
		
		int b_year = c.get(Calendar.YEAR);//或去年
		int b_month = c.get(Calendar.MONTH);//或去年
		int b_date = c.get(Calendar.DAY_OF_MONTH);//或去年
		
		int age=s_year-b_year;
		
		if(s_month<b_month) {
			age--;
		}
		//如果月份相等，但是系统的天小于出生的天
		if(s_month==b_month && s_date<b_date) {
			age--;//年龄减一
		}
		
		return age;
		
		
		
		
	}
	
	
	
	
	/***
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回日期的月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		//初始化日历类
		Calendar c=Calendar.getInstance();
		//用传入的参数初始化日历类
		c.setTime(date);
		c.add(Calendar.MONTH, 1);//月份加1
		Date initMonth = getInitMonth(c.getTime());//变成月初
		//用initMonth初始化日李磊
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);//减一苗
		
		return c.getTime();
	}
	/***
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回日期的月初
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0小时
		c.set(Calendar.MINUTE, 0);//设置天的0分钟
		c.set(Calendar.SECOND, 0);//设置天的0秒
		return c.getTime();
	}
	
	
	
	
	
	
	
	
	public static Date randomDate(Date startDat,Date endDate) {
		long t1 = startDat.getTime();//1970年到starDate的毫秒数
		long t2 = endDate.getTime();//1970年到endDate的毫秒数
		if(t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		
		
		//随机产生在t1和t2之间的毫秒数
		double random = Math.random();
		long t=(long)((random*(t2-t1)+t1));
		
		
		
		return new Date(t);
	}
}
