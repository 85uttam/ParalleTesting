package com.zinnia.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.zinnia.driver.DriverManager;
import com.zinnia.enums.WaitStrategy;
import com.zinnia.objectRepository.TransactionSuitability;

public class TransactionSuitabilityPage extends BasePage{
		
	
	public TransactionSuitabilityPage numberOfDependents(String numberofdependents)
	{
		sendKeys(TransactionSuitability.textbox_numberOfDependents, numberofdependents, WaitStrategy.PRESENCE, "Number of dependents");
		return this;
	}
	
	public TransactionSuitabilityPage timeHorizon(String years)
	{
		sendKeys(TransactionSuitability.textbox_TimeHorizon, years, WaitStrategy.PRESENCE, "What is your time horizon for this investment");
		return this;
	}
	
	
	public TransactionSuitabilityPage clickRadioButtons()
	{
		click(TransactionSuitability.radio_OwnerMarried, WaitStrategy.VISIBLE, "Owner Married");
		click(TransactionSuitability.radio_OwnerRetired, WaitStrategy.VISIBLE, "Owner Retired");
		click(TransactionSuitability.radio_JointOwnerMarried, WaitStrategy.VISIBLE, "Joint Owner Married");
		click(TransactionSuitability.radio_JointOwnerRetired, WaitStrategy.VISIBLE, "Joint Owner Retired");
		click(TransactionSuitability.radio_RiskTolerance_AllocationStrategy, WaitStrategy.VISIBLE, "Risk Tolerance Allocation Strategy");
		click(TransactionSuitability.radio_YourAnnualIncome, WaitStrategy.VISIBLE, "Your Annual Income");
		click(TransactionSuitability.radio_InvestmentObjective, WaitStrategy.VISIBLE, "Investment Objective");
		click(TransactionSuitability.radio_GuaranteedMinimumAccumulationBenefit, WaitStrategy.VISIBLE, "Guaranteed Minimum Accumulation Benefit");
		click(TransactionSuitability.radio_TimeHorizon, WaitStrategy.VISIBLE, "Time Horizon");
		click(TransactionSuitability.radio_FederalTaxBracket, WaitStrategy.VISIBLE, "Federal Tax Bracket");
		click(TransactionSuitability.radio_EstimatedNetWorth, WaitStrategy.VISIBLE, "Estimated Net Worth");
		click(TransactionSuitability.radio_MonthlyNondiscretionaryExpenses, WaitStrategy.VISIBLE, "Monthly Nondiscretionary Expenses");
		click(TransactionSuitability.radio_HaveYouReplacedAnnuity, WaitStrategy.VISIBLE, "Have You Replaced Annuity");
		click(TransactionSuitability.radio_WillYouPurchasingThisAnnuity, WaitStrategy.VISIBLE, "Will You Purchasing This Annuity");
		click(TransactionSuitability.radio_MeansTestedGovernmentBenefits, WaitStrategy.VISIBLE, "Means Tested Government Benefits");
		click(TransactionSuitability.radio_WeHaveSufficientLiquidFunds, WaitStrategy.VISIBLE, "We Have Sufficient Liquid Funds");
		click(TransactionSuitability.radio_TaxPenalties, WaitStrategy.VISIBLE, "Tax Penalties");
		click(TransactionSuitability.radio_InvestmentPreservationRider, WaitStrategy.VISIBLE, "Investment Preservation Rider");
		click(TransactionSuitability.radio_MinimumGrowthGuarantee, WaitStrategy.VISIBLE, "Minimum Growth Guarantee");
		click(TransactionSuitability.radio_SubjectToSurrenderCharges, WaitStrategy.VISIBLE, "Subject To Surrender Charges");
		click(TransactionSuitability.radio_DependingOnInvestmentPerformance, WaitStrategy.VISIBLE, "Depending On Investment Performance");
		click(TransactionSuitability.radio_GuaranteedBenefitAmountProRata, WaitStrategy.VISIBLE, "Guaranteed Benefit Amount Pro Rata");
		click(TransactionSuitability.radio_WeHaveReceivedCurrentProspectus, WaitStrategy.VISIBLE, "We Have Received Current Prospectus");
		click(TransactionSuitability.radio_WeUnderstandThatIPRCharge, WaitStrategy.VISIBLE, "We Understand That IPR Charge");
		click(TransactionSuitability.radio_EquityInvestmentComponents, WaitStrategy.VISIBLE, "Equity Investment Components");
		click(TransactionSuitability.radio_ConservativeFidelityWealth, WaitStrategy.VISIBLE, "Conservative Fidelity Wealth");
		click(TransactionSuitability.radio_ConservativeMutualFundPortfolio, WaitStrategy.VISIBLE, "Conservative Mutual Fund Portfolio");
		click(TransactionSuitability.radio_TargetDateMutualFunds, WaitStrategy.VISIBLE, "Target Date Mutual Funds");
		click(TransactionSuitability.radio_Other, WaitStrategy.VISIBLE, "Other");
		click(TransactionSuitability.radio_AnnuityReplacementTransaction, WaitStrategy.VISIBLE, "Annuity Replacement Transaction");
		
		return this;
	}
	
