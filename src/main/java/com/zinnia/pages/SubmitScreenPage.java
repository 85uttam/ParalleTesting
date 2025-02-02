package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class SubmitScreenPage extends BasePage {
	
	private final By button_SubmitTransaction = By.id("ext-gen12");
	private final By button_SaveAndClose = By.id("imgcloseButton");
	
	
	public SubmitScreenPage clickSubmitTransaction()
	{
		click(button_SubmitTransaction, WaitStrategy.CLICKABLE, "Submit Transaction");
		return this;
	}

	
	public SubmitScreenPage saveAndCloseTransaction()
	{
		waitForGivenTime(75);
		click(button_SaveAndClose, WaitStrategy.CLICKABLE, "Save and Close");
		return this;
	}
}
