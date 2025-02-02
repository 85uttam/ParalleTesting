package com.zinnia.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.zinnia.annotations.FrameworkAnnotation;
import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;
import com.zinnia.pages.AN4LoginPage;


public class AN4FedilityScenarios extends BaseTest
{
	
	@Test
	@FrameworkAnnotation(author = AuthorType.SUNEEL,category = CategoryType.SMOKE)
	public void fidelity_PNCInvestmentInc(Map<String,String> data)
	{
		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin();
	}

}
