package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public final class AN4UserListPage extends BasePage{


	private final By dropdownboxPartnerId = By.id("partnerId");
	private final By dropdownboxUserRole = By.id("userRole");
	private final By textboxLoginID = By.id("logonID");
	private final By buttonSearch = By.id("ext-gen12");
	private final By gridrowSearchOutput = By.xpath("//*[@id='ext-gen24']/div[1]");
	private final By buttonUserListLogin = By.id("login");



	public AN4UserListPage selectPartner(String partnerid)
	{
		selectDropdown(dropdownboxPartnerId, partnerid, WaitStrategy.CLICKABLE, "PartnerID");
		return this;
	}

	public AN4UserListPage selectUserRole(String userrole)
	{
		selectDropdown(dropdownboxUserRole, userrole, WaitStrategy.CLICKABLE, "Userrole");
		return this;
	}

	public AN4UserListPage enterLoginID(String loginid)
	{
		sendKeys(textboxLoginID, loginid, WaitStrategy.PRESENCE, "LoginID");
		return this;
	}

	public AN4UserListPage clickSearch()
	{
		click(buttonSearch, WaitStrategy.CLICKABLE, "Search Button");
		return this;
	}

	public AN4UserListPage selectSearchOutputGridRow()
	{
		click(gridrowSearchOutput, WaitStrategy.VISIBLE, "User Search Result");
		return this;
	}

	public SAML_PTA_LoginPage clickUserLogin()
	{
		click(buttonUserListLogin, WaitStrategy.CLICKABLE, "User List Login Button");
		return new SAML_PTA_LoginPage();
	}


}
