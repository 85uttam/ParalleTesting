package com.zinnia.pages;



import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.AdditionalClientQuestions;

public class AdditionalClientQuestionsPage extends BasePage{

	
	public AdditionalClientQuestionsPage powerOfAttorney()
	{
		click(AdditionalClientQuestions.radio_PowerOfAttorney, WaitStrategy.VISIBLE, "Power Of Attorney");
		return this;
	}
	
	
	public SubmitScreenPage additionalClientQuestionClickNext()
	{
		click(AdditionalClientQuestions.button_ACQNext, WaitStrategy.CLICKABLE, "Additional Client Question Next Button");
		return new SubmitScreenPage();
	}
	
	public AdditionalClientQuestionsPage additionalClientQuestionDetails(String totalinvestmentinannuities,String estimatedliquidnetworth,String yearsinstocks
			,String repcommnet1,String yearsinbonds,String yearsinmutualfunds,String yearsinannuities,String repcomment2)
	{
		sendKeys(AdditionalClientQuestions.textbox_totalInvestmentInAnnuities, totalinvestmentinannuities, WaitStrategy.PRESENCE, "Total Investment In Annuities");
		sendKeys(AdditionalClientQuestions.textbox_estimatedLiquidNetWorth, estimatedliquidnetworth, WaitStrategy.PRESENCE, "Estimated Liquid Networth");
		sendKeys(AdditionalClientQuestions.textbox_YearsInStocks, yearsinstocks, WaitStrategy.PRESENCE, "Years In Stocks");
		sendKeys(AdditionalClientQuestions.textbox_RepComment1, repcommnet1, WaitStrategy.PRESENCE, "Rep Commnet1");
		sendKeys(AdditionalClientQuestions.textbox_YearsInBonds, yearsinbonds, WaitStrategy.PRESENCE, "Years In Bonds");
		sendKeys(AdditionalClientQuestions.textbox_YearsInMutualFunds, yearsinmutualfunds, WaitStrategy.PRESENCE, "years in mutual funds");
		sendKeys(AdditionalClientQuestions.textbox_YearsInAnnuities, yearsinannuities, WaitStrategy.PRESENCE, "Years in annuities");
		sendKeys(AdditionalClientQuestions.textbox_RepComment2, repcomment2, WaitStrategy.PRESENCE, "Rep comment2");
		return this;
	}
	
	public AdditionalClientQuestionsPage citySignedApplicant(String applicantcity)
	{
		sendKeys(AdditionalClientQuestions.textbox_CityWhereSignedApplicant, applicantcity, WaitStrategy.PRESENCE, "City where signed by applicant");
		return this;
	}
	
	public AdditionalClientQuestionsPage stateSignedApplicant(String applicantstate)
	{
		sendKeys(AdditionalClientQuestions.textbox_StateWhereSignedApplicant, applicantstate, WaitStrategy.PRESENCE, "State where signed by applicant");
		return this;
	}
	
	public AdditionalClientQuestionsPage willThirdParty()
	{
		click(AdditionalClientQuestions.radio_WillThirdParty, WaitStrategy.VISIBLE, "Will a third party");
		return this;
	}
	
	public AdditionalClientQuestionsPage consultantMedicalEligibility()
	{
		click(AdditionalClientQuestions.radio_ConsultantMedicalEligibal, WaitStrategy.VISIBLE, "Was a legal representative consulted");
		return this;
	}
	
	public AdditionalClientQuestionsPage completedCertificateTrustAgreement(String situstrust, String grantorname, String grantorcitizenship, String grantordob, String grantorSSN1,String grantorSSN2,String grantorSSN3, String grantoraddress)
	{
		sendKeys(AdditionalClientQuestions.textbox_SitusofTrust, situstrust, WaitStrategy.VISIBLE, "Situs of Trust");
		sendKeys(AdditionalClientQuestions.textbox_NameofGrantor1, grantorname, WaitStrategy.VISIBLE, "Grantor Name");
		sendKeys(AdditionalClientQuestions.textbox_GrantorCitizenship1, grantorcitizenship, WaitStrategy.VISIBLE, "Grantor Citizenship");
		sendKeys(AdditionalClientQuestions.textbox_GrantorDateofBirth1, grantordob, WaitStrategy.VISIBLE, "Grantor(1) Date of Birth");
		sendKeys(AdditionalClientQuestions.textbox_SSNofGrantor11, grantorSSN1, WaitStrategy.VISIBLE, "SSN of Grantor 1");
		sendKeys(AdditionalClientQuestions.textbox_SSNofGrantor12, grantorSSN2, WaitStrategy.VISIBLE, "SSN of Grantor 2");
		sendKeys(AdditionalClientQuestions.textbox_SSNofGrantor13, grantorSSN3, WaitStrategy.VISIBLE, "SSN of Grantor 3");
		sendKeys(AdditionalClientQuestions.textbox_ResidentialAddressofGrantor, grantoraddress, WaitStrategy.VISIBLE, "Residential Address of Grantor");
		click(AdditionalClientQuestions.radio_TrustTIN, WaitStrategy.VISIBLE, "Please describe the Trust TIN");
		click(AdditionalClientQuestions.radio_TrustIrrevocable, WaitStrategy.VISIBLE, "Is the Trust Irrevocable");
		click(AdditionalClientQuestions.radio_TrustAuthorizeTrustee, WaitStrategy.VISIBLE, "Does the Trust authorize the Trustee");
		click(AdditionalClientQuestions.radio_DoesOwnerCurrentAgreement, WaitStrategy.VISIBLE, "Does the Owner/Insured/Annuitant have");
		click(AdditionalClientQuestions.radio_BeneficiaryOfTheTrust, WaitStrategy.VISIBLE, "Is any Beneficiary of the Trust");
		click(AdditionalClientQuestions.radio_TrusteeFurtherCertifies, WaitStrategy.VISIBLE, "The Trustee further certifies that");
		click(AdditionalClientQuestions.radio_WillThirdParty, WaitStrategy.VISIBLE, "Will a third party");
		return this;
	}
	
	public AdditionalClientQuestionsPage applicantValidReason(String spousename)
	{
		click(AdditionalClientQuestions.radio_ApplicantOwnSecondHome, WaitStrategy.VISIBLE, "The Applicant owns a second home");
		click(AdditionalClientQuestions.radio_ApplicantEmployed, WaitStrategy.VISIBLE, "The Applicant is employed, has a business address");
		click(AdditionalClientQuestions.radio_ApplicantRelative, WaitStrategy.VISIBLE, "The Applicant is a relative of or is an existing");
		click(AdditionalClientQuestions.radio_ApplicantDifferent, WaitStrategy.VISIBLE, "The Applicant is different than the Insured");
		click(AdditionalClientQuestions.radio_ApplicantTrust, WaitStrategy.VISIBLE, "The Applicant is a trust and the trustee");
		click(AdditionalClientQuestions.radio_ApplicantPowerOfAttorney, WaitStrategy.VISIBLE, "The Applicant has a power of attorney");
		sendKeys(AdditionalClientQuestions.textbox_SpouseName, spousename, WaitStrategy.PRESENCE, "Spouse Name");
		click(AdditionalClientQuestions.radio_CaliforniaMedicalProgram, WaitStrategy.VISIBLE, "Was this sale made on the basis of the product's");
		click(AdditionalClientQuestions.radio_WillThirdParty, WaitStrategy.VISIBLE, "Will a third party");
		return this;
	}
	
	
}
