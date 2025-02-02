package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class ContractFeaturesPage extends BasePage{


	private final By radio_surrenderCharge3Year = By.id("control259957_CDS_0");
	private final By button_ContractFeaturesNext = By.id("bottomNext");
	private final By radio_PremiumDeathBenefit = By.id("control259957_DBO_0");
	private final By radio_LivingBenefit = By.id("control259957_JFL_0");
	private final By radio_SurrenderCharges3YearsOwner = By.id("control259957_SC_0");
	
	public ContractFeaturesPage livingBenefit()
	{
		click(radio_LivingBenefit, WaitStrategy.PRESENCE, "Guaranteed Lifetime Withdrawal Benefit (Single Life)");
		return this;
	}
	
	public ContractFeaturesPage surrenderCharge3Year()
	{
		click(radio_surrenderCharge3Year, WaitStrategy.PRESENCE, "Surrender Charge 3 Year");
		return this;
	}
	
	public ContractFeaturesPage surrenderCharge3YearOwner()
	{
		click(radio_SurrenderCharges3YearsOwner, WaitStrategy.VISIBLE, "Surrender Charge 3 Year");
		return this;
	}

	public SelfDirectedAllocationsPage clickNextForSelfDirectedAllocations()
	{
		click(button_ContractFeaturesNext, WaitStrategy.VISIBLE, "Contract Features Next Button");
		return new SelfDirectedAllocationsPage();
	}
	
	
	public ContractFeaturesPage deathBenefit()
	{
		click(radio_PremiumDeathBenefit, WaitStrategy.VISIBLE, "Standard Return of Premium Death Benefit");
		return this;
	}

}
