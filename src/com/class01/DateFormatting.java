package com.class01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	public static void main(String[] args) {
		try { 
		Date date=new Date();
		System.out.println("Printing data "+date);
		
		SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
	    SimpleDateFormat dmyFormat = new SimpleDateFormat("yyyy-MM-dd");

	    // Format the date to Strings
	    String mdy = mdyFormat.format(date);
	    String dmy = dmyFormat.format(date);

	    // Results...
	    System.out.println(mdy);
	    System.out.println(dmy);
	    // Parse the Strings back to dates
	    // Note, the formats don't "stick" with the Date value
	    System.out.println(mdyFormat.parse(mdy));
	    System.out.println(dmyFormat.parse(dmy));
	} catch (ParseException exp) {
	    exp.printStackTrace();
	}
	}

}
