package com.strutsLogin.util;

public class DataValidator {
	public static boolean isNull(String str) {
		return (str == null || str.length() == 0);
	}

	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
