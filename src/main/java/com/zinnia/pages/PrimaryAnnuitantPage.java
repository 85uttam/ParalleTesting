package com.zinnia.pages;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.PrimaryAnnuitant;

public class PrimaryAnnuitantPage extends BasePage
{
	public PrimaryAnnuitantPage primaryAnnuitantName(String firstname, String lastname)
	{
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantFirstName, firstname, WaitStrategy.PRESENCE, "Primary Annuitant First Name");
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantLastName, lastname, WaitStrategy.PRESENCE, "Primary Annuitant Last Name");
		return this;
	}


	public PrimaryAnnuitantPage primaryAnnuitantGender()
	{
		click(PrimaryAnnuitant.radiobutton_primaryAnnuitantGender, WaitStrategy.PRESENCE, "Primary Annuitant Gender");
		return this;
	}

	public PrimaryAnnuitantPage primaryAnnuitantDateOfBirth(String primaryannuitantdob)
	{
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantDOB, primaryannuitantdob, WaitStrategy.VISIBLE, "Primary Annuitant Date of Birth");
		return this;
	}

	public PrimaryAnnuitantPage primaryAnnuitantSSN(String ssn1, String ssn2, String ssn3)
	{
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantSSN1, ssn1, WaitStrategy.VISIBLE, "Primary Annuitant SSN1");
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantSSN2, ssn2, WaitStrategy.VISIBLE, "Primary Annuitant SSN2");
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantSSN3, ssn3, WaitStrategy.VISIBLE, "Primary Annuitant SSN3");
		return this;
	}

	public PrimaryAnnuitantPage primaryAnnuitantPhysicalAddress(String address, String city, String state, String postalcode)
	{
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantPhysicalAddress, address, WaitStrategy.PRESENCE, "Primary Annuitant Physical Address");
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantcity, city, WaitStrategy.PRESENCE, "Primary Annuitant City");
		sendKeys(PrimaryAnnuitant.dropbox_primaryAnnuitantState, state, WaitStrategy.PRESENCE, "Primary Annuitant State");
		sendKeys(PrimaryAnnuitant.textbox_primaryAnnuitantPostalCode, postalcode, WaitStrategy.PRESENCE, "Primary Annuitant Postal Code");
		return this;
	}


	public PrimaryAnnuitantPage primaryAnnuitantRelationToOwner(String primaryAnnuitantrelationtoOwner)
	{
		selectDropdown(PrimaryAnnuitant.dropbox_primaryAnnuitantRelationToOwner, primaryAnnuitantrelationtoOwner, WaitStrategy.CLICKABLE, "Primary Annuitant Relation To Owner");
		return this;
	}

	public ContractFeaturesPage primaryAnnuitantClickNext()
	{
		click(PrimaryAnnuitant.button_primaryAnnuitantNext, WaitStrategy.CLICKABLE, "Primary Annuitant Next Button");
		return new ContractFeaturesPage();
	}

}
