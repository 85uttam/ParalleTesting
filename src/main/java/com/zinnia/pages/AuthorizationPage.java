package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class AuthorizationPage extends BasePage{
	
	private final By radio_DoesClientAuthorize = By.id("control259873_152777_AgentOfRecord_1");
	private final By radio_DoesClientAuthorizeTrust = By.id("control259873_157905_PrimaryOwner_1");
	
	private final By button_AuthorizationClickNext = By.id("bottomNext");
	
	public AuthorizationPage doesClientAuthorize()
	{
		click(radio_DoesClientAuthorize, WaitStrategy.PRESENCE, "Does Client Authorize To Perform Transaction");
		return this;
	}
	
	public AuthorizationPage doesClientAuthorizeTrust()
	{
		click(radio_DoesClientAuthorizeTrust, WaitStrategy.PRESENCE, "Does Client Authorize To Perform Transaction");
		return this;
	}
	
	public InvestmentProfessionalInformationPage authorizationClickNext()
	{
		click(button_AuthorizationClickNext, WaitStrategy.CLICKABLE, "Authorization Next Button");
		return new InvestmentProfessionalInformationPage();
	}

}
