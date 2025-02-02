package com.zinnia.pages;

import org.openqa.selenium.By;

import com.zinnia.enums.WaitStrategy;

public final class AN4LoginPage extends BasePage{


	private final By textboxUsername = By.id("username");
	private final By textboxPassword = By.id("password");
	private final By buttonLogin = By.id("loginButton");

	public AN4LoginPage enterUserName(String username)
	{
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "Username");
		return this;
	}

	public AN4LoginPage enterPassword(String password)
	{
		sendKeys(textboxPassword, password, WaitStrategy.PRESENCE, "Password");
		return this;
	}

	public AN4UserListPage clickLogin()
	{
		click(buttonLogin, WaitStrategy.CLICKABLE, "Login Button");
		return new AN4UserListPage();
	}

}
