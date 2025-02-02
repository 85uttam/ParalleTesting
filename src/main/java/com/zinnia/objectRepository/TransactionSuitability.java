package com.zinnia.objectRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

public class TransactionSuitability {
	
	
	public static final By textbox_numberOfDependents = By.id("control358473_text");
	public static final By radio_OwnerMarried = By.id("control303716_RadioButtons_0");
	public static final By radio_OwnerRetired = By.id("control303718_RadioButtons_0");
	public static final By radio_JointOwnerMarried = By.id("control303719_RadioButtons_0");
	public static final By radio_JointOwnerRetired = By.id("control303720_RadioButtons_0");
	public static final By radio_RiskTolerance_AllocationStrategy = By.id("control364240_RadioButtons_1");
	public static final By radio_YourAnnualIncome = By.id("control303788_RadioButtons_1");
	public static final By radio_InvestmentObjective = By.id("control370554_RadioButtons_1");
	public static final By radio_InvestmentObjectiveOwner = By.id("control459756_RadioButtons_0");
	public static final By radio_GuaranteedMinimumAccumulationBenefit = By.id("control303780_RadioButtons_0");
	public static final By radio_TimeHorizon = By.id("control303778_RadioButtons_1");
	public static final By radio_TimeHorizonOwner = By.id("control437627_RadioButtons_2");
	public static final By radio_FederalTaxBracket = By.id("control348009_RadioButtons_1");
	public static final By radio_EstimatedNetWorth = By.id("control303768_RadioButtons_1");
	public static final By radio_MonthlyNondiscretionaryExpenses = By.id("control303772_RadioButtons_1");
	public static final By radio_HaveYouReplacedAnnuity = By.id("control303763_RadioButtons_0");
	public static final By radio_WillYouPurchasingThisAnnuity = By.id("control365262_RadioButtons_0");
	public static final By radio_MeansTestedGovernmentBenefits = By.id("control341415_RadioButtons_0");
	public static final By radio_WeHaveSufficientLiquidFunds = By.id("control438535_RadioButtons_0");
	public static final By radio_TaxPenalties = By.id("control366357_RadioButtons_0");
	public static final By radio_InvestmentPreservationRider  = By.id("control366358_RadioButtons_0");
	public static final By radio_MinimumGrowthGuarantee = By.id("control366359_RadioButtons_0");
	public static final By radio_SubjectToSurrenderCharges = By.id("control366360_RadioButtons_0");
	public static final By radio_DependingOnInvestmentPerformance = By.id("control366361_RadioButtons_0");
	public static final By radio_GuaranteedBenefitAmountProRata = By.id("control366363_RadioButtons_0");
	public static final By radio_WeHaveReceivedCurrentProspectus = By.id("control366364_RadioButtons_0");
	public static final By radio_WeUnderstandThatIPRCharge = By.id("control366365_RadioButtons_0");
	public static final By radio_EquityInvestmentComponents = By.id("control395793_RadioButtons_0");
	public static final By radio_ConservativeFidelityWealth = By.id("control395785_RadioButtons_0");
	public static final By radio_ConservativeMutualFundPortfolio = By.id("control395786_RadioButtons_0");
	public static final By radio_TargetDateMutualFunds = By.id("control395787_RadioButtons_0");
	public static final By radio_Other = By.id("control437648_RadioButtons_1");
	public static final By radio_AnnuityReplacementTransaction = By.id("control388110_RadioButtons_0");
	public static final By button_TransactionSuitabilityClickNext = By.id("bottomNext");
	
	public static final By radio_RiskTolerance_AllocationStrategy_trust = By.id("control303722_RadioButtons_0");
	public static final By radio_EmergencyFund = By.id("control303785_RadioButtons_0");
	public static final By radio_WithdrawMoney = By.id("control303787_RadioButtons_1");
	public static final By radio_WhyPurchasingAnnuity = By.id("control303775_RadioButtons_0");
	
	public static final By textbox_TimeHorizon = By.id("control303818_text");
	
	public static final By radio_DoYouUnderstandSurrenderCharge = By.id("control303760_RadioButtons_0");
	public static final By radio_HaveYouConsideredFinancialStrength = By.id("control303751_RadioButtons_0");
	public static final By radio_ShouldTrustee = By.id("control330892_RadioButtons_0");
	public static final By radio_CertificatesofDeposits = By.id("control395779_RadioButtons_0");
	public static final By radio_TreasuryNotesandBonds = By.id("control395780_RadioButtons_0");
	public static final By radio_OtherTrust = By.id("control395801_RadioButtons_1");
	public static final By radio_AnnuityReplacementTransactionTrust = By.id("control388104_RadioButtons_0");
	public static final By radio_AnnuityBalanceBrokerageStatement = By.id("control402511_RadioButtons_1");
	
