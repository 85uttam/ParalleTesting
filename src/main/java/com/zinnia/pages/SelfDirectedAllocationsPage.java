package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class SelfDirectedAllocationsPage extends BasePage{


private static final By button_SelfDirectedAllocationsNext = By.id("bottomNext");

	public PrimaryBeneficiaryDetailsPage clickNextForPrimaryBeneficiary()
	{
		click(button_SelfDirectedAllocationsNext, WaitStrategy.VISIBLE, "Self Directed Allocations Next Button");
		return new PrimaryBeneficiaryDetailsPage();
	}

}
