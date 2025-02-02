package com.zinnia.tests;

import java.util.Map;
import org.testng.annotations.Test;

import com.zinnia.annotations.FrameworkAnnotation;
import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;
import com.zinnia.pages.AN4LoginPage;
import com.zinnia.utils.FakerUtils;

public final class AN4FILI_Joint extends BaseTest {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private AN4FILI_Joint() {
	}

	/**
	 * Test Name mentioned here should match the column name "testname" in excel
	 * sheet.This is mandatory to run this test. Otherwise it will be ignored.
	 * <p>
	 * The match has to be there in both of the RUNMANAGER and TESTDATA sheet. Set
	 * the authors who have the created the test which will be logged to the
	 * reports. Set the category which this particular test case belongs to
	 * 
	 * @param data HashMap containing all the values of test data needed to run the
	 *             tests
	 */

	@Test(description = "Fili_Joint_Non_Qualified")
	@FrameworkAnnotation(author = { AuthorType.SUNEEL, AuthorType.RISHABH }, category = { CategoryType.REGRESSION })
	public void TC01(Map<String, String> data) {

		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
				.selectPartner(data.get("partner")).selectUserRole(data.get("userrole"))
				.enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
				.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml()
				.changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab()
				.getParentWindowhandle().switchToChildWindow(1).read_SAML_DATA_XMLFile()
				.closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
				.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier"))
				.selectProductName(data.get("product")).clicknext().accountDesignation(data.get("accountdesignation"))
				.planType(data.get("plantype")).ownerType(data.get("ownertype")).selectOwnInsurancePolicy()
				.selectClientConsent().clickNext()
				// Individual Owner Screen
				.individualOwnerPhysicalAddress(data.get("individualowneraddress"), data.get("individualownercity"),
						data.get("individualownerstate"), data.get("individualownerpostalcode"))
				.individualOwnerMobileNumber(data.get("individualownermobile1"), data.get("individualownermobile2"),
						data.get("individualownermobile3"))
				.isAnnuitantSameAsOwner().irsNotified().clikNextForJointOwner()
				// Joint Owner Screen
				.jointOwnerName(data.get("jointownerfirstname"), data.get("jointownerlastname")).jointOwnerGender()
				.jointOwnerDOB(data.get("jointownerdob"))
				.jointOwnerSSN(data.get("jointownerssn1"), data.get("jointownerssn2"), data.get("jointownerssn3"))
				.jointOwnerPhysicalAddress(data.get("jointownerstreetaddress"), data.get("jointownercity"),
						data.get("jointownerstate"), data.get("jointownerpostalcode"))
				.jointOwnerMobileNumber(data.get("jointownermobilepart1"), data.get("jointownermobilepart2"),
						data.get("jointownermobilepart3"))
				.jointOwnerEmailAddress(data.get("jointowneremailoaddress"))
				.jointOwnerRelationToOwner(data.get("jointownerrelationtoowner"))
				.jointOwnerRelationToAnnuitant(data.get("jointownerrelationtoannuitant")).jointOwnerClickNext()
				// Primary Annuitant Screen
				.primaryAnnuitantName(data.get("primaryannuitantfirstname"), data.get("primaryannuitantlastname"))
				.primaryAnnuitantGender().primaryAnnuitantDateOfBirth(data.get("primaryannuitantdob"))
				.primaryAnnuitantSSN(data.get("primaryannuitantssn1"), data.get("primaryannuitantssn2"),
						data.get("primaryannuitantssn3"))
				.primaryAnnuitantPhysicalAddress(data.get("primaryannuitantphysicaladdress"),
						data.get("primaryannuitantcity"), data.get("primaryannuitantstate"),
						data.get("primaryannuitantpostalcode"))
				.primaryAnnuitantRelationToOwner(data.get("primaryannuitantrelationtoowner"))
				.primaryAnnuitantClickNext()
				// Contract Feature Screen
				.clickNextForSelfDirectedAllocations()
				// Self Directed Allocation Screen
				.clickNextForPrimaryBeneficiary()
				// Beneficiary Screen
				.beneficiary1DetailsSurvivingOwnerDesignation()
				.primaryBeneficiaryPercentage(data.get("primarybene1percentage"))
				.primaryBeneficiary1EntityName(data.get("primarybene1entityname"))
				.primaryBeneficiaryRelationToOwner(data.get("primarybene1relationtoowner")).addPrimaryBeneficiary()
				.primaryBeneficiaryPercentage(data.get("primarybene2percentage"))
				.primaryBeneficiary1EntityName(data.get("primarybene1entityname"))
				.primaryBeneficiaryRelationToOwner(data.get("primarybene2relationtoowner")).primaryBeneficiaryNext()
				// Payment Screen
				.payment1MoneySource(data.get("moneysource1")).payment1PaymentMethod(data.get("paymentmethod1"))
				.payment1FundAmount(data.get("fundamount")).replacementQuestion1().replacementQuestion2()
				.payment1ClickNext()
				// Payment Suitability Screen
				.carriersPremiumThresholds().paymentSuitabilityClickNext()
				// Payment Summary Screen
				.paymentSummaryClickNext()
				// Investment Professional Information Screen
				.isRegisteredInvestmentAdvisor().freeLookPeriod().IPIClickNext()
				// Transaction Suitability Screen
				.numberOfDependents(data.get("numberofdependents")).clickRadioButtons()
				.transactionSuitabilityClickNext()
				// Additional Client Question Screen
				.additionalClientQuestionDetails(data.get("totalinvestmentobjectives"),
						data.get("estimatedliquidnetworth"), data.get("yearsinstocks"), data.get("repcomment1"),
						data.get("yearsinbonds"), data.get("yearsinmutualfunds"), data.get("yearsinannuities"),
						data.get("repcomment2"))
				.powerOfAttorney().additionalClientQuestionClickNext()
				.clickSubmitTransaction()
				.saveAndCloseTransaction();

	}

