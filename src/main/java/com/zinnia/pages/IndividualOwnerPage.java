package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class IndividualOwnerPage extends BasePage{

	private final By textbox_IndiOwnerDOB = By.id("control298793_dateTextBox");
	private final By textbox_indiOwnerAddress = By.id("control341894_part1");
	private final By textbox_indiOwnerCity = By.id("control341894_part4");
	private final By dropbox_indiOwnerState = By.id("control341894_part5");
	private final By textbox_indiOwnerPostalcode = By.id("control341894_part6");

	private final By textbox_ownerMobilePhoneNumber1 = By.id("control435862_part2");
	private final By textbox_ownerMobilePhoneNumber2 = By.id("control435862_part3");
	private final By textbox_ownerMobilePhoneNumber3 = By.id("control435862_part4");
	private final By radiobutton_annuitantSameaAsOwner = By.id("control301716_RadioButtons_1");
	private final By radiobutton_irsNotified = By.id("control374423_RadioButtons_1");
	private final By dropbox_RelationToAnnuitant = By.id("control260209_dropBox");
	private final By buttonNext = By.id("bottomNext");

	
	public IndividualOwnerPage individualOwnerDOB(String inddateofbirth)
	{
		clearAndSendKeys(textbox_IndiOwnerDOB, inddateofbirth, WaitStrategy.PRESENCE, "individual Owner date of birth");
		return this;
	}

	public IndividualOwnerPage individualOwnerPhysicalAddress(String address, String city, String state, String postalcode)
	{
		clearAndSendKeys(textbox_indiOwnerAddress, state, WaitStrategy.VISIBLE, "Physical Address");
		clearAndSendKeys(textbox_indiOwnerCity, city, WaitStrategy.VISIBLE, "Individual Owner City");
		selectDropdown(dropbox_indiOwnerState, state, WaitStrategy.PRESENCE, "Individual Owner State");
		clearAndSendKeys(textbox_indiOwnerPostalcode, postalcode, WaitStrategy.VISIBLE, "Individual Owner Postal Code");
		return this;
	}
	
	
	public IndividualOwnerPage individualOwnerMobileNumber(String ompNumber1,String ompNumber2,String ompNumber3)
	{
		sendKeys(textbox_ownerMobilePhoneNumber1, ompNumber1, WaitStrategy.VISIBLE, "Owner Mobile Number 1");
		sendKeys(textbox_ownerMobilePhoneNumber2, ompNumber2, WaitStrategy.VISIBLE, "Owner Mobile Number 2");
		sendKeys(textbox_ownerMobilePhoneNumber3, ompNumber3, WaitStrategy.VISIBLE, "Owner Mobile Number 3");
		return this;
	}

	public IndividualOwnerPage isAnnuitantSameAsOwner()
	{
		click(radiobutton_annuitantSameaAsOwner, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}


	public IndividualOwnerPage irsNotified()
	{
		click(radiobutton_irsNotified, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}

	public IndividualOwnerPage relationToAnnuitant(String relationtoannuitant)
	{
		selectDropdown(dropbox_RelationToAnnuitant, relationtoannuitant, WaitStrategy.PRESENCE, "Relation to Annuitant");
		return this;
	}

	public JointOwnerDetailsPage clikNextForJointOwner()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next Button");
		return new JointOwnerDetailsPage();
	}
	
	public ContractFeaturesPage clickNextContractFeature()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next Button");
		return new ContractFeaturesPage();
	}

	public PrimaryAnnuitantPage clickNextForPrimaryAnnuitant()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next Button on Individual Owner Screen");
		return new PrimaryAnnuitantPage();
	}

}
