package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public final class TrustOwnerPage extends BasePage{

	private final By textbox_TrustName = By.id("control435866_text");
	private final By textbox_Trustdate = By.id("control259646_dateTextBox");
	private final By textbox_TaxIdentification1 = By.id("control260221_part1");
	private final By textbox_TaxIdentification2 = By.id("control260221_part2");
	private final By textbox_TrustOwnerAddress = By.id("control299296_part1");
	private final By textbox_TrustOwnerCity = By.id("control299296_part4");
	private final By dropbox_TrustOwnerState = By.id("control299296_part5");
	private final By textbox_TrustOwnerPostalCode = By.id("control299296_part6");
	private final By dropbox_TrustOwnerRelationToAnnuitant = By.id("control260229_dropBox");
	private final By radio_TrustTaxStatus = By.id("control437904_RadioButtons_1");
	private final By buttonNext = By.id("bottomNext");
	
	
	
	public TrustOwnerPage trustName(String trustownername)
	{
		sendKeys(textbox_TrustName, trustownername, WaitStrategy.VISIBLE, "Trust Name");
		return this;
	}
	
	public TrustOwnerPage trustDate(String trustdate)
	{
		sendKeys(textbox_Trustdate, trustdate, WaitStrategy.PRESENCE, "Trust Date");
		return this;
	}
	
	public TrustOwnerPage taxIdentificationNumber(String taxidentification1, String taxidentification2)
	{
		sendKeys(textbox_TaxIdentification1, taxidentification1, WaitStrategy.VISIBLE, "Tax Identification Number 1");
		sendKeys(textbox_TaxIdentification2, taxidentification2, WaitStrategy.VISIBLE, "Tax Identification Number 2");
		return this;
	}
	
	public TrustOwnerPage trustOwnerAddress(String address, String city, String state, String postalcode)
	{
		clearAndSendKeys(textbox_TrustOwnerAddress, address, WaitStrategy.VISIBLE, "Turst Owner Physical Address");
		clearAndSendKeys(textbox_TrustOwnerCity, city, WaitStrategy.VISIBLE, "Turst Owner City");
		selectDropdown(dropbox_TrustOwnerState, state, WaitStrategy.PRESENCE, "Turst Owner State");
		clearAndSendKeys(textbox_TrustOwnerPostalCode, postalcode, WaitStrategy.VISIBLE, "Turst Owner Postal Code");
		return this;
	}
	
	public TrustOwnerPage trustOwnerRelationToOwner(String trustownerrelationtoowner)
	{
		selectDropdown(dropbox_TrustOwnerRelationToAnnuitant, trustownerrelationtoowner, WaitStrategy.PRESENCE, "trust owner relation to owner");
		return this;
	}
	
	public TrustOwnerPage trustTaxStatus()
	{
		click(radio_TrustTaxStatus, WaitStrategy.PRESENCE, "Trust Tax Status");
		return this;
	}
	
	public TrusteeDetailPage clickTrustOwnerNext()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, getPageTitle());
		return new TrusteeDetailPage();
	}
	
	
}
