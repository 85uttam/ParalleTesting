
package com.zinnia.factories;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.zinnia.enums.ConfigProperties;
import com.zinnia.utils.PropertyUtils;

import io.github.bonigarcia.wdm.WebDriverManager;


public final class DriverFactory {

	private DriverFactory() {}

	/**
	 *
	 * @param browser
	 * @param version
	 * @return
	 * @throws MalformedURLException
	 * TODO Remove hardcoded value of grid url
	 */
	public static WebDriver getDriver(String browser,String version) throws MalformedURLException {

		WebDriver driver=null;

		String runmode = PropertyUtils.get(ConfigProperties.RUNMODE);
		if(browser.equalsIgnoreCase("chrome")) {
			if(runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
	//			cap.setBrowserName(BrowserType.CHROME);
				cap.setVersion(version);
				driver =new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
			}
			else {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		}
		else if(browser.equalsIgnoreCase("firefox")) {

			if(runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
	//			cap.setBrowserName(BrowserType.FIREFOX);
				cap.setVersion(version);
				driver =new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
			} else {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}

		else if(browser.equalsIgnoreCase("edge")) {

			if(runmode.equalsIgnoreCase("remote")) {
				DesiredCapabilities cap = new DesiredCapabilities();
//				cap.setBrowserName(BrowserType.EDGE);
				cap.setVersion(version);
				driver =new RemoteWebDriver(new URL(PropertyUtils.get(ConfigProperties.SELENIUMGRIDURL)), cap);
			} else {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		}
		return driver;
	}

}
