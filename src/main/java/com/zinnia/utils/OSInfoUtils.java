package com.zinnia.utils;

public final class OSInfoUtils {
	
	private OSInfoUtils() {
	}
	
	public static String getOSInfo()
	{
		return System.getProperty("os.name").replace(" ", "_");
	}

}
