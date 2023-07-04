package com.strutsLogin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat(
			"dd/MM/yyyy");

	private static SimpleDateFormat dayMonthFormat = new SimpleDateFormat(
			"dd/MM");

	public static Date getDate(String dStr) {
		Date date = null;
		try {
			date = dateFormat.parse(dStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;

	}

	public static String getString(Date date) {
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			return null;
		}
	}

	public static String getDayMonth(Date date) {
		try {
			return dayMonthFormat.format(date);
		} catch (Exception e) {
			return null;
		}
	}

	public static int getInteger(String str) {
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}
	}

	public static String getString(int i) {

		try {
			return Integer.toString(i);
		} catch (Exception e) {
			return null;
		}

	}

	public static String getString(String str) {
		if (str == null || str.trim().length() == 0) {
			return null;
		} else {
			return str.trim();
		}
	}

	public static String getString(long l) {
		try {
			return Long.toString(l);
		} catch (Exception e) {
			return null;
		}
	}

	public static long getLong(String l) {
		try {
			return ((Long.valueOf(l).longValue()));
		} catch (Exception e) {
			return 0;
		}
	}

	public static String getString(double d) {
		try {
			return Double.toString(d);
		} catch (Exception e) {
			return null;
		}
	}

	public static double getDouble(String d) {
		try {
			return (Double.valueOf(d).doubleValue());
		} catch (Exception e) {
			return 0;
		}
	}

	// public static void main(String[] args) {
	// Date d = getDate("16/11/2006");
	//
	// System.out.println("Formatted date " + getDatabaseDate(d));
	//
	// }

}
