package com.zinnia.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.zinnia.annotations.FrameworkAnnotation;
import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;
import com.zinnia.pages.AN4LoginPage;
import com.zinnia.utils.FakerUtils;


public class AN4FILI_Owner extends BaseTest
{
	
	
	private AN4FILI_Owner() {
	}

	@Test(description = "Fili_Owner_Qualified")
	@FrameworkAnnotation(author = {AuthorType.SUNEEL},category = {CategoryType.SMOKE})
	public void TC03(Map<String,String> data)
	{

		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
		.selectPartner(data.get("partner")).selectUserRole(data.get("userrole")).enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
		.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml().changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab().getParentWindowhandle().switchToChildWindow(1)
		.read_SAML_DATA_XMLFile().closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
		/**
		 * Carrier/Product Screen
		 */
		.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier")).selectProductName(data.get("product")).clicknext()
		/**
		 * Plan Screen
		 */
		.accountDesignation(data.get("accountdesignation")).planType(data.get("plantype")).ownerType(data.get("ownertype")).selectOwnInsurancePolicy()
		.selectPremiumSPecifiedLOcation().clickNext()
		/**
		 * IndividualOwner Screen
		 */
		.individualOwnerDOB(FakerUtils.getPrimaryOwnerDOB()).individualOwnerPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCity(), data.get("state"), data.get("postalcode"))
		.individualOwnerMobileNumber(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(4)).clickNextContractFeature()
		/**
		 * Contract Feature
		 */
		.deathBenefit().clickNextForSelfDirectedAllocations().clickNextForPrimaryBeneficiary()
		/**
		 * Primary Beneficiary Screen
		 */
		.primaryBeneficiary1EntityNameTrust(data.get("primbenepercentage1")).primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
		.primaryBeneficiaryRelationToAnnuitant(data.get("relationtoannuitant")).primaryBeneficiaryNext()
		/**
		 * Payment 1 Details screen
		 */
		.payment1MoneySource(data.get("moneysource")).payment1PaymentMethod(data.get("paymentmethod")).payment1FundAmount(data.get("paymentamount"))
		.clickNextForPaymentAdditionalInfo()
		/**
		 * Payment Additional Information
		 */
		.currentFinancialInstitute(FakerUtils.getInstituteName()).accountNumber(FakerUtils.getRandomNumber(7)).partialExchangeInformation()
		.existingContractInformationPlanType(data.get("plantype1"), data.get("surrenderchargeamount"), data.get("repcomment"))
		.PaymentAdditionalInformationclickNext()
		/**
		 * Payment Suitability Screen
		 */
		.carriersPremiumThresholds().paymentSuitabilityClickNext()
		.paymentSummaryClickNext()
		/**
		 * Investment Professional Information
		 */
		
		.isRegisteredInvestmentAdvisor().IPIClickNext()
		