	/**
	 * Test Name mentioned here should match the column name "testname" in excel
	 * sheet.This is mandatory to run this test. Otherwise it will be ignored.
	 * <p>
	 * The match has to be there in both of the RUNMANAGER and TESTDATA sheet. Set
	 * the authors who have the created the test which will be logged to the
	 * reports. Set the category which this particular test case belongs to
	 * 
	 * @param data HashMap containing all the values of test data needed to run the
	 *             tests
	 */

	@Test(description = "Fili_Joint_Fixed")
	@FrameworkAnnotation(author = { AuthorType.GARIMA, AuthorType.RISHABH }, category = { CategoryType.REGRESSION })
	public void TC06(Map<String, String> data) {

		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
				.selectPartner(data.get("partner")).selectUserRole(data.get("userrole"))
				.enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
				.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml()
				.changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab()
				.getParentWindowhandle().switchToChildWindow(1).read_SAML_DATA_XMLFile()
				.closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
				.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier"))
				.selectProductName(data.get("product")).clicknext()

				// Plan Screen
				.accountDesignation(data.get("accountdesignation")).planType(data.get("plantype"))
				.ownerType(data.get("ownertype")).selectOwnInsurancePolicy().clickNext()
				// Individual Owner Screen
				.individualOwnerDOB(data.get("ownerage")).individualOwnerPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCityOfState("California"),
						data.get("state"), data.get("postalcode")).individualOwnerMobileNumber(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(3),
						FakerUtils.getRandomNumber(4)).clikNextForJointOwner()

