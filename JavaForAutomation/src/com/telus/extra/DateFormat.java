package com.telus.extra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		 Date d =new Date();
        
		 String date=df.format(d);
		 System.out.println(date);
	}

}