		/**
		 * Transaction Suitability
		 */
		.numberOfDependents(data.get("numberofdependents")).ownerTransactionSuitability().transactionSuitabilityClickNext()
		/**
		 * Additional Client Questions Screen
		 */
		.additionalClientQuestionDetails(data.get("totalinvestmentobjectives"), data.get("estimatedliquidnetworth"), 
				data.get("yearsinstocks"), data.get("repcomment1"), data.get("yearsinbonds"), data.get("yearsinmutualfunds"), 
				data.get("yearsinannuities"), data.get("repcomment2")).powerOfAttorney().additionalClientQuestionClickNext()
		/**
		 * 
		 */
		.clickSubmitTransaction().saveAndCloseTransaction();
		
	}
	
	
	@FrameworkAnnotation(author = {AuthorType.SUNEEL},category = {CategoryType.SANITY})
	@Test
	public void TC07(Map<String,String> data)
	{
		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
		.selectPartner(data.get("partner")).selectUserRole(data.get("userrole")).enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
		.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml().changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab().getParentWindowhandle().switchToChildWindow(1)
		.read_SAML_DATA_XMLFile().closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
		/**
		 * Carrier/Product Screen
		 */
		.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier")).selectProductName(data.get("product")).clicknext()
		/**
		 * Plan Screen
		 */
		.accountDesignation(data.get("accountdesignation")).planType(data.get("plantype")).ownerType(data.get("ownertype")).selectOwnInsurancePolicyYes().clickNext()
		/**
		 * IndividualOwner Screen
		 */
		.individualOwnerDOB(FakerUtils.getPrimaryOwnerDOB()).individualOwnerPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCity(), data.get("state"), data.get("postalcode"))
		.individualOwnerMobileNumber(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(4)).isAnnuitantSameAsOwner().relationToAnnuitant(data.get("relationtoannuitant"))
		.clickNextForPrimaryAnnuitant()
		/**
		 * Primary Annuitant
		 */
		
		.primaryAnnuitantName(FakerUtils.getFirstName(), FakerUtils.getLastName()).primaryAnnuitantGender().primaryAnnuitantDateOfBirth(FakerUtils.getDOB())
		.primaryAnnuitantSSN(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(2), FakerUtils.getRandomNumber(4))
		.primaryAnnuitantPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCity(), data.get("state"), data.get("postalcode")).primaryAnnuitantClickNext()
		
		/**
		 * Contract Feature & Self Directed Allocation Screens
		 */
		
		.surrenderCharge3YearOwner().clickNextForSelfDirectedAllocations().clickNextForPrimaryBeneficiary()
		/**
		 * Primary Beneficiary
		 */
		.primaryBeneficiaryPercentageTrust(data.get("primarybenepercentage1")).primaryBeneficiaryIrrevocable().primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
		.primaryBeneficiaryRelationToAnnuitant(data.get("relationtoannuitant")).addPrimaryBeneficiary()
		
		.primaryBeneficiaryPercentageTrust(data.get("primarybenepercentage1")).primaryBeneficiaryIrrevocable().primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
		.primaryBeneficiaryRelationToAnnuitant(data.get("relationtoannuitant")).addPrimaryBeneficiary()
		
		.selectContingentBeneficiary().contingentBenePercentage(data.get("primarybenepercentage1")).primaryBeneficiaryIrrevocable().primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
		.primaryBeneficiaryRelationToAnnuitant(data.get("relationtoannuitant")).addPrimaryBeneficiary()
		
		.selectContingentBeneficiary().contingentBenePercentage(data.get("primarybenepercentage1")).primaryBeneficiaryIrrevocable().primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
		.primaryBeneficiaryRelationToAnnuitant(data.get("relationtoannuitant")).primaryBeneficiaryNext()
		
		/**
		 * Payment Details Screen1
		 */
		
		.payment1MoneySource(data.get("moneysource")).payment1PaymentMethod(data.get("paymentmethod")).payment1FundAmount(data.get("paymentamount")).replacementQuestion1().replacementQuestion2().payment1ClickNext()
		
		/**
		 * Payment Suitability Questions
		 */
		
		.carriersPremiumThresholds().paymentSuitabilityClickNext().addPayment()
		
		/**
		 * Payment Details Screen2
		 */
		.payment1MoneySource(data.get("moneysource2")).payment1PaymentMethod(data.get("paymentmethod2")).payment1FundAmount(data.get("paymentamount")).typeOfAnnuity(data.get("typeofannuity"))
		.existingContractCedingValue().clickNextForPaymentAdditionalInfo()
		/**
		 * Payment 2 / Additional Information
		 */
		
		.insuranceCompanyName(data.get("insurancecompanyname")).contractNumber(FakerUtils.getRandomNumber(5)).estimatedContractValue(FakerUtils.getRandomNumber(4)).partialExchangeInformation()
		.contractLocation().transferProceed().estimatedSurrenderChargeAmount(data.get("surrenderchargeamount")).existingPolicyReplaced(data.get("comment")).PaymentAdditionalInformationclickNext()
		/**
		 * Payment Suitability Questions
		 */
		
		.carriersPremiumThresholds().currentInterestRate(data.get("number")).guaranteedMinimumInterestrate(data.get("number")).guaranteedMinimumDeathBenefitJoint(FakerUtils.getRandomNumber(4))
		.deathBenefitHigherThanCurrentValueJoint().advantageOfExistingContractJoint(data.get("comment")).paymentSuitabilityClickNext()
		
		/**
		 * Payment Summary
		 */
		
		.paymentSummaryClickNext()
		/**
		 * Investment Professional Information
		 */
		.isRegisteredInvestmentAdvisor().unitedArmedForces().IPIClickNext()
		/**
		 * Transaction Suitability Screen
		 */
		.numberOfDependents(FakerUtils.getRandomNumber(1)).timeHorizon(FakerUtils.getRandomNumber(1)).clickRadioButtons1()
		.transactionSuitabilityClickNext()
		
		/**
		 * Additional Client Questions
		 */
		.additionalClientQuestionDetails(data.get("investment"), data.get("investment"), data.get("number"), data.get("comment"), data.get("number"), data.get("number"), data.get("number"), data.get("comment"))
		.powerOfAttorney().additionalClientQuestionClickNext()
		
		.clickSubmitTransaction().saveAndCloseTransaction();
		
		
	}

}
