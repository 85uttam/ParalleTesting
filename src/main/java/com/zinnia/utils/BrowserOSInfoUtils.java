package com.zinnia.utils;



public class BrowserOSInfoUtils {
	
	private BrowserOSInfoUtils() {
	}
	
	public static String getOS_Browser_BrowserVersionInfo()
	{
		return OSInfoUtils.getOSInfo() + " & " + BrowserInfoUtils.getBrowserInfo() + " - "
				+ BrowserInfoUtils.getBrowserVersionInfo();
	}

}
