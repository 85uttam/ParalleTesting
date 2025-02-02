package com.zinnia.pages;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.PrimaryBeneficiaryDetails;

public class PrimaryBeneficiaryDetailsPage extends BasePage{


	
	public PrimaryBeneficiaryDetailsPage beneficiary1DetailsSurvivingOwnerDesignation()
	{
		click(PrimaryBeneficiaryDetails.radio_SurvivingOwnerDesignation, WaitStrategy.PRESENCE, "Surviving Owner Designation");
		return this;
	}
	
	public PrimaryBeneficiaryDetailsPage isBeneficiarySameAsOwner()
	{
		click(PrimaryBeneficiaryDetails.radio_isBeneficiarySameAsOwner, WaitStrategy.PRESENCE, "is Beneficiary Same As Owner");
		return this;
	}
	

	/**
	 * Enter Primary Beneficiary Percentage
	 * 
	 * @param primaryBeneficiary1percentage
	 * @return
	 */
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryPercentage(String primarybeneficiary1percentage)
	{
		sendKeys(PrimaryBeneficiaryDetails.textbox_primaryBeneficiaryPercentage, primarybeneficiary1percentage, WaitStrategy.PRESENCE, "Primary Beneficiary Percentage");
		return this;
	}
	
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryPercentageTrust(String primaryBeneficiary1percentage)
	{
		sendKeys(PrimaryBeneficiaryDetails.textbox_primaryBeneficiaryPercentageTrust, primaryBeneficiary1percentage, WaitStrategy.PRESENCE, "Primary Beneficiary 1 Percentage");
		return this;
	}
	
	public PrimaryBeneficiaryDetailsPage contingentBenePercentage(String contingentBenePercentage)
	{
		sendKeys(PrimaryBeneficiaryDetails.textbox_ContingentBeneficiaryPercentageOwner, contingentBenePercentage, WaitStrategy.PRESENCE, "Contingent Beneficiry Percentage");
		return this;
	}
	
	
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryIrrevocable()
	{
		click(PrimaryBeneficiaryDetails.radio_primaryBeneficiaryIrrevocabl, WaitStrategy.PRESENCE, "Irrevocable");
		return this;
	}

	/**
	 * Enter Primary Beneficiary Entity Name
	 * 
	 * @param primaryBeneficiary1entityname
	 * @return
	 */
	public PrimaryBeneficiaryDetailsPage primaryBeneficiary1EntityName(String primaryBeneficiary1entityname)
	{
		sendKeys(PrimaryBeneficiaryDetails.textbox_primaryBeneficiaryEntityName, primaryBeneficiary1entityname, WaitStrategy.PRESENCE, "Primary Beneficiary1 Entity Name");
		return this;
	}
	
	public PrimaryBeneficiaryDetailsPage primaryBeneficiary1EntityNameTrust(String primaryBeneficiary1entityname)
	{
		sendKeys(PrimaryBeneficiaryDetails.textbox_primaryBeneficiaryEntityNameTrust, primaryBeneficiary1entityname, WaitStrategy.PRESENCE, "Primary Beneficiary1 Entity Name");
		return this;
	}
	
	

	/**
	 * Select Primary Beneficiary Relation To Owner
	 * 
	 * @param relationtoowner
	 * @return
	 */
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryRelationToOwner(String relationtoowner)
	{
		selectDropdown(PrimaryBeneficiaryDetails.dropbox_primaryBeneficiaryRelationToOwner, relationtoowner, WaitStrategy.PRESENCE, "Relation to Owner");
		return this;
	}
	
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryRelationToOwnerJoint(String relationtoowner)
	{
		selectDropdown(PrimaryBeneficiaryDetails.dropbox_primaryBeneficiaryRelationToOwnerJoint, relationtoowner, WaitStrategy.PRESENCE, "Relation to Owner");
		return this;
	}
	
	
	
	
	public PrimaryBeneficiaryDetailsPage primaryBeneficiaryRelationToAnnuitant(String relationtoannuitant)
	{
		selectDropdown(PrimaryBeneficiaryDetails.dropbox_primaryBeneficiaryRelationToAnnuitant, relationtoannuitant, WaitStrategy.PRESENCE, "Relation To Annuitant");
		return this;
	}
	
	/**
	 * Add Beneficiary
	 * 
	 * @return
	 */

	public PrimaryBeneficiaryDetailsPage addPrimaryBeneficiary()
	{
		click(PrimaryBeneficiaryDetails.button_addPrimaryBeneficiary, WaitStrategy.CLICKABLE, "Add Beneficiary");
		return this;
	}
	
	
	public PrimaryBeneficiaryDetailsPage selectContingentBeneficiary()
	{
		click(PrimaryBeneficiaryDetails.radio_ContingentBeneficiary, WaitStrategy.VISIBLE, "Contingent Beneficiary");
		return this;
	}
	
	
	public Payment1DetailsPage primaryBeneficiaryNext()
	{
		click(PrimaryBeneficiaryDetails.button_PrimaryBeneficiary1Next, WaitStrategy.CLICKABLE, "Primary Beneficiary 1 Next Button");
		return new Payment1DetailsPage();
	}

}