	public TransactionSuitabilityPage TrustTransactionSuitability(String timehorizon)
	{
		click(TransactionSuitability.radio_RiskTolerance_AllocationStrategy_trust, WaitStrategy.VISIBLE, "Risk Tolerance");
		click(TransactionSuitability.radio_EmergencyFund, WaitStrategy.VISIBLE, "Emergency Fund");
		click(TransactionSuitability.radio_WithdrawMoney, WaitStrategy.VISIBLE, "Do you plan to withdraw money ");
		click(TransactionSuitability.radio_YourAnnualIncome, WaitStrategy.VISIBLE, "What is your annual income");
		click(TransactionSuitability.radio_WhyPurchasingAnnuity, WaitStrategy.VISIBLE, "Why are you purchasing this annuity");
		click(TransactionSuitability.radio_FederalTaxBracket, WaitStrategy.PRESENCE, "What is your federal tax bracket");
		click(TransactionSuitability.radio_EstimatedNetWorth, WaitStrategy.VISIBLE, "What is your estimated net worth");
		sendKeys(TransactionSuitability.textbox_TimeHorizon, timehorizon, WaitStrategy.PRESENCE, "What is your time horizon for this investment");
		click(TransactionSuitability.radio_MonthlyNondiscretionaryExpenses, WaitStrategy.VISIBLE, "What are your monthly nondiscretionary expenses ");
		click(TransactionSuitability.radio_HaveYouReplacedAnnuity, WaitStrategy.VISIBLE, "Have you replaced an annuity");
		click(TransactionSuitability.radio_WillYouPurchasingThisAnnuity, WaitStrategy.VISIBLE, "Will you be purchasing this annuity");
		click(TransactionSuitability.radio_MeansTestedGovernmentBenefits, WaitStrategy.VISIBLE, "Do you intend to apply for means-tested");
		click(TransactionSuitability.radio_DoYouUnderstandSurrenderCharge, WaitStrategy.VISIBLE, "Do you understand that, if you do not hold this product");
		click(TransactionSuitability.radio_HaveYouConsideredFinancialStrength, WaitStrategy.VISIBLE, "Have you considered the financial strength");
		click(TransactionSuitability.radio_ShouldTrustee, WaitStrategy.VISIBLE, "Should the trustee(s) be granted view");
		click(TransactionSuitability.radio_CertificatesofDeposits, WaitStrategy.VISIBLE, "Certificates of Deposits");
		click(TransactionSuitability.radio_TreasuryNotesandBonds, WaitStrategy.VISIBLE, "Treasury Notes and Bonds");
		click(TransactionSuitability.radio_OtherTrust, WaitStrategy.VISIBLE, "Other");
		click(TransactionSuitability.radio_AnnuityReplacementTransactionTrust, WaitStrategy.VISIBLE, "Please explain the basis for recommending");
		click(TransactionSuitability.radio_AnnuityBalanceBrokerageStatement, WaitStrategy.VISIBLE, "Does the client want to see their annuity");
		return this;
	}
	
	
	public TransactionSuitabilityPage TrustTransactionSuitabilityPacificLife()
	{
		click(TransactionSuitability.radio_RiskTolerance_AllocationStrategy, WaitStrategy.VISIBLE, "Risk Tolerance Allocation Strategy");
		click(TransactionSuitability.radio_EmergencyFund, WaitStrategy.VISIBLE, "Emergency Fund");
		click(TransactionSuitability.radio_YourAnnualIncome, WaitStrategy.VISIBLE, "Your Annual Income");
		click(TransactionSuitability.radio_InvestmentObjectiveOwner, WaitStrategy.VISIBLE, "Investment Objective");
		click(TransactionSuitability.radio_GuaranteedLifetimeWithdrawalBenefit, WaitStrategy.VISIBLE, "Guaranteed Lifetime Withdrawal Benefit");
		click(TransactionSuitability.radio_TimeHorizonOwner, WaitStrategy.VISIBLE, "Time Horizon");
		click(TransactionSuitability.radio_FederalTaxBracket, WaitStrategy.VISIBLE, "Federal Tax Bracket");
		click(TransactionSuitability.radio_EstimatedNetWorth, WaitStrategy.VISIBLE, "What is your estimated net worth");
		click(TransactionSuitability.radio_MonthlyNondiscretionaryExpenses, WaitStrategy.VISIBLE, "Monthly Nondiscretionary Expenses");
		click(TransactionSuitability.radio_HaveYouReplacedAnnuity, WaitStrategy.VISIBLE, "Have You Replaced Annuity");
		click(TransactionSuitability.radio_Haveyoureceivedcurrentprospectus, WaitStrategy.VISIBLE, "Have your Received Current Prospectus");
		click(TransactionSuitability.radio_WillYouPurchasingThisAnnuity, WaitStrategy.VISIBLE, "Will You Purchasing This Annuity");
		click(TransactionSuitability.radio_MeansTestedGovernmentBenefits, WaitStrategy.VISIBLE, "Means Tested Government Benefits");
		click(TransactionSuitability.radio_WeHaveSufficientLiquidFunds, WaitStrategy.VISIBLE, "We Have Sufficient Liquid Funds");
		click(TransactionSuitability.radio_WeUnderstandThatOnlyValueAccessible, WaitStrategy.VISIBLE, "We understand that the only value accessible");
		click(TransactionSuitability.radio_WeUnderstandThatThisAnnuity, WaitStrategy.VISIBLE, "We understand that this annuity does not provide");
		click(TransactionSuitability.radio_WeUnderstandThatThereIsOneInvestment, WaitStrategy.VISIBLE, "We understand that there is one investment");
		click(TransactionSuitability.radio_WeUnderstandThatDuringFirst, WaitStrategy.VISIBLE, "We understand that during the first 5 contract years");
		click(TransactionSuitability.radio_WeUnderstandThatEarlyWith_GLWB, WaitStrategy.VISIBLE, "We understand that early withdrawals");
		click(TransactionSuitability.radio_WeUnderstandThatAnnuityCharges, WaitStrategy.VISIBLE, "We understand that the annuity charges a Mortality");
		click(TransactionSuitability.radio_WeUnderstandThatPolicyCharges, WaitStrategy.VISIBLE, "We understand that the policy charges a GLWB rider fee");
		click(TransactionSuitability.radio_CedingCompnayFidelity, WaitStrategy.VISIBLE, "ceding company Fidelity");
		click(TransactionSuitability.radio_DeferredIncomeAnnuities, WaitStrategy.VISIBLE, "Immediate/deferred income annuities");
		click(TransactionSuitability.radio_SystematicWithdrawal, WaitStrategy.VISIBLE, "Systematic withdrawal plan from a mutual fund portfolio");
		click(TransactionSuitability.radio_FidelityWealthServicesManagedPortfolio, WaitStrategy.VISIBLE, "Fidelity Wealth Services Managed Portfolio");
		click(TransactionSuitability.radio_otherOwner, WaitStrategy.VISIBLE, "Other");
		
		return this;
	}
	
