package com.zinnia.listeners;

import static com.zinnia.constants.FrameworkConstants.ICON_BUG;
import static com.zinnia.constants.FrameworkConstants.ICON_SMILEY_FAIL;
import static com.zinnia.constants.FrameworkConstants.ICON_SMILEY_PASS;

import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.zinnia.annotations.FrameworkAnnotation;
import com.zinnia.reports.ExtentLogger;
import com.zinnia.reports.ExtentReport;
import com.zinnia.utils.BrowserOSInfoUtils;
import com.zinnia.utils.ELKUtils;
import com.zinnia.utils.IconUtils;

/**
 * Implements {@link org.testng.ITestListener} and {@link org.testng.ISuiteListener} to leverage the abstract methods
 * Mostly used to help in extent report generation
 *
 * <pre>Please make sure to add the listener details in the testng.xml file</pre>
 *
 * @version 1.0
 * @since 1.0
 */
public class ListenerClass implements ITestListener, ISuiteListener {
	
	static int count_passedTCs;
	static int count_skippedTCs;
	static int count_failedTCs;
	static int count_totalTCs;

	/**
	 * Initialise the reports with the file name
	 * @see com.zinnia.reports.ExtentReport
	 */
	@Override
	public void onStart(ISuite suite) {
			ExtentReport.initReports();
	}

	/**
	 * Terminate the reports
	 * @see com.zinnia.reports.ExtentReport
	 */
	@Override
	public void onFinish(ISuite suite) {
			ExtentReport.flushReports();

	}

	/**
	 * Starts a test node for each testng test
	 * @see com.zinnia.reports.ExtentReport
	 * @see com.zinnia.annotations.FrameworkAnnotation
	 */
	@Override
	public void onTestStart(ITestResult result) {

		count_totalTCs = count_totalTCs + 1;
		ExtentReport.createTest(result.getMethod().getDescription());
		ExtentReport.addAuthors(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
			.author());
		ExtentReport.addCategories(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
			.category());
		
		ExtentReport.addDevices();
		ExtentLogger.info("<b>"+ IconUtils.getOSIcon() +" & " + IconUtils.getBrowserIcon() + "------------"+BrowserOSInfoUtils.getOS_Browser_BrowserVersionInfo()+"</b>");
	}

	/**
	 * Marks the test as pass and logs it in the report
	 * @see com.zinnia.reports.ExtentLogger
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		count_passedTCs = count_passedTCs + 1;
		String logText = "<b>" + result.getMethod().getMethodName() + "is Passed.</b>"+" "+ICON_SMILEY_PASS;
		Markup markup_message = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		ExtentLogger.pass(markup_message);
		ELKUtils.sendDetailsToElk(result.getMethod().getDescription(), "pass");
	}

	/**
	 * Marks the test as fail,append base64 screenshot and logs it in the report
	 * @see com.zinnia.reports.ExtentLogger
	 * @see com.zinnia.utils.ScreenshotUtils
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		count_failedTCs = count_failedTCs + 1;
		ExtentLogger.fail(ICON_BUG+" "+"<b><i>" + result.getThrowable().toString() + "</i></b>");
		String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
		String message = "<details><summary><b><font color=red> Exception occured, click to see details: "
				+ ICON_SMILEY_FAIL + " </font></b>" + "</summary>" + exceptionMessage.replaceAll(",", "<br>")
				+ "</details> \n";
		ExtentLogger.fail(message);
		
		String logText = "<b>" + result.getMethod().getMethodName() + " is failed.</b>" + "  " + ICON_SMILEY_FAIL;
		Markup markup_message = MarkupHelper.createLabel(logText, ExtentColor.RED);
		ExtentLogger.fail(markup_message, true);
			ELKUtils.sendDetailsToElk(result.getMethod().getDescription(), "fail");
	}

	/**
	 * Marks the test as skip and logs it in the report
	 * @see com.zinnia.reports.ExtentLogger
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		count_skippedTCs = count_skippedTCs + 1;
		//ExtentLogger.skip(result.getMethod().getMethodName() +" is skipped");
		ExtentLogger.skip(ICON_BUG+" "+ "<b><i> "+result.getThrowable().toString() + "</i></b>");
		
		String logText = "<b>" + result.getMethod().getMethodName() + " is skipped.</b>" + "  " + ICON_SMILEY_FAIL;
		Markup markup_message = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		ExtentLogger.skip(markup_message, true);
		ELKUtils.sendDetailsToElk(result.getMethod().getDescription(), "skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		/*
		 * For now, we are not using this.
		 */
	}

	@Override
	public void onStart(ITestContext context) {
		/*
		 * We are having just one test in our suite. So we dont have any special implementation as of now
		 */
	}

	@Override
	public void onFinish(ITestContext context) {
		/*
		 * We are having just one test in our suite. So we dont have any special implementation as of now
		 */

	}

}
