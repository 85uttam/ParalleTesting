package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class Payment1DetailsPage extends BasePage{
	
	private final By dropbox_payment1MoneySource = By.id("control260294_dropBox");
	private final By dropbox_payment1PaymentMethod = By.id("control260295_dropBox");
	private final By textbox_payment1FundAmount = By.id("control450540_currencyTextBox");
	private final By radio_replacementQuestion1 = By.id("control260290_RadioButtons_1");
	private final By radio_replacementQuestion2 = By.id("control260291_RadioButtons_1");
	private final By dropbox_TypeOfAnnuity = By.id("control307242_dropBox");
	private final By radio_PrimaryOwner = By.id("control332190_RadioButtons_0");
	private final By radio_PrimaryAnnuitant = By.id("control332191_RadioButtons_0");
	private final By radio_JointOwner = By.id("control332192_RadioButtons_0");
	private final By radio_JointAnnuitant = By.id("control332193_RadioButtons_0");
	
	private final By proceedAnyWay = By.id("proceedAnywayButton");
	
	
	private final static By button_paymentNext = By.id("bottomNext");
	
	public Payment1DetailsPage payment1MoneySource(String moneysource1)
	{
		selectDropdown(dropbox_payment1MoneySource, moneysource1, WaitStrategy.PRESENCE, "Money Source 1");
		return this;
	}
	
	public Payment1DetailsPage payment1PaymentMethod(String paymentmethod1)
	{
		selectDropdown(dropbox_payment1PaymentMethod, paymentmethod1, WaitStrategy.PRESENCE, "Payment Method 1");
		return this;
	}
	
	
	public Payment1DetailsPage payment1FundAmount(String fundamount)
	{
		sendKeys(textbox_payment1FundAmount, fundamount, WaitStrategy.VISIBLE, "Payment Amount for above payment source");
		return this;
	}
	
	public Payment1DetailsPage typeOfAnnuity(String annuitytype)
	{
		selectDropdown(dropbox_TypeOfAnnuity, annuitytype, WaitStrategy.PRESENCE, "Type Of Annuity");
		return this;
	}
	
	public Payment1DetailsPage replacementQuestion1()
	{
		click(radio_replacementQuestion1, WaitStrategy.VISIBLE, "Replacement Question 1 Radio Button");
		return this;
	}
	
	public Payment1DetailsPage replacementQuestion2()
	{
		click(radio_replacementQuestion2, WaitStrategy.VISIBLE, "Replacement Question 1 Radio Button");
		return this;
	}
	
	public Payment1DetailsPage existingContractCedingValue()
	{
		click(radio_PrimaryOwner, WaitStrategy.PRESENCE, "Primary Owner");
		click(radio_PrimaryAnnuitant, WaitStrategy.PRESENCE, "Primary Annuitant");
		click(radio_JointOwner, WaitStrategy.PRESENCE, "Joint Owner");
		click(radio_JointAnnuitant, WaitStrategy.PRESENCE, "Joint Annuitant");
		return this;
	}
	
	public Payment1AdditionalInformationPage proceedAnyWay()
	{
		click(proceedAnyWay, WaitStrategy.CLICKABLE, "Proceed Any Way");
		return new Payment1AdditionalInformationPage();
	}
	
	public Payment1DetailsPage clickNext()
	{
		click(button_paymentNext, WaitStrategy.CLICKABLE, "Next Button");
		return this;
	}
	
	public PaymentSuitabilityPage payment1ClickNext()
	{
		click(button_paymentNext, WaitStrategy.CLICKABLE, "Payment Next Button");
		return new PaymentSuitabilityPage();
	}
	
	public Payment1AdditionalInformationPage clickNextForPaymentAdditionalInfo()
	{
		click(button_paymentNext, WaitStrategy.CLICKABLE, "Payment Next Button");
		return new Payment1AdditionalInformationPage();
	}

}