	public TransactionSuitabilityPage ownerTransactionSuitability()
	{
		click(TransactionSuitability.radio_OwnerMarried, WaitStrategy.VISIBLE, "Owner Married");
		click(TransactionSuitability.radio_OwnerRetired, WaitStrategy.VISIBLE, "Owner Retired");
		click(TransactionSuitability.radio_RiskTolerance_AllocationStrategy, WaitStrategy.VISIBLE, "Risk Tolerance Allocation Strategy");
		click(TransactionSuitability.radio_EmergencyFund, WaitStrategy.VISIBLE, "Emergency Fund");
		click(TransactionSuitability.radio_YourAnnualIncome, WaitStrategy.VISIBLE, "Your Annual Income");
		click(TransactionSuitability.radio_InvestmentObjectiveOwner, WaitStrategy.VISIBLE, "Investment Objective");
		click(TransactionSuitability.radio_GuaranteedLifetimeWithdrawalBenefit, WaitStrategy.VISIBLE, "Guaranteed Lifetime Withdrawal Benefit");
		click(TransactionSuitability.radio_TimeHorizonOwner, WaitStrategy.VISIBLE, "Time Horizon");
		click(TransactionSuitability.radio_FederalTaxBracket, WaitStrategy.VISIBLE, "Federal Tax Bracket");
		click(TransactionSuitability.radio_EstimatedNetWorth, WaitStrategy.VISIBLE, "Estimated Net Worth");
		click(TransactionSuitability.radio_MonthlyNondiscretionaryExpenses, WaitStrategy.VISIBLE, "Monthly Nondiscretionary Expenses");
		click(TransactionSuitability.radio_HaveYouReplacedAnnuity, WaitStrategy.VISIBLE, "Have You Replaced Annuity");
		click(TransactionSuitability.radio_Haveyoureceivedcurrentprospectus, WaitStrategy.VISIBLE, "Have your Received Current Prospectus");
		click(TransactionSuitability.radio_WillYouPurchasingThisAnnuity, WaitStrategy.VISIBLE, "Will You Purchasing This Annuity");
		click(TransactionSuitability.radio_MeansTestedGovernmentBenefits, WaitStrategy.VISIBLE, "Means Tested Government Benefits");
		click(TransactionSuitability.radio_WeHaveSufficientLiquidFunds, WaitStrategy.VISIBLE, "We Have Sufficient Liquid Funds");
		click(TransactionSuitability.radio_WeUnderstandThatTheOnlyValue, WaitStrategy.VISIBLE, "We understand that the only value accessible");
		click(TransactionSuitability.radio_WeUnderstandThatThisAnnuity, WaitStrategy.VISIBLE, "We understand that this annuity does not provide");
		click(TransactionSuitability.radio_WeUnderstandThatThereIsOneInvestment, WaitStrategy.VISIBLE, "We understand that there is one investment");
		click(TransactionSuitability.radio_WeUnderstandThatPriorToInitiating, WaitStrategy.VISIBLE, "We understand that prior to initiating");
		click(TransactionSuitability.radio_WeUnderstandThatEarlyWithdrawals, WaitStrategy.VISIBLE, "We understand that Early Withdrawals");
		click(TransactionSuitability.radio_WeUnderstandThatTheAnnuityCharges, WaitStrategy.VISIBLE, "We understand that the annuity charges");
		click(TransactionSuitability.radio_WeUnderstandThatThePolicyCharges, WaitStrategy.VISIBLE, "We understand that the policy charges");
		click(TransactionSuitability.radio_UnderstandThatIfWithdrawalsFromThisAnnuity, WaitStrategy.VISIBLE, "Qualified contracts only: I understand that if withdrawals from");
		
		click(TransactionSuitability.radio_DeferredIncomeAnnuities, WaitStrategy.VISIBLE, "Immediate/deferred income annuities");
		click(TransactionSuitability.radio_SystematicWithdrawal, WaitStrategy.VISIBLE, "Systematic withdrawal plan from a mutual fund portfolio");
		click(TransactionSuitability.radio_FidelityWealthServicesManagedPortfolio, WaitStrategy.VISIBLE, "Fidelity Wealth Services Managed Portfolio");
		click(TransactionSuitability.radio_otherOwner, WaitStrategy.VISIBLE, "Other");
		click(TransactionSuitability.radio_AnnuityReplacementTransaction_Owner, WaitStrategy.VISIBLE, "Annuity Replacement Transaction");
		
		return this;
	}
	
	
	public TransactionSuitabilityPage jointTransactionSuitability()
	{
		click(TransactionSuitability.radio_OwnerMarried, WaitStrategy.VISIBLE, "Owner Married");
		click(TransactionSuitability.radio_OwnerRetired, WaitStrategy.VISIBLE, "Owner Retired");
		click(TransactionSuitability.radio_JointOwnerMarried, WaitStrategy.VISIBLE, "Joint Owner Married");
		click(TransactionSuitability.radio_JointOwnerRetired, WaitStrategy.VISIBLE, "Joint Owner Retired");
		click(TransactionSuitability.radio_RiskTolerance_AllocationStrategy_trust, WaitStrategy.VISIBLE, "Risk Tolerance");
		click(TransactionSuitability.radio_EmergencyFund, WaitStrategy.VISIBLE, "Emergency Fund");
		click(TransactionSuitability.radio_YourAnnualIncome, WaitStrategy.VISIBLE, "Your Annual Income");
		click(TransactionSuitability.radio_PurchasingThisAnnuity, WaitStrategy.VISIBLE, "Why are you purchasing this annuity");
		click(TransactionSuitability.radio_FederalTaxBracket, WaitStrategy.VISIBLE, "Federal Tax Bracket");
		click(TransactionSuitability.radio_EstimatedNetWorth, WaitStrategy.VISIBLE, "Estimated Net Worth");
		click(TransactionSuitability.radio_MonthlyNondiscretionaryExpenses, WaitStrategy.VISIBLE, "Monthly Nondiscretionary Expenses");
		click(TransactionSuitability.radio_HaveYouReplacedAnnuity, WaitStrategy.VISIBLE, "Have You Replaced Annuity");
		click(TransactionSuitability.radio_WillYouPurchasingThisAnnuity, WaitStrategy.VISIBLE, "Will You Purchasing This Annuity");
		click(TransactionSuitability.radio_MeansTestedGovernmentBenefits, WaitStrategy.VISIBLE, "Means Tested Government Benefits");
		click(TransactionSuitability.radio_FinancialStrengthInsuranceCompany, WaitStrategy.VISIBLE, "Have you considered the financial strength of the insurance company");
		click(TransactionSuitability.radio_CertificatesofDeposits, WaitStrategy.VISIBLE, "Certificates of Deposits");
		click(TransactionSuitability.radio_TreasuryNotesandBonds, WaitStrategy.VISIBLE, "Treasury Notes and Bonds");
		click(TransactionSuitability.radio_OtherTrust, WaitStrategy.VISIBLE, "Other");
		click(TransactionSuitability.radio_AnnuityBalanceBrokerageStatement, WaitStrategy.VISIBLE, "Does the client want to see their annuity");
		return this;
	}
	
