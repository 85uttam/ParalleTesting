package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.utils.DecodeUtils;

public final class OrangeHRMLoginPage extends BasePage{


	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");


	public OrangeHRMLoginPage enterUserName(String username) {

		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE,"Username");
		return this;
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, DecodeUtils.getDecodedString(password), WaitStrategy.PRESENCE,"Password");
		return this;
	}
	public TrusteeDetailPage clickLogin() {
		click(buttonLogin, WaitStrategy.PRESENCE, "Login Button");
		return new TrusteeDetailPage();
	}

	public String getTitle() {
		return getPageTitle();
	}


}
