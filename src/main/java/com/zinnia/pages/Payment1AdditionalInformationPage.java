package com.zinnia.pages;

import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.Payment1AdditionalInformation;

public class Payment1AdditionalInformationPage extends BasePage{

	
	
	public Payment1AdditionalInformationPage currentFinancialInstitute(String financialinstitute)
	{
		sendKeys(Payment1AdditionalInformation.textbox_CurrentFinancialInstitute, financialinstitute, WaitStrategy.PRESENCE, "Current Financial Institute");
		return this;
	}
	
	public Payment1AdditionalInformationPage accountNumber(String accountnumber)
	{
		sendKeys(Payment1AdditionalInformation.textbox_AccountNumber, accountnumber, WaitStrategy.PRESENCE, "Account Number");
		return this;
	}
	
	public Payment1AdditionalInformationPage partialExchangeInformation()
	{
		click(Payment1AdditionalInformation.radio_ExchangeInformation, WaitStrategy.PRESENCE, "Partial Exchange Information");
		return this;
	}
	
	
	public Payment1AdditionalInformationPage existingContractInformation(String productname, String surrenderamount)
	{
		sendKeys(Payment1AdditionalInformation.textbox_ProductName, productname, WaitStrategy.PRESENCE, "Product Name");
		click(Payment1AdditionalInformation.radio_TransferProceed, WaitStrategy.VISIBLE, "Transfer Proceeds");
		sendKeys(Payment1AdditionalInformation.textbox_EstimatedSurrenderChargeAmount, surrenderamount, WaitStrategy.PRESENCE, "Estimated Surrender Charge Amount");
		return this;
	}
	
	public Payment1AdditionalInformationPage existingContractInformationPlanType(String plantype, String surrenderamount, String repcomment)
	{
		sendKeys(Payment1AdditionalInformation.dropbox_planType, plantype, WaitStrategy.PRESENCE, "Plan type");
		sendKeys(Payment1AdditionalInformation.textbox_EstimatedSurrenderChargeAmount, surrenderamount, WaitStrategy.PRESENCE, "Estimated Surrender Charge Amount");
		click(Payment1AdditionalInformation.radio_TransferProceed, WaitStrategy.VISIBLE, "Transfer Proceeds");
		sendKeys(Payment1AdditionalInformation.textbox_RepComment, repcomment, WaitStrategy.VISIBLE, "Rep Comment");
		return this;
	}
	
	public Payment1AdditionalInformationPage repComment(String repcomment)
	{
		sendKeys(Payment1AdditionalInformation.textbox_RepComment, repcomment, WaitStrategy.VISIBLE, "Rep Comment");
		return this;
	}
	
	public Payment1AdditionalInformationPage insuranceCompanyName(String insurancecompanyname)
	{
		selectDropdown(Payment1AdditionalInformation.dropbox_InsuranceCompanyName, insurancecompanyname, WaitStrategy.PRESENCE, "Insurance Company Name");
		return this;
	}
	
	public Payment1AdditionalInformationPage contractNumber(String contractNumber)
	{
		sendKeys(Payment1AdditionalInformation.textbox_ContractNumber, contractNumber, WaitStrategy.VISIBLE, "Contract Number");
		return this;
	}
	
	public Payment1AdditionalInformationPage estimatedContractValue(String estimatedcontractvalue)
	{
		sendKeys(Payment1AdditionalInformation.textbox_EstimatedContractValue, estimatedcontractvalue, WaitStrategy.VISIBLE, "Estimated Contract Value");
		return this;
	}
	public Payment1AdditionalInformationPage contractLocation()
	{
		click(Payment1AdditionalInformation.radio_ContractLocation, WaitStrategy.VISIBLE, "Contract Location");
		return this;
	}
	
	public Payment1AdditionalInformationPage additionalPaymentExistingContract()
	{
		click(Payment1AdditionalInformation.radio_AdditionalPayment, WaitStrategy.VISIBLE, "Is this an additional payment");
		return this;
	}
	
	public Payment1AdditionalInformationPage notifiedByIRS()
	{
		click(Payment1AdditionalInformation.radio_NotifiedByIRS, WaitStrategy.VISIBLE, "Have you been notified by the IRS");
		return this;
	}
	
	public Payment1AdditionalInformationPage transferProceed()
	{
		click(Payment1AdditionalInformation.radio_TransferProceed, WaitStrategy.VISIBLE, "Transfer Proceeds");
		return this;
	}
	
	public Payment1AdditionalInformationPage estimatedLiquidation(String estimatedliquidation)
	{
		sendKeys(Payment1AdditionalInformation.textbox_EstimatedLiquidation, estimatedliquidation, WaitStrategy.PRESENCE, "Estimated or actual liquidation");
		return this;
	}
	public Payment1AdditionalInformationPage bonusProduct()
	{
		click(Payment1AdditionalInformation.radio_BonusProduct, WaitStrategy.VISIBLE, "Is this a bonus product");
		return this;
	}
	
	public Payment1AdditionalInformationPage estimatedSurrenderChargeAmount(String surrenderamount)
	{
		sendKeys(Payment1AdditionalInformation.textbox_EstimatedSurrenderChargeAmount, surrenderamount, WaitStrategy.PRESENCE, "Estimated Surrender Charge Amount");
		return this;
	}
	
	public Payment1AdditionalInformationPage existingPolicyReplaced(String policyreplacedcause)
	{
		sendKeys(Payment1AdditionalInformation.radio_ExistingPolicyReplaced, policyreplacedcause, WaitStrategy.VISIBLE, "The existing policy or contract is being replaced because");
		return this;
	}
	
	public Payment1AdditionalInformationPage totalAnnualCharge()
	{
		click(Payment1AdditionalInformation.radio_TotalAnnualCharge, WaitStrategy.VISIBLE, "The total annual charges in the proposed annuity");
		return this;
	}
	
	public Payment1AdditionalInformationPage haveAllCostExchange()
	{
		click(Payment1AdditionalInformation.radio_HaveAllCostExchange, WaitStrategy.VISIBLE, "Have all costs of the exchange been");
		return this;
	}
	
	public PaymentSuitabilityPage PaymentAdditionalInformationclickNext()
	{
		click(Payment1AdditionalInformation.button_PaymentAdditionalInformationclickNext, WaitStrategy.CLICKABLE, "Payment Additional Information click Next");
		return new PaymentSuitabilityPage();
	}
	
	
	
	
}
