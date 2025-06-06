package com.zinnia.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zinnia.constants.FrameworkConstants;
import com.zinnia.driver.DriverManager;
import com.zinnia.enums.WaitStrategy;
/**
 * Explicit wait factory produces different waits before operating on webelement
 *
 * @version 1.0
 * @since 1.0
 */
public final class ExplicitWaitFactory {
	/**
	 * Private constructor to avoid external instantiation
	 */
	private ExplicitWaitFactory() {}

	/**
	 *
	 * @param waitstrategy Strategy to be applied to find a webelement {@link com.zinnia.enums.WaitStrategy}
	 * @param by By locator of the webelement
	 * @return webelement Locates and return the webelement
	 */
	public static WebElement performExplicitWait(WaitStrategy waitstrategy, By by) {
		WebElement element = null;
		if(waitstrategy == WaitStrategy.CLICKABLE) {
			element = 	new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitstrategy == WaitStrategy.PRESENCE) {
			element =	new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(waitstrategy == WaitStrategy.VISIBLE) {
			element =new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitstrategy == WaitStrategy.NONE) {
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
	}
	
	
	
	
	


}
