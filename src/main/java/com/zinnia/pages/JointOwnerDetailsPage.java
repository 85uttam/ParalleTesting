package com.zinnia.pages;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.JointOwnerDetails;

public class JointOwnerDetailsPage extends BasePage{

	public JointOwnerDetailsPage jointOwnerName(String firstname, String lastname)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerFistName, firstname, WaitStrategy.PRESENCE, "Joint Owner First Name");
		sendKeys(JointOwnerDetails.textbox_jointOwnerLastName, lastname, WaitStrategy.PRESENCE, "Joint Owner Last Name");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerGender()
	{
		click(JointOwnerDetails.radiobutton_jointOwnerGender, WaitStrategy.PRESENCE, "Joint Owner Gender");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerDOB(String jointownerdob)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerDOB, jointownerdob, WaitStrategy.PRESENCE, "Joint Owner Date Of Birth");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerSSN(String ssn1, String ssn2, String ssn3)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerSSN1, ssn1, WaitStrategy.PRESENCE, "Joint Owner Socila Security Number1");
		sendKeys(JointOwnerDetails.textbox_jointOwnerSSN2, ssn2, WaitStrategy.PRESENCE, "Joint Owner Socila Security Number2");
		sendKeys(JointOwnerDetails.textbox_jointOwnerSSN3, ssn3, WaitStrategy.PRESENCE, "Joint Owner Socila Security Number3");
		return this;
	}


	public JointOwnerDetailsPage jointOwnerPhysicalAddress(String street, String city, String state, String postalcode)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerPhysicalAddress, street, WaitStrategy.PRESENCE, "Joint Owner Address");
		sendKeys(JointOwnerDetails.textbox_jointOwnerCity, city, WaitStrategy.PRESENCE, "Joint Owner City");
		selectDropdown(JointOwnerDetails.dropbox_jointOwnerState, state, WaitStrategy.CLICKABLE, "Joint Owner State");
		sendKeys(JointOwnerDetails.textbox_jointOwnerPostalCode, postalcode, WaitStrategy.PRESENCE, "Joint Owner Postal Code");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerMobileNumber(String mobilepart1, String mobilepart2, String mobilepart3)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerMobileNumber1, mobilepart1, WaitStrategy.PRESENCE, "Joint Owner Mobile Number1");
		sendKeys(JointOwnerDetails.textbox_jointOwnerMobileNumber2, mobilepart2, WaitStrategy.PRESENCE, "Joint Owner Mobile Number2");
		sendKeys(JointOwnerDetails.textbox_jointOwnerMobileNumber3, mobilepart3, WaitStrategy.PRESENCE, "Joint Owner Mobile Number3");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerEmailAddress(String jointowneremailaddress)
	{
		sendKeys(JointOwnerDetails.textbox_jointOwnerEmailAddress, jointowneremailaddress, WaitStrategy.PRESENCE, "Joint Owner Email Address");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerRelationToOwner(String jointownerrelationtoowner)
	{
		selectDropdown(JointOwnerDetails.dropbox_jointOwnerRelationToOwner, jointownerrelationtoowner, WaitStrategy.CLICKABLE, "Joint Owner Relation to Owner");
		return this;
	}

	public JointOwnerDetailsPage jointOwnerRelationToAnnuitant(String jointownerrelationtoannuitant)
	{
		selectDropdown(JointOwnerDetails.dropbox_jointOwnerRelatinToAnnuitant, jointownerrelationtoannuitant, WaitStrategy.CLICKABLE, "Joint Owner Relation to Annuitant");
		return this;
	}

	public PrimaryAnnuitantPage jointOwnerClickNext()
	{
		click(JointOwnerDetails.button_jointOwnerclickNext, WaitStrategy.CLICKABLE, "Next button");
		return new PrimaryAnnuitantPage();
	}
	
	public ContractFeaturesPage jointOwnerClickNextForContractFeatures()
	{
		click(JointOwnerDetails.button_jointOwnerclickNext, WaitStrategy.CLICKABLE, "Next button");
		return new ContractFeaturesPage();
	}


}
