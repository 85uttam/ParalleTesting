package com.zinnia.tests;

import java.util.Map;
import org.testng.annotations.Test;

import com.zinnia.annotations.FrameworkAnnotation;
import com.zinnia.enums.AuthorType;
import com.zinnia.enums.CategoryType;
import com.zinnia.pages.AN4LoginPage;
import com.zinnia.utils.FakerUtils;

public final class AN4FILI_Trust extends BaseTest {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private AN4FILI_Trust() {
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

	@Test(description = "Fili_Trust")
	@FrameworkAnnotation(author = { AuthorType.SUNEEL }, category = { CategoryType.SMOKE })
	public void TC05(Map<String, String> data) {
		// AN4 Login Page Screen
		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
				// UserList Login Page Screen
				.selectPartner(data.get("partner")).selectUserRole(data.get("userrole"))
				.enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
				// SAML PTA Login Page Screen
				.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml()
				.changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab()
				.getParentWindowhandle().switchToChildWindow(1).read_SAML_DATA_XMLFile()
				.closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
				// Carrier Product Screen
				.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier"))
				.selectProductName(data.get("product")).clicknext()
				// Plan Screen
				.accountDesignation(data.get("accountdesignation")).planType(data.get("plantype"))
				.ownerType(data.get("ownertype")).selectOwnInsurancePolicyYes().selectClientConsentTrust()
				.selectPremiumSPecifiedLOcation().clickNextForTrustOwner()
				// Trust Owner Page Screen
				.trustName(FakerUtils.getFirstName()).trustDate(FakerUtils.getCurrentDate())
				.taxIdentificationNumber(FakerUtils.getRandomNumber(2), FakerUtils.getRandomNumber(7))
				.trustOwnerAddress(FakerUtils.getStreetAddress(), FakerUtils.getCityOfState("California"),
						data.get("trustownerstate"), data.get("trustownerpostalcode"))
				.trustTaxStatus().trustOwnerRelationToOwner(data.get("trustownerrelationtoannuitant"))
				.clickTrustOwnerNext()
				// Trustee Detail Screen
				.IsTrusteeSameas().trusteeName(FakerUtils.getFirstName(), FakerUtils.getLastName()).trusteeGender()
				.trusteeSSN(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(2), FakerUtils.getRandomNumber(4))
				.trusteeDateOfBirth(data.get("trusteedob"))
				.trusteeAddress(FakerUtils.getStreetAddress(), FakerUtils.getCityOfState("California"),
						data.get("trusteestate"), data.get("trusteepostalcode"))
				.trusteeEmailAddress(FakerUtils.getEmailAddress())
				.trusteeMobileNumber(FakerUtils.getRandomNumber(3), FakerUtils.getRandomNumber(3),
						FakerUtils.getRandomNumber(4))
				.clickTrusteeDetailsNext()
				// Primary Annuitant, Contract Feature, and Self Directed Allocation
				.primaryAnnuitantClickNext().livingBenefit().clickNextForSelfDirectedAllocations()
				.clickNextForPrimaryBeneficiary()
				// Primary BeneficiaryScreen
				.isBeneficiarySameAsOwner().primaryBeneficiaryPercentageTrust(data.get("primarybeneficiarypercentage"))
				.primaryBeneficiary1EntityNameTrust(FakerUtils.entityName())
				.primaryBeneficiaryRelationToAnnuitant(data.get("primarybenerelationtoannuitant"))
				.primaryBeneficiaryNext()
				// Payment Screen
				.payment1MoneySource(data.get("trustmoneysource")).payment1PaymentMethod(data.get("trustpaymentmethod"))
				.payment1FundAmount(data.get("trustpaymentamount")).typeOfAnnuity(data.get("typeofannuity"))
				.existingContractCedingValue().clickNextForPaymentAdditionalInfo()
				// Payment Additional Information Screen
				.insuranceCompanyName(data.get("insurancecompanyname")).contractNumber(FakerUtils.getRandomNumber(7))
				.estimatedContractValue(data.get("estimatedcontractvalue")).partialExchangeInformation()
				.contractLocation().transferProceed()
				.estimatedSurrenderChargeAmount(data.get("estimatedsurrenderchargeamount"))
				.existingPolicyReplaced(data.get("existingpolicyreplaced")).PaymentAdditionalInformationclickNext()
				// Payment Suitability Screen, Payment Summary and Authorization Screen
				.carriersPremiumThresholds().mortalityExpenseCharge(data.get("mortalityexpensecharge"))
				.guaranteedFixedRate(data.get("guaranteedfixedrate"))
				.chargeForOptionalRiders(data.get("chargeoptionalriders")).existingLivingBenefit()
				.guaranteedMinimumDeathBenefit(data.get("guaranteeddeathbenefit")).deathBenefitHigherThanCurrentValue()
				.advantageExistingContract(data.get("advantageofexistingcontract")).paymentSuitabilityClickNext()
				.paymentSummaryClickNextTrust().doesClientAuthorizeTrust().authorizationClickNext()
				// Investment Professional Information Screen
				.unitedArmedForces().IPIClickNext()
				// Transaction Suitability Screen
				.TrustTransactionSuitabilityPacificLife().transactionSuitabilityClickNext()
				// Additional Client Questions SCreen
				.additionalClientQuestionDetails(data.get("totalinvestmentobjectives"),
						data.get("estimatedliquidnetworth"), data.get("yearsinstocks"), data.get("repcomment1"),
						data.get("yearsinbonds"), data.get("yearsinmutualfunds"), data.get("yearsinannuities"),
						data.get("repcomment2"))
				.willThirdParty().additionalClientQuestionClickNext()
				// Submit Transaction Screen
				.clickSubmitTransaction().saveAndCloseTransaction();
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

	@Test(description = "Fili_Trust_Non_Qualified")
	@FrameworkAnnotation(author = { AuthorType.SUNEEL }, category = { CategoryType.SMOKE })
	public void TC02(Map<String, String> data) {
		// AN4 Login Page Screen
		new AN4LoginPage().enterUserName(data.get("username")).enterPassword(data.get("password")).clickLogin()
				// UserList Login Page Screen
				.selectPartner(data.get("partner")).selectUserRole(data.get("userrole"))
				.enterLoginID(data.get("loginid")).clickSearch().selectSearchOutputGridRow().clickUserLogin()
				// SAML PTA Login Page Screen
				.selectInitialAction(data.get("initialaction")).clickradiobuttonRawXml()
				.changeUserLogininSAML(data.get("loginid")).change_External_Internal_TxnId().openNewWindowTab()
				.getParentWindowhandle().switchToChildWindow(1).read_SAML_DATA_XMLFile()
				.closeAllTabsAndSwitchToMainWindow().enterSAML().clickSAMLLogin()
				// Carrier Product Screen
				.selectAccount(data.get("account_agent")).selectCarrierName(data.get("carrier"))
				.selectProductName(data.get("product")).clicknext()
				// Plan Screen
				.accountDesignation(data.get("accountdesignation")).planType(data.get("plantype"))
				.ownerType(data.get("ownertype")).selectOwnInsurancePolicy().clickNextForTrustOwner()
				// Trust Owner Page Screen
				.trustName(data.get("trustownername")).trustDate(data.get("trustownerdate"))
				.taxIdentificationNumber(data.get("taxidentification1"), data.get("taxidentification2"))
				.trustOwnerAddress(data.get("trustowneraddress"), data.get("trustownercity"),
						data.get("trustownerstate"), data.get("trustownerpostalcode"))
				.trustOwnerRelationToOwner(data.get("trustownerrelationtoannuitant")).clickTrustOwnerNext()
				// Trustee Detail Screen
				.IsTrusteeSameas().trusteeName(data.get("trusteefirstname"), data.get("trusteelastname"))
				.trusteeGender().trusteeSSN(data.get("trusteessn1"), data.get("trusteessn2"), data.get("trusteessn3"))
				.trusteeDateOfBirth(data.get("trusteedob"))
				.trusteeAddress(data.get("trusteestreetaddress"), data.get("trusteecity"), data.get("trusteestate"),
						data.get("trusteepostalcode"))
				.trusteeEmailAddress(data.get("trusteeemailaddress"))
				.trusteeMobileNumber(data.get("trusteemobile1"), data.get("trusteemobile2"), data.get("trusteemobile3"))
				.clickTrusteeDetailsNext()
				// Primary Annuitant, Contract Feature, and Self Directed Allocation
				.primaryAnnuitantClickNext().surrenderCharge3Year().clickNextForSelfDirectedAllocations()
				.clickNextForPrimaryBeneficiary()
				// Primary BeneficiaryScreen
				.primaryBeneficiaryPercentageTrust(data.get("primarybeneficiarypercentage"))
				.primaryBeneficiaryIrrevocable()
				.primaryBeneficiary1EntityNameTrust(data.get("primarybeneficiaryentityname"))
				.primaryBeneficiaryRelationToAnnuitant(data.get("primarybenerelationtoannuitant"))
				.primaryBeneficiaryNext()
				// Payment Screen
				.payment1MoneySource(data.get("trustmonetsource")).payment1PaymentMethod(data.get("trustpaymentmethod"))
				.payment1FundAmount(data.get("trustpaymentamount")).clickNextForPaymentAdditionalInfo()
				// Payment Additional Information Screen
				.currentFinancialInstitute(data.get("financialinstitute"))
				.accountNumber(data.get("paymentaccountnumber")).partialExchangeInformation()
				.existingContractInformation(data.get("productname"), data.get("surrenderchargeamount"))
				.PaymentAdditionalInformationclickNext()
				// Payment Suitability SCreen, Payment Summary and Authorization Screen
				.carriersPremiumThresholds().paymentSuitabilityClickNext().paymentSummaryClickNextTrust()
				.doesClientAuthorize().authorizationClickNext()
				// Investment Professional Information Screen
				.isRegisteredInvestmentAdvisor().IPIClickNext()
				// Transaction Suitability Screen
				.TrustTransactionSuitability(data.get("timehorizon")).transactionSuitabilityClickNext()
				// Additional Client Questions SCreen
				.additionalClientQuestionDetails(data.get("totalinvestmentobjectives"),
						data.get("estimatedliquidnetworth"), data.get("yearsinstocks"), data.get("repcomment1"),
						data.get("yearsinbonds"), data.get("yearsinmutualfunds"), data.get("yearsinannuities"),
						data.get("repcomment2"))
				.citySignedApplicant(FakerUtils.getCityOfState("California"))
				.stateSignedApplicant(FakerUtils.getState())
				.completedCertificateTrustAgreement(FakerUtils.getState(), FakerUtils.getFirstName(),
						data.get("grantorcitizenship"), data.get("grantordob"), FakerUtils.getRandomNumber(3),
						FakerUtils.getRandomNumber(2), FakerUtils.getRandomNumber(4), FakerUtils.getStreetAddress())
				.additionalClientQuestionClickNext().clickSubmitTransaction().saveAndCloseTransaction();
	}

}
