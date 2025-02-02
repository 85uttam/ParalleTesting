package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class InvestmentProfessionalInformationPage extends BasePage{
	
	private final By radio_registeredInvestmentAdvisor = By.id("control461898_RadioButtons_1");
	private final By radio_variableFundsDuringFreelookPeriod = By.id("control369667_RadioButtons_0");
	private final By radio_UnitedArmedForces = By.id("control259879_RadioButtons_1");
	private final static By button_IPINext = By.id("bottomNext");
	
	public InvestmentProfessionalInformationPage isRegisteredInvestmentAdvisor()
	{
		click(radio_registeredInvestmentAdvisor, WaitStrategy.VISIBLE, "is Investment Advisor Client Registered ?");
		return this;
	}
	
	public InvestmentProfessionalInformationPage freeLookPeriod()
	{
		click(radio_variableFundsDuringFreelookPeriod, WaitStrategy.PRESENCE, "Variable Funds During Freelook Period");
		return this;
	}
	
	
	public InvestmentProfessionalInformationPage unitedArmedForces()
	{
		click(radio_UnitedArmedForces, WaitStrategy.VISIBLE, "United States Armed Forces");
		return this;
	}
	
	public TransactionSuitabilityPage IPIClickNext()
	{
		click(button_IPINext, WaitStrategy.CLICKABLE, "Payment Suitability Next Button");
		return new TransactionSuitabilityPage();
	}

}
