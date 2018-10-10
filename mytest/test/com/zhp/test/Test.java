package com.zhp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Date birthDay = sdf.parse("2014-11-12");
		
		 if (cal.before(birthDay)) {
	            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
	        }
		 
		 int yearNow = cal.get(Calendar.YEAR);
		 
		 System.out.println(yearNow);
		 System.out.println(" -- " + birthDay);
		 
		 
	}

}
