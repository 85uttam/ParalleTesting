package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class PaymentsSummaryPage extends BasePage{
	
	
	private final By button_PaymentSummaryNext = By.id("bottomNext");
	
	private final By button_AddPaymnet = By.id("addPaymentButton");

	public Payment1DetailsPage addPayment()
	{
		click(button_AddPaymnet, WaitStrategy.CLICKABLE, "Add Payment");
		return new Payment1DetailsPage();
	}
	
	public InvestmentProfessionalInformationPage paymentSummaryClickNext()
	{
		click(button_PaymentSummaryNext, WaitStrategy.CLICKABLE, "Payment Suitability Next Button");
		return new InvestmentProfessionalInformationPage();
	}
	
	public AuthorizationPage paymentSummaryClickNextTrust()
	{
		click(button_PaymentSummaryNext, WaitStrategy.CLICKABLE, "Payment Suitability Next Button");
		return new AuthorizationPage();
	}
}
