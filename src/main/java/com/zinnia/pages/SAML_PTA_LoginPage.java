package com.zinnia.pages;

import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.zinnia.constants.FrameworkConstants;
import com.zinnia.driver.DriverManager;
import com.zinnia.enums.WaitStrategy;
import com.zinnia.saml.Saml_Util;
import com.zinnia.saml.UserUpdate;



public class SAML_PTA_LoginPage extends BasePage {

	private final By dropdownboxInitialAction = By.id("initialAction");
	private final By radioRawXml = By.id("rawxml");
	private final By textboxSAMLRawXml = By.id("SAMLResponse");
	private final By buttonSAMLLogin = By.id("samlLogin");


	public static String SAML_Content;
	String parentWindowHandle;
	
	public SAML_PTA_LoginPage changeUserLogininSAML(String loginuser)
	{
		UserUpdate.updateLoginUser(loginuser);
		return this;
	}

	public SAML_PTA_LoginPage change_External_Internal_TxnId()
	{
		try {
		// --------- LOAD XML
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document DataDoc = db.parse(new InputSource(new StringReader(Saml_Util.getXMLString())));

        // --------- PROCESS
        String cdata = Saml_Util.getCData(DataDoc);
        //System.out.println(cdata);
        Document docWithCDataPlaceholder = Saml_Util.getDataDocWithCDataPlaceHolder(DataDoc);

        // --------- LOAD CDATA XML
        Document cDataDoc = db.parse(new InputSource(new StringReader(cdata)));
        Document modifiedCData = Saml_Util.getModifiedCData(cDataDoc);

        // --------- OUTPUT
        String finalcData = Saml_Util.convertXMLDocumentToString(modifiedCData, true);
        String finalXML = Saml_Util.convertXMLDocumentToString(docWithCDataPlaceholder, false);

        finalcData = "<![CDATA[" + finalcData + "]]>";
        finalXML = finalXML.replace("C_DATA", finalcData);

        final String xmlStr = new String(finalXML);
        Document DataDocFinal = Saml_Util.convertStringToDocument(xmlStr);

        FileOutputStream output = new FileOutputStream(FrameworkConstants.getSamlFilePath());

        Saml_Util.writeXml(DataDocFinal, output);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	public SAML_PTA_LoginPage openNewWindowTab()
	{
		String windowTab = "window.open('about:blank','_blank');";
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(windowTab);
		return this;
	}

	public SAML_PTA_LoginPage switchToChildWindow(int index) {
		Set<String> windows = DriverManager.getDriver().getWindowHandles();
		int i = 1;
		for (String window : windows) {
			if (i == index) {
				DriverManager.getDriver().switchTo().window(window);
			} else {
				i++;
			}
		}
		return this;
	}


	public SAML_PTA_LoginPage getParentWindowhandle()
	{
		parentWindowHandle = DriverManager.getDriver().getWindowHandle();
	//	System.out.println("Parent window's handle -> " + parentWindowHandle);
		return this;

	}


	public SAML_PTA_LoginPage closeAllTabsAndSwitchToMainWindow() {
		Set<String> windows = DriverManager.getDriver().getWindowHandles();
		String mainwindow = DriverManager.getDriver().getWindowHandle();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				DriverManager.getDriver().close();
			}
		}
		DriverManager.getDriver().switchTo().window(parentWindowHandle);

		return this;
	}

	public SAML_PTA_LoginPage read_SAML_DATA_XMLFile()
	{

		DriverManager.getDriver().get(FrameworkConstants.getSamlFilePath());
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       SAML_Content = DriverManager.getDriver().findElement(By.id("folder0")).getText();

  //    System.out.println(SAML_Content);
		return this;
	}

	public SAML_PTA_LoginPage selectInitialAction(String initialaction)
	{
		selectDropdown(dropdownboxInitialAction, initialaction, WaitStrategy.CLICKABLE, "Initial Action");
		return this;
	}

	public SAML_PTA_LoginPage clickradiobuttonRawXml()
	{
		click(radioRawXml, WaitStrategy.PRESENCE, "Raw XML Radio Button");
		return this;
	}

	public SAML_PTA_LoginPage enterSAML()
	{
		sendKeys(textboxSAMLRawXml, SAML_Content, WaitStrategy.PRESENCE, "SAML Raw XML Text Box");
		return this;
	}

	public CarrierProductPage clickSAMLLogin()
	{
		click(buttonSAMLLogin, WaitStrategy.CLICKABLE, "Saml Login Button");
		return new CarrierProductPage();
	}






}