	public static final By radio_GuaranteedLifetimeWithdrawalBenefit = By.id("control437626_RadioButtons_0");
	public static final By radio_Haveyoureceivedcurrentprospectus = By.id("control437628_RadioButtons_0");
	public static final By radio_WeUnderstandThatTheOnlyValue = By.id("control438536_RadioButtons_0");
	public static final By radio_WeUnderstandThatThisAnnuity = By.id("control438223_RadioButtons_0");
	public static final By radio_WeUnderstandThatThereIsOneInvestment = By.id("control437636_RadioButtons_0");
	public static final By radio_WeUnderstandThatPriorToInitiating = By.id("control438537_RadioButtons_0");
	public static final By radio_WeUnderstandThatEarlyWithdrawals = By.id("control438538_RadioButtons_0");
	public static final By radio_WeUnderstandThatTheAnnuityCharges = By.id("control438539_RadioButtons_0");
	public static final By radio_WeUnderstandThatThePolicyCharges = By.id("control438540_RadioButtons_0");
	public static final By radio_UnderstandThatIfWithdrawalsFromThisAnnuity = By.id("control445664_RadioButtons_0");
	public static final By radio_DeferredIncomeAnnuities=By.id("control439547_RadioButtons_0");
	public static final By radio_SystematicWithdrawal = By.id("control437642_RadioButtons_0");
	public static final By radio_FidelityWealthServicesManagedPortfolio = By.id("control437643_RadioButtons_0");
	public static final By radio_otherOwner = By.id("control437658_RadioButtons_1");
	public static final By radio_AnnuityReplacementTransaction_Owner = By.id("control437644_RadioButtons_0");
	
	public static final By radio_WeUnderstandThatOnlyValueAccessible =By.id("control437634_RadioButtons_0");
	public static final By radio_WeUnderstandThatDuringFirst = By.id("control437637_RadioButtons_0");
	public static final By radio_WeUnderstandThatEarlyWith_GLWB = By.id("control437638_RadioButtons_0");
	public static final By radio_WeUnderstandThatAnnuityCharges = By.id("control437639_RadioButtons_0");
	public static final By radio_WeUnderstandThatPolicyCharges = By.id("control437640_RadioButtons_0");
	public static final By radio_CedingCompnayFidelity = By.id("control308609_RadioButtons_0");
	
