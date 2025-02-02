package com.zinnia.utils;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zinnia.driver.DriverManager;

public final class BrowserInfoUtils {

    private BrowserInfoUtils() {
    }

    public static String getBrowserInfo() {
    	Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
//        Capabilities capabilities = driver.getCapabilities();
        return capabilities.getBrowserName().toUpperCase();
    }
    
    
    public static String getBrowserVersionInfo()
    {
    	Capabilities capabilities = ((RemoteWebDriver)DriverManager.getDriver()).getCapabilities();
    	return capabilities.getBrowserVersion();
    }
}