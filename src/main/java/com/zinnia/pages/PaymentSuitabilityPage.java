package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class PaymentSuitabilityPage extends BasePage{
	
	
	
	private static final By radio_carriersPremiumThresholds = By.id("control364491_RadioButtons_1");
	
	private final By button_PaymentSuitabilityNext = By.id("bottomNext");
	private final By textbox_MortalityExpenseCharge = By.id("control339675_percentageTextBox");
	private final By textbox_GuaranteedFixedRate = By.id("control338803_percentageTextBox");
	private final By textbox_ChargeForOptionalRiders = By.id("control340690_percentageTextBox");
	private final By radio_ContactLivingBenefits = By.id("control338804_RadioButtons_1");
	private final By textbox_GuaranteedMinimumDeathBenefit = By.id("control338794_currencyTextBox");
	private final By radio_GDBHigherThanCurrentValue = By.id("control338797_RadioButtons_1");
	private final By textbox_AdvantageOfExistingContract = By.id("control338801_text");
	private final By textbox_AdvantageOfExistingContractJoint = By.id("control338813_text");
	
	private final By textbox_CurrentInterestRate = By.id("control338815_percentageTextBox");
	private final By textbox_GuaranteedMinimumInterestrate = By.id("control338816_percentageTextBox");
	private final By textbox_GuaranteedMinimumDeathBenefitJoint = By.id("control413681_currencyTextBox");
	private final By radio_DeathBenefitHighrThanCurrentValue = By.id("control413682_RadioButtons_1");
	
	
	public PaymentSuitabilityPage carriersPremiumThresholds()
	{
		click(radio_carriersPremiumThresholds, WaitStrategy.VISIBLE, "Carriers Premium Thresholds");
		return this;
	}
	
	
	public PaymentSuitabilityPage mortalityExpenseCharge(String mortalityexpensecharge)
	{
		sendKeys(textbox_MortalityExpenseCharge, mortalityexpensecharge, WaitStrategy.VISIBLE, "Mortality and Expense Charge (M&E)");
		return this;
	}
	
	public PaymentSuitabilityPage guaranteedFixedRate(String guaranteedfixedrate)
	{
		sendKeys(textbox_GuaranteedFixedRate, guaranteedfixedrate, WaitStrategy.VISIBLE, "Guaranteed Fixed Rate");
		return this;
	}
	
	public PaymentSuitabilityPage chargeForOptionalRiders(String chargeforoptionalriders)
	{
		sendKeys(textbox_ChargeForOptionalRiders, chargeforoptionalriders, WaitStrategy.VISIBLE, "Charge For Optional Riders");
		return this;
	}
	
	public PaymentSuitabilityPage existingLivingBenefit()
	{
		click(radio_ContactLivingBenefits, WaitStrategy.VISIBLE, "Does the existing contract provide living benefits");
		return this;
	}
	
	public PaymentSuitabilityPage guaranteedMinimumDeathBenefit(String guaranteeddeathBenefit)
	{
		sendKeys(textbox_GuaranteedMinimumDeathBenefit, guaranteeddeathBenefit, WaitStrategy.VISIBLE, "Guaranteed Minimum Death Benefit");
		return this;
	}
	public PaymentSuitabilityPage deathBenefitHigherThanCurrentValue()
	{
		click(radio_GDBHigherThanCurrentValue, WaitStrategy.VISIBLE, "Is the guaranteed minimum death benefit higher than the current value");
		return this;
	}
	
	public PaymentSuitabilityPage advantageExistingContract(String advantageexistingcontractvalue)
	{
		sendKeys(textbox_AdvantageOfExistingContract, advantageexistingcontractvalue, WaitStrategy.VISIBLE, "Advantage Existing Contract Value");
		return this;
	}
	
	public PaymentSuitabilityPage currentInterestRate(String currentinterestrate)
	{
		sendKeys(textbox_CurrentInterestRate, currentinterestrate, WaitStrategy.VISIBLE, "Current interest rate");
		return this;
	}
	
	public PaymentSuitabilityPage guaranteedMinimumInterestrate(String guaranteedminimuminterestrate)
	{
		sendKeys(textbox_GuaranteedMinimumInterestrate, guaranteedminimuminterestrate, WaitStrategy.VISIBLE, "Guaranteed minimum interest rate");
		return this;
	}
	
	public PaymentSuitabilityPage guaranteedMinimumDeathBenefitJoint(String guaranteedminimumdeathbenefitjoint)
	{
		sendKeys(textbox_GuaranteedMinimumDeathBenefitJoint, guaranteedminimumdeathbenefitjoint, WaitStrategy.VISIBLE, "Guaranteed Minimum Death Benefit");
		return this;
	}
	
	public PaymentSuitabilityPage deathBenefitHigherThanCurrentValueJoint()
	{
		click(radio_DeathBenefitHighrThanCurrentValue, WaitStrategy.VISIBLE, "death benefit higher than the current value");
		return this;
	}
	
	public PaymentSuitabilityPage advantageOfExistingContractJoint(String advantageOfexistingcontractjoint)
	{
		sendKeys(textbox_AdvantageOfExistingContractJoint, advantageOfexistingcontractjoint, WaitStrategy.VISIBLE, "Please explain the advantages of continuing the existing contract without changes");
		return this;
	}
	
	public PaymentsSummaryPage paymentSuitabilityClickNext()
	{
		click(button_PaymentSuitabilityNext, WaitStrategy.CLICKABLE, "Payment Suitability Next Button");
		return new PaymentsSummaryPage();
	}
	
	

	
	
}
