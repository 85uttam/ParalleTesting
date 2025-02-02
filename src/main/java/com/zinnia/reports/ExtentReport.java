package com.zinnia.reports;


import static com.zinnia.constants.FrameworkConstants.ICON_LAPTOP;
import static com.zinnia.constants.FrameworkConstants.ICON_SOCIAL_GITHUB;
import static com.zinnia.constants.FrameworkConstants.ICON_SOCIAL_LINKEDIN;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.zinnia.constants.FrameworkConstants;
import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;
import com.zinnia.utils.BrowserInfoUtils;
import com.zinnia.utils.IconUtils;

/**
 * Perform initialisation and termination of {@link com.aventstack.extentreports.ExtentReports}
 * After creating an instance for {@link com.aventstack.extentreports.ExtentTest}, it is delegated to ThreadLocal
 * variable for providing thread safety.
 *
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.listeners.ListenerClass
 * @see com.zinnia.annotations.FrameworkAnnotation
 */
public final class ExtentReport {


	/**
	 * Private constructor to avoid external instantiation
	 */
	private ExtentReport() {}

	private static ExtentReports extent;

	/**
	 * Set the initial configuration for the Extent Reports and decides the report generation path.
	 */
	public static void initReports() {
		if(Objects.isNull(extent)) {
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.STANDARD);
			spark.config().setDocumentTitle(FrameworkConstants.getProjectName());
			spark.config().setReportName(FrameworkConstants.getProjectName());
			
			
			extent.setSystemInfo("Organization", "<b> Zinnia </b>");
			extent.setSystemInfo("Employee",
					"<b> Suneel </b>" + " " + ICON_SOCIAL_LINKEDIN + " " + ICON_SOCIAL_GITHUB);
			extent.setSystemInfo("Domain", "Engineering (IT - Software)"+"  "+ICON_LAPTOP);
			extent.setSystemInfo("Skill", "Test Automation Engineer");
		}
	}

	/**
	 * Flushing the reports ensures extent logs are reflected properly.
	 * Opens the report in the default desktop browser.
	 * Sets the ThreadLocal variable to default value
	 */
	public static void flushReports(){
		if(Objects.nonNull(extent)) {
			extent.flush();
		}
		ExtentManager.unload();
		try {
			Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates a test node in the extent report. Delegates to {@link ExtentManager} for providing thread safety
	 * @param testcasename Test Name that needs to be reflected in the report
	 */
	public static void createTest(String testcasename) {
		ExtentManager.setExtentTest(extent.createTest(IconUtils.getBrowserIcon() + " : " + testcasename));
	}

	/**
	 * Logs the authors details in the authors view in the extent report.
	 * Gives an clear idea of Authors Vs Percentage success metrics
	 * @param authors Authors who created a particular test case
	 */
	public static void addAuthors(AuthorType[] authors) {
		for(AuthorType temp:authors) {
			ExtentManager.getExtentTest().assignAuthor(temp.toString());
		}
	}

	/**
	 * Adds the category a particular test case belongs to.
	 * Gives an clear idea of Group Vs Percentage success metrics.
	 * @param categories category a particular test case belongs to.
	 */
	public static void addCategories(CategoryType[] categories) {
		for(CategoryType temp:categories) {
			ExtentManager.getExtentTest().assignCategory(temp.toString());
		}
	}

	synchronized public static void addDevices()
	{
		ExtentManager.getExtentTest().assignDevice(BrowserInfoUtils.getBrowserInfo());
	}


}
