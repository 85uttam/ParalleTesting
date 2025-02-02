package com.zinnia.constants;

import java.time.Duration;

import com.zinnia.enums.ConfigProperties;
import com.zinnia.utils.PropertyUtils;

/**
 * Framework Constants holds all the constant values used within the framework. If some value needs to be changed
 * or modified often, then it should be stored in the property files
 *
 * @version 1.0
 * @since 1.0
 * @see com.zinnia.utils.PropertyUtils
 */
public final class FrameworkConstants {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private FrameworkConstants() {}

	public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
	public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
	public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";
	
	public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
	public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
	public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";
	
	public static final String ICON_BROWSER_EDGE = "edge";
	public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
	public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";
	
	public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
	public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";
	
	
	
	public static final String ICON_SOCIAL_LINKEDIN_URL = "https://www.linkedin.com/in/rajat-v-3b0685128/";
	public static final String ICON_SOCIAL_GITHUB_URL = "https://github.com/rajatt95";
	public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL
			+ "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
	public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL
			+ "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";
	
	
	
	private static final Duration EXPLICITWAIT = Duration.ofSeconds(10);
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/config/config.properties";
	private static final String JSONCONFIGFILEPATH = RESOURCESPATH + "/config/config.json";
	private static final String EXCELPATH = RESOURCESPATH+"/excel/testdata.xlsx";
	private static final String RUNMANGERSHEET = "RUNMANAGER";
	private static final String ITERATIONDATASHEET = "DATA";
	private static final String EXTENTREPORTFOLDERPATH = System.getProperty("user.dir")+"/extent-test-output/";

	private static final String SAML_FILE_PATH = RESOURCESPATH + "\\samlfiles\\FILI_SAML_AmishaSR.xml";
	private static String extentReportFilePath = "";

	private static final String Project_Name = "Automation Test Suite Report - Annuity Framework";
	
	
	/**
	 * @return Extent Report path where the index.html file will be generated.
	 */
	public static String getExtentReportFilePath()  {
		if(extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;
	}
	/**
	 *
	 * @return  If Override reports value in the
	 * property file is no,then the timestamp will be appended
	 */
	private static String createReportPath()  {
		if(PropertyUtils.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return EXTENTREPORTFOLDERPATH+System.currentTimeMillis()+"/index.html";
		}
		else {
			return EXTENTREPORTFOLDERPATH+"/index.html";
		}
	}

	/*
	 * TODO Lombak Plugin to remove the boiler plate code
	 */


	public static String getProjectName() {
		return Project_Name;
	}

	public static String getSamlFilePath() {
		return SAML_FILE_PATH;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	public static String getJsonconfigfilepath() {
		return JSONCONFIGFILEPATH;
	}

	public static Duration getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getRunmangerDatasheet() {
		return RUNMANGERSHEET;
	}

	public static String getIterationDatasheet() {
		return ITERATIONDATASHEET;
	}

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}



}
