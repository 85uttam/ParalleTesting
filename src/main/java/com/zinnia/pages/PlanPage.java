package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public final class PlanPage extends BasePage{


	private final By selectaccountDesignation = By.id("control259726_listBox");
	private final By selectplanType = By.id("control259727_listBox");
	private final By selectownerType = By.id("control259728_listBox");
	private final By radioButtonOwnInsurancePolicy_no = By.id("control260185_RadioButtons_1");
	private final By radioButtonOwnInsurancePolicy_yes = By.id("control260185_RadioButtons_0");
	private final By radiobuttonClientConsent = By.id("control449201_RadioButtons_1");
	private final By radiobuttonClientConsentTrust = By.id("control446152_RadioButtons_1");
	private final By radiobuttonPremiumSpecifiedLocation = By.id("control260189_RadioButtons_2");
	private final By buttonNext = By.id("bottomNext");

	
	public PlanPage accountDesignation(String designation)
	{
		selectDropdown(selectaccountDesignation, designation, WaitStrategy.PRESENCE, "Account Designation");
		return this;
	}


	public PlanPage planType(String plantype)
	{
		selectDropdown(selectplanType, plantype, WaitStrategy.PRESENCE, "Plan Type");
		return this;
	}

	public PlanPage ownerType(String ownertype)
	{
		selectDropdown(selectownerType, ownertype, WaitStrategy.PRESENCE, "Owner Type");
		return this;
	}

	public PlanPage selectOwnInsurancePolicy()
	{
		click(radioButtonOwnInsurancePolicy_no, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}
	
	public PlanPage selectOwnInsurancePolicyYes()
	{
		click(radioButtonOwnInsurancePolicy_yes, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}
	

	public PlanPage selectClientConsent()
	{
		click(radiobuttonClientConsent, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}
	
	public PlanPage selectClientConsentTrust()
	{
		click(radiobuttonClientConsentTrust, WaitStrategy.PRESENCE, "Radio Button");
		return this;
	}

	public PlanPage selectPremiumSPecifiedLOcation()
	{
		click(radiobuttonPremiumSpecifiedLocation, WaitStrategy.PRESENCE, "Premium Specified Location");
		return this;
	}


	public IndividualOwnerPage clickNext()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next Button");
		return new IndividualOwnerPage();
	}
	
	public TrustOwnerPage clickNextForTrustOwner()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next Button");
		return new TrustOwnerPage();
	}
	
	
	public Object clickNextdemo(String accdesignation) {
        click(buttonNext, WaitStrategy.CLICKABLE, "Next Button");
        if (accdesignation.equalsIgnoreCase("Joint")) {
            return new IndividualOwnerPage();
        } else if (accdesignation.equalsIgnoreCase("Trust")) {
            return new TrustOwnerPage();
        } else {
            // Handle other cases or throw an exception
            throw new IllegalStateException("Unknown account designation: " + accdesignation);
        }
    }


	public String getTitle() {
		return getPageTitle();
	}

}
