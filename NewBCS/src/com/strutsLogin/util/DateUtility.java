package com.strutsLogin.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;





public class DateUtility {

	/**
	 * @param args
	 */

    private static SimpleDateFormat dateFormat = new SimpleDateFormat(
	"dd-MM-yyyy");

	public static Date getDateFromString(String date) {
		String dateString = null;
		Date convertedDate = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			dateString = date;
			convertedDate = dateFormat.parse(dateString);
			System.out.println("Converted string to date : " + convertedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return convertedDate;
	}

	public static Date getcurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date date = new java.util.Date();
		String dateStr = dateFormat.format(date);
		Date date2 = null;
		try {
			date2 = dateFormat.parse(dateStr);
		} catch (Exception pe) {
			pe.printStackTrace();
		}
		return date2;
	}
	public static String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		java.util.Date date = new java.util.Date();
		String dateStr = dateFormat.format(date);


		return dateStr;
	}

  public static String getString(Date date)
	{
		try
		{
			return dateFormat.format(date);
		}
		catch (Exception e) {
			return null;
		}
	}

 


	public static void main(String[] args) {
	}
}