	public AdditionalClientQuestionsPage transactionSuitabilityClickNext()
	{
		click(TransactionSuitability.button_TransactionSuitabilityClickNext, WaitStrategy.CLICKABLE, "Transaction Suitability Next Button");
		return new AdditionalClientQuestionsPage();
	}
	
	
	public TransactionSuitabilityPage clickRadioButton(By radioButtonLocator, String radioButtonName) {
        // Implement the click method appropriately
        click(radioButtonLocator, WaitStrategy.VISIBLE, radioButtonName);
        return this;
    }
	
	
	private boolean isElementPresent(By locator) {
        try {
            WebElement element = DriverManager.getDriver().findElement(locator);
            return element.isDisplayed(); // Returns true if element is displayed
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
            return false; // Element not found or not displayed
        }
    }
	
	


    public TransactionSuitabilityPage clickRadioButtons1() {
        List<Map<By, String>> radioButtons = TransactionSuitability.initializeRadioButtons();

        for (Map<By, String> radioButton : radioButtons) {
            Map.Entry<By, String> entry = radioButton.entrySet().iterator().next();
            By locator = entry.getKey();
            String name = entry.getValue();

            if (isElementPresent(locator)) {
                clickRadioButton(locator, name);
            } else {
               // System.out.println("Element not found for radio button: " + name);
                // You can log or handle the scenario where the element is not found
                // For demonstration purposes, let's continue to the next radio button
            }
        }
        return this;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
