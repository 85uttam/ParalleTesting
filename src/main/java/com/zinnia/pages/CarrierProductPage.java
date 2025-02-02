package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public class CarrierProductPage extends BasePage {

	private final By selectAcountAgent = By.id("control299011_listBox");
	private final By selectAgentName = By.id("control299012_listBox");
	private final By selectCarrier = By.id("control299018_listBox");
	private final By selectProduct = By.id("control299019_listBox");
	private final By buttonNext = By.id("bottomNext");


	public CarrierProductPage selectAccount(String accountagent)
	{
		selectDropdown(selectAcountAgent, accountagent, WaitStrategy.PRESENCE, "Acount/Agent");
		return this;
	}

	public CarrierProductPage selectAgentName(String agentname)
	{
		selectDropdown(selectAgentName, agentname, WaitStrategy.PRESENCE, "Agent Name");
		return this;
	}

	public CarrierProductPage selectCarrierName(String carrier)
	{
		selectDropdown(selectCarrier, carrier, WaitStrategy.PRESENCE, "Carrier");
		return this;
	}

	public CarrierProductPage selectProductName(String product)
	{
		selectDropdown(selectProduct, product, WaitStrategy.PRESENCE, "Product");
		return this;
	}

	public PlanPage clicknext()
	{
		click(buttonNext, WaitStrategy.CLICKABLE, "Next");
		return new PlanPage();
	}

}
