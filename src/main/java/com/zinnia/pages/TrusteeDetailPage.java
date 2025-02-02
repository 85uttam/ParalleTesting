package com.zinnia.pages;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.TrusteeDetail;

public final class TrusteeDetailPage extends BasePage {
	
	
	public TrusteeDetailPage IsTrusteeSameas()
	{
		click(TrusteeDetail.radio_IsTrusteeSameas, WaitStrategy.VISIBLE, "Is Trustee Same As");
		return this;
	}
	
	public TrusteeDetailPage trusteeName(String firstname, String lastname)
	{
		sendKeys(TrusteeDetail.textbox_TrusteeFirstName, firstname, WaitStrategy.PRESENCE, "First Name");
		sendKeys(TrusteeDetail.textbox_TrusteeLastName, lastname, WaitStrategy.PRESENCE, "Last Name");
		return this;
	}
	
	
	public TrusteeDetailPage trusteeGender()
	{
		click(TrusteeDetail.radio_TrusteeGender, WaitStrategy.VISIBLE, "Trustee Gender");
		return this;
	}
	
	public TrusteeDetailPage trusteeSSN(String ssn1, String ssn2, String ssn3)
	{
		sendKeys(TrusteeDetail.textbox_TrusteeSSN1, ssn1, WaitStrategy.PRESENCE, "Social Security Number1");
		sendKeys(TrusteeDetail.textbox_TrusteeSSN2, ssn2, WaitStrategy.PRESENCE, "Social Security Number2");
		sendKeys(TrusteeDetail.textbox_TrusteeSSN3, ssn3, WaitStrategy.PRESENCE, "Social Security Number3");
		return this;
	}
	
	public TrusteeDetailPage trusteeDateOfBirth(String dob)
	{
		sendKeys(TrusteeDetail.textbox_TrusteeDOB, dob, WaitStrategy.PRESENCE, "Date Of Birth");
		return this;
	}
	
	public TrusteeDetailPage trusteeAddress(String physicaladdress, String city, String state, String postalcode)
	{
		sendKeys(TrusteeDetail.textbox_TrusteePhysicalAddress, state, WaitStrategy.PRESENCE, "Physical Address");
		sendKeys(TrusteeDetail.textbox_TrusteeCity, city, WaitStrategy.PRESENCE, "Trustee City");
		sendKeys(TrusteeDetail.dropbox_TrusteeState, state, WaitStrategy.PRESENCE, "Trustee State");
		sendKeys(TrusteeDetail.textbox_TrusteePostalCode, postalcode, WaitStrategy.PRESENCE, "Trustee Postal Code");
		return this;
	}
	
	public TrusteeDetailPage trusteeEmailAddress(String trusteeemail)
	{
		sendKeys(TrusteeDetail.textbox_TrusteeEmailAddress, trusteeemail, WaitStrategy.PRESENCE, "Trustee Email Address");
		return this;
	}
	
	public TrusteeDetailPage trusteeMobileNumber(String mobilenumber1, String mobilenumber2, String mobilenumber3)
	{
		sendKeys(TrusteeDetail.textbox_TrusteeMobileNumber1, mobilenumber1, WaitStrategy.PRESENCE, "Trustee Mobile Number 1");
		sendKeys(TrusteeDetail.textbox_TrusteeMobileNumber2, mobilenumber2, WaitStrategy.PRESENCE, "Trustee Mobile Number 2");
		sendKeys(TrusteeDetail.textbox_TrusteeMobileNumber3, mobilenumber3, WaitStrategy.PRESENCE, "Trustee Mobile Number 3");
		return this;
	}
	
	public PrimaryAnnuitantPage clickTrusteeDetailsNext()
	{
		click(TrusteeDetail.buttonNext, WaitStrategy.CLICKABLE, "Trustee Details Next Button");
		return new PrimaryAnnuitantPage();
	}

	
}