				// Joint Owner Screen
				.jointOwnerName(FakerUtils.getFirstName(), FakerUtils.getLastName()).jointOwnerGender()
				.jointOwnerDOB(data.get("ownerage"))
				.jointOwnerSSN(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(2),
						FakerUtils.getRandomNumber(4))
				.jointOwnerPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCity(), data.get("state"),
						data.get("postalcode"))
				.jointOwnerMobileNumber(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(3),
						FakerUtils.getRandomNumber(4))
				.jointOwnerEmailAddress(FakerUtils.getEmailAddress())
				.jointOwnerRelationToOwner(data.get("relationtoowner")).jointOwnerClickNextForContractFeatures()

				// Primary Annuitant Screen
//		.primaryAnnuitantName(FakerUtils.getFirstName(), FakerUtils.getLastName()).primaryAnnuitantGender()
//		.primaryAnnuitantDateOfBirth(FakerUtils.getDOB()).primaryAnnuitantSSN(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(2), FakerUtils.getRandomNumber(4))
//		.primaryAnnuitantPhysicalAddress(FakerUtils.getStreetAddress(), FakerUtils.getCity(), data.get("state"), data.get("postalcode"))
//		.primaryAnnuitantRelationToOwner(data.get("relationtoowner")).primaryAnnuitantClickNext()

				// Contract Feature Screen
				.clickNextForSelfDirectedAllocations()

				// Self Directed Allocation Screen
				.clickNextForPrimaryBeneficiary()

				// Beneficiary Screen
				.primaryBeneficiaryPercentageTrust(data.get("primarybene1percentage"))
				.primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
				.primaryBeneficiaryRelationToOwnerJoint(data.get("relationtoowner")).addPrimaryBeneficiary()
				.primaryBeneficiaryPercentageTrust(data.get("primarybene2percentage"))
				.primaryBeneficiary1EntityNameTrust(FakerUtils.getInstituteName())
				.primaryBeneficiaryRelationToOwnerJoint(data.get("relationtoowner")).primaryBeneficiaryNext()

				// Payment Screen
				.payment1FundAmount(data.get("fundamount")).typeOfAnnuity(data.get("typeofannuity"))
				.existingContractCedingValue().clickNextForPaymentAdditionalInfo()

				// Payment Additional Information
				.insuranceCompanyName(data.get("insurancecompanyname")).contractNumber(FakerUtils.getRandomNumber(7))
				.estimatedContractValue(FakerUtils.getRandomNumber(4)).partialExchangeInformation().contractLocation()
				.additionalPaymentExistingContract().notifiedByIRS().transferProceed()
				.estimatedLiquidation(FakerUtils.getRandomNumber(5)).bonusProduct()
				.estimatedSurrenderChargeAmount(data.get("surrenderchargeamount"))
				.existingPolicyReplaced(data.get("repcomment")).totalAnnualCharge().haveAllCostExchange()
				.PaymentAdditionalInformationclickNext()

				// Payment Suitability Screen
				.carriersPremiumThresholds().currentInterestRate(FakerUtils.number())
				.guaranteedMinimumInterestrate(FakerUtils.number())
				.guaranteedMinimumDeathBenefitJoint(FakerUtils.getRandomNumber(5))
				.deathBenefitHigherThanCurrentValueJoint().advantageOfExistingContractJoint(data.get("repcomment"))
				.paymentSuitabilityClickNext()
				// Payment Summary Screen
				.paymentSummaryClickNext()
				// Investment Professional Information Screen
				.IPIClickNext()
				// Transaction Suitability Screen
				.numberOfDependents(data.get("numberofdependents")).timeHorizon(data.get("timehorizon"))
				.jointTransactionSuitability().transactionSuitabilityClickNext()
				// Additional Client Question Screen
				.additionalClientQuestionDetails(data.get("totalinvestmentobjectives"),
						data.get("estimatedliquidnetworth"), data.get("years"), data.get("repcomment"),
						data.get("years"), data.get("years"), data.get("years"), data.get("repcomment"))
				.consultantMedicalEligibility().applicantValidReason(FakerUtils.getFirstName())
				.additionalClientQuestionClickNext()
				.clickSubmitTransaction()
				.saveAndCloseTransaction();

	}

}
