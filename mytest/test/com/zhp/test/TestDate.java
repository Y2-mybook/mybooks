package com.zhp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class TestDate {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	//根据出生日期计算年龄
	@Test
	public void test() throws ParseException {

		String dataOfBirth = "2012-6-21"; //String类型出生日期
		
		Date birthDay = sdf.parse(dataOfBirth);  //Date类型出生日期
		
		Calendar cal = Calendar.getInstance();
		 
        if (cal.before(birthDay)) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
        }
        
        int yearNow = cal.get(Calendar.YEAR);
//        int monthNow = cal.get(Calendar.MONTH);
//        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthDay);
 
        int yearBirth = cal.get(Calendar.YEAR);
//        int monthBirth = cal.get(Calendar.MONTH);
//        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
 
        int age = yearNow - yearBirth;
 
//        if (monthNow <= monthBirth) {
//            if (monthNow == monthBirth) {
//                if (dayOfMonthNow < dayOfMonthBirth) age--;
//            }else{
//                age--;
//            }
//        }

        System.out.println("=yearNow=" + yearNow);
        System.out.println("=yearBirth=" + yearBirth);
        System.out.println("=age=" + age);
	}
	
//	//出生日期字符串转化成Date对象
//    public Date parse(String strDate) throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        return sdf.parse(strDate);
//    }
 
//    //由出生日期获得年龄
//    public  int getAge(Date birthDay) throws Exception {
//        Calendar cal = Calendar.getInstance();
// 
//        if (cal.before(birthDay)) {
//            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
//        }
//		
//        int yearNow = cal.get(Calendar.YEAR);
//      
//        int yearBirth = cal.get(Calendar.YEAR);
// 
//        int age = yearNow - yearBirth;
// 
////        if (monthNow <= monthBirth) {
////            if (monthNow == monthBirth) {
////                if (dayOfMonthNow < dayOfMonthBirth) age--;
////            }else{
////                age--;
////            }
////        }
//        return age;
//    }

	

}
