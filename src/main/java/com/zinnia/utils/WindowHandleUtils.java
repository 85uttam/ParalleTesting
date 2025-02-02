package com.zinnia.utils;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;

import com.zinnia.driver.DriverManager;

public class WindowHandleUtils {


	public static void switchToParentWindow() {
		DriverManager.getDriver().switchTo().defaultContent();
	}

	public static void switchToChiledWindow(int index) {
		Set<String> windows = DriverManager.getDriver().getWindowHandles();
		int i = 1;
		for (String window : windows) {
			if (i == index) {
				DriverManager.getDriver().switchTo().window(window);
			} else {
				i++;
			}
		}
	}


	public static void closeAllTabsAndSwitchToMainWindow() {
		Set<String> windows = DriverManager.getDriver().getWindowHandles();
		String mainwindow = DriverManager.getDriver().getWindowHandle();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				DriverManager.getDriver().close();
			}
		}
		DriverManager.getDriver().switchTo().window(mainwindow);
	}


	public static void openNewWindowTab()
	{
		String windowTab = "window.open('about:blank','_blank');";
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(windowTab);

	}

}
