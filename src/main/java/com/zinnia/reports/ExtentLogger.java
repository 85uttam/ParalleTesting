package com.zinnia.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.zinnia.enums.ConfigProperties;
import com.zinnia.utils.PropertyUtils;
import com.zinnia.utils.ScreenshotUtils;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message)
	{
		ExtentManager.getExtentTest().pass(message);
	}
	
	public static void pass(Markup message)
	{
		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message)
	{
		ExtentManager.getExtentTest().fail(message);
	}
	
	public static void fail(Markup message)
	{
		ExtentManager.getExtentTest().fail(message);
	}

	public static void skip(String message)
	{
		ExtentManager.getExtentTest().skip(message);
	}
	
	public static void skip(Markup message)
	{
		ExtentManager.getExtentTest().skip(message);
	}
	

	public static void info(Markup message) {
		ExtentManager.getExtentTest().info(message);
	}

	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);
	}

	public static void pass(String message, boolean isScreenshotneeded)
	{
		if(PropertyUtils.get(ConfigProperties.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotneeded)
		{
			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}
		else
		{
			pass(message);
		}
	}
	
	
	public static void pass(Markup message, boolean isScreeshotNeeded) 
	{
		if (PropertyUtils.get(ConfigProperties.PASSEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes") && isScreeshotNeeded) 
		{
			ExtentManager.getExtentTest().pass(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().pass(message);
		} else {
			pass(message);
		}
	}
	
	

	public static void fail(String message, boolean isScreenshotneeded)
	{
		if(PropertyUtils.get(ConfigProperties.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotneeded)
		{
			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}
		else
		{
			fail(message);
		}
	}
	
	public static void fail(Markup message, boolean isScreenshotneeded)
	{
		if(PropertyUtils.get(ConfigProperties.FAILEDSTEPSSCREENSHOTS).equalsIgnoreCase("yes")&&isScreenshotneeded)
		{
			ExtentManager.getExtentTest().fail(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().pass(message);
		}
		else {
			fail(message);
		}
	}
	
	

	public static void skip(String message, boolean isScreenshotneeded)
	{
		if(PropertyUtils.get(ConfigProperties.SKIPPEDSTEPSCREENSHOT).equalsIgnoreCase("yes")&&isScreenshotneeded)
		{
			ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		}
		else
		{
			skip(message);
		}
	}

	
	public static void skip(Markup message, boolean isScreenshotneeded)
	{
		if(PropertyUtils.get(ConfigProperties.SKIPPEDSTEPSCREENSHOT).equalsIgnoreCase("yes")&&isScreenshotneeded)
		{
			ExtentManager.getExtentTest().skip(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().skip(message);
		}
	}


}