	public static final By radio_PurchasingThisAnnuity = By.id("control418330_RadioButtons_0");
	public static final By radio_FinancialStrengthInsuranceCompany = By.id("control418334_RadioButtons_0");

	
	
	
	public static List<Map<By, String>> initializeRadioButtons() {
        List<Map<By, String>> radioButtons = new ArrayList<>();
        radioButtons.add(Map.of(radio_OwnerMarried, "Owner Married"));
        radioButtons.add(Map.of(radio_OwnerRetired, "Owner Retired"));
        radioButtons.add(Map.of(radio_JointOwnerMarried, "Joint Owner Married"));
        radioButtons.add(Map.of(radio_JointOwnerRetired, "Joint Owner Retired"));
        radioButtons.add(Map.of(radio_RiskTolerance_AllocationStrategy_trust, "What is your risk tolerance/allocation strategy"));
        radioButtons.add(Map.of(radio_YourAnnualIncome, "What is your annual income"));
        radioButtons.add(Map.of(radio_WhyPurchasingAnnuity, "Why are you purchasing this annuity"));
        radioButtons.add(Map.of(radio_InvestmentObjective, "Investment Objective"));
        radioButtons.add(Map.of(radio_InvestmentObjectiveOwner, ""));
        radioButtons.add(Map.of(radio_GuaranteedMinimumAccumulationBenefit, ""));
        radioButtons.add(Map.of(radio_TimeHorizon, ""));
        radioButtons.add(Map.of(radio_TimeHorizonOwner, ""));
        radioButtons.add(Map.of(radio_FederalTaxBracket, ""));
        radioButtons.add(Map.of(radio_EstimatedNetWorth, ""));
        radioButtons.add(Map.of(radio_MonthlyNondiscretionaryExpenses, ""));
        radioButtons.add(Map.of(radio_HaveYouReplacedAnnuity, ""));
        radioButtons.add(Map.of(radio_WillYouPurchasingThisAnnuity, ""));
        radioButtons.add(Map.of(radio_MeansTestedGovernmentBenefits, ""));
        radioButtons.add(Map.of(radio_WeHaveSufficientLiquidFunds, ""));
        radioButtons.add(Map.of(radio_TaxPenalties, ""));
        radioButtons.add(Map.of(radio_InvestmentPreservationRider, ""));
        radioButtons.add(Map.of(radio_MinimumGrowthGuarantee, ""));
        radioButtons.add(Map.of(radio_SubjectToSurrenderCharges, ""));
        radioButtons.add(Map.of(radio_DependingOnInvestmentPerformance, ""));
        radioButtons.add(Map.of(radio_GuaranteedBenefitAmountProRata, ""));
        radioButtons.add(Map.of(radio_WeHaveReceivedCurrentProspectus, ""));
        radioButtons.add(Map.of(radio_WeUnderstandThatIPRCharge, ""));
        radioButtons.add(Map.of(radio_EquityInvestmentComponents, ""));
        radioButtons.add(Map.of(radio_ConservativeFidelityWealth, ""));
        radioButtons.add(Map.of(radio_ConservativeMutualFundPortfolio, ""));
        radioButtons.add(Map.of(radio_TargetDateMutualFunds, ""));
        radioButtons.add(Map.of(radio_Other, ""));
        radioButtons.add(Map.of(radio_AnnuityReplacementTransaction, ""));
        radioButtons.add(Map.of(radio_RiskTolerance_AllocationStrategy_trust, ""));
        radioButtons.add(Map.of(radio_EmergencyFund, ""));
        radioButtons.add(Map.of(radio_WithdrawMoney, ""));
        radioButtons.add(Map.of(radio_DoYouUnderstandSurrenderCharge, "Do You Understand Surrender Charge"));
        radioButtons.add(Map.of(radio_HaveYouConsideredFinancialStrength, "Have You Considered Financial Strength"));
        radioButtons.add(Map.of(radio_ShouldTrustee, "Should Trustee"));
        radioButtons.add(Map.of(radio_CertificatesofDeposits, "Certificates of Deposits"));
        radioButtons.add(Map.of(radio_TreasuryNotesandBonds, "Treasury Notes and Bonds"));
        radioButtons.add(Map.of(radio_OtherTrust, "Other"));
        radioButtons.add(Map.of(radio_AnnuityReplacementTransactionTrust, "Annuity Replacement Transaction Trust"));
        radioButtons.add(Map.of(radio_AnnuityBalanceBrokerageStatement, "Annuity Balance Brokerage Statement"));
        radioButtons.add(Map.of(radio_GuaranteedLifetimeWithdrawalBenefit, "Guaranteed Life time Withdrawal Benefit"));
        radioButtons.add(Map.of(radio_Haveyoureceivedcurrentprospectus, "Have you received current prospectus"));
        radioButtons.add(Map.of(radio_WeUnderstandThatTheOnlyValue, "We Understand That The Only Value"));
        radioButtons.add(Map.of(radio_WeUnderstandThatThisAnnuity, "We Understand That This Annuity"));
        radioButtons.add(Map.of(radio_WeUnderstandThatThereIsOneInvestment, "We Understand That There Is One Investment"));
        radioButtons.add(Map.of(radio_WeUnderstandThatPriorToInitiating, "We Understand That Prior To Initiating"));
        radioButtons.add(Map.of(radio_WeUnderstandThatEarlyWithdrawals, "We Understand That Early Withdrawals"));
        radioButtons.add(Map.of(radio_WeUnderstandThatTheAnnuityCharges, "We Understand That The Annuity Charges"));
        radioButtons.add(Map.of(radio_WeUnderstandThatThePolicyCharges, "We Understand That The Policy Charges"));
        radioButtons.add(Map.of(radio_UnderstandThatIfWithdrawalsFromThisAnnuity, "Understand That If Withdrawals From This Annuity"));
        radioButtons.add(Map.of(radio_DeferredIncomeAnnuities, "Deferred Income Annuities"));
        radioButtons.add(Map.of(radio_SystematicWithdrawal, "Systematic Withdrawal"));
        radioButtons.add(Map.of(radio_FidelityWealthServicesManagedPortfolio, "Fidelity Wealth Services Managed Portfolio"));
        radioButtons.add(Map.of(radio_otherOwner, "Other"));
        radioButtons.add(Map.of(radio_AnnuityReplacementTransaction_Owner, "Annuity Replacement Transaction"));
        radioButtons.add(Map.of(radio_WeUnderstandThatOnlyValueAccessible, "We Understand That Only Value Accessible"));
        radioButtons.add(Map.of(radio_WeUnderstandThatDuringFirst, "We Understand That During First"));
        radioButtons.add(Map.of(radio_WeUnderstandThatEarlyWith_GLWB, "We Understand That Early With GLWB"));
        radioButtons.add(Map.of(radio_WeUnderstandThatAnnuityCharges, "We Understand That Annuity Charges"));
        radioButtons.add(Map.of(radio_WeUnderstandThatPolicyCharges, "We Understand That Policy Charges"));
        radioButtons.add(Map.of(radio_CedingCompnayFidelity, "Ceding Compnay Fidelity"));
        radioButtons.add(Map.of(radio_PurchasingThisAnnuity, "Purchasing This Annuity"));
        radioButtons.add(Map.of(radio_FinancialStrengthInsuranceCompany, "Financial Strength Insurance Company"));
        
        // Add more radio buttons as needed...
        return radioButtons;
    }
	
	
	
	
	
}
