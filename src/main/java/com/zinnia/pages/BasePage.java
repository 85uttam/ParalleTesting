package com.zinnia.pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Uninterruptibles;
import com.zinnia.constants.FrameworkConstants;
import com.zinnia.driver.DriverManager;
import com.zinnia.enums.WaitStrategy;
import com.zinnia.factories.ExplicitWaitFactory;
import com.zinnia.reports.ExtentLogger;



public class BasePage {

	/**
	 * Locates element by given wait strategy, performs the clicking operation on webelement and
	 * writes the pass even to the extent report.
	 * @param by By Locator of the webelement
	 * @param waitstrategy Strategy to find webelement. Known  strategies {@link com.zinnia.enums.WaitStrategy}
	 * @param elementname Name of the element that needs to be logged in the report.
	 */

	protected void click(By by, WaitStrategy waitStrategy, String elementname) {
        try {
            WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
            if (element != null) {
                element.click();
                ExtentLogger.pass("<b>"+elementname +" </b>is clicked ", true);
            } else {          
                ExtentLogger.fail("<b>"+elementname +" </b>was not found within the specified timeout ", true);
            }
        } catch (Exception e) {
        	ExtentLogger.fail("Failed to click on '" + elementname + "'. Error: " + e.getMessage());
        }
    }

	
	
	/**
	 * Locates element by given wait strategy, sends the value to located webelement and
	 * writes the pass even to the extent report.
	 * @param by By Locator of the webelement
	 * @param value value to be send the text box
	 * @param waitstrategy Strategy to find webelement. Known  strategies {@link com.zinnia.enums.WaitStrategy}
	 * @param elementname Name of the element that needs to be logged in the report.
	 */
	protected void sendKeys(By by, String value, WaitStrategy waitstrategy,String elementname) {
		WebElement element =ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
		element.sendKeys(value);
		ExtentLogger.pass("<b>"+value + " </b> is entered successfully in "+elementname, true);
	}


	protected void clearAndSendKeys(By by, String value, WaitStrategy waitStrategy, String elementname) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.clear();
		element.sendKeys(value);
//		ExtentLogger.pass("<b>" + value + "</b> is entered successfully in <b>" + elementName + "</b>", true);
		ExtentLogger.pass("<b>"+value + " </b> is entered successfully in "+elementname, true);
	}


	protected void sendKeys(List<By> byList, List<String> values, WaitStrategy waitstrategy, List<String> elementNames) {
	    for (int i = 0; i < byList.size(); i++) {
	        WebElement element = ExplicitWaitFactory.performExplicitWait(waitstrategy, byList.get(i));
	        element.sendKeys(values.get(i));
	        ExtentLogger.pass("<b>"+values.get(i) + " </b> is entered successfully in "+elementNames.get(i), true);
	    }
	}


	/**
	 * Locates element by given wait strategy, select the value to located webelement and
	 * writes the pass even to the extent report.
	 * @param by By Locator of the webelement
	 * @param value value to be send the text box
	 * @param waitstrategy Strategy to find webelement. Known  strategies {@link com.zinnia.enums.WaitStrategy}
	 * @param elementname Name of the element that needs to be logged in the report.
	 */

	protected void selectDropdown(By by, String value, WaitStrategy waitstrategy, String elementname) {
		waitForGivenTime(5);
		DriverManager.getDriver().manage().timeouts().implicitlyWait(FrameworkConstants.getExplicitwait());
	    WebElement dropdown = ExplicitWaitFactory.performExplicitWait(waitstrategy, by);
	    Select select = new Select(dropdown);
	    select.selectByVisibleText(value);
	    ExtentLogger.pass("<b>"+value + " </b> is selected from "+elementname + "dropdown", true);
	}

	public void waitForElementToAppear(By findBy) {

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
		System.out.println("Element Appeared");

	}
	
	public static void waitForWebElementToAppear(WebElement findBy) {

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}

	/**
	 * Return page title of webpage in String
	 * @return Page title of the webpage where the selenium is currently interacting.
	 */
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	
	
	protected void waitForGivenTime(long time) {
		Uninterruptibles.sleepUninterruptibly(time, TimeUnit.SECONDS);
	}

}
