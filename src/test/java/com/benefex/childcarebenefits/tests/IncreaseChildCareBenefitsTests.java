package com.benefex.childcarebenefits.tests;

import org.testng.annotations.Test;

import com.benefex.childcarebenefits.utility.WebDriverTestBase;

import static org.hamcrest.Matchers.is;

public class IncreaseChildCareBenefitsTests extends WebDriverTestBase{

	/**
     * This test for the authentication required to login into The reward hub website 
     * @author Navya Sudha Tippanaboyana
     */
	@Test(description = "Login to the reward hub website and")
    public void increaseChildCareBenefitsTests() throws Exception {
		logIntoTheRewardHub("ProdDemo14" , "longWater+35");
		// click on benefits 
		pages.benefexDemoHomePage().clickOnBenefits();
		// click on child care vouchers
		pages.childcareVouchersPage().clickOnChildCareVouchers();
		// check the landed page is childcareVoucherHeader
		helper.verifyThat("Checking the page has a header - Childcare Vouchers", pages.childcareVouchersPage().getChildcareVouchersText() , is("Childcare Vouchers"));
		// 
	}
}
