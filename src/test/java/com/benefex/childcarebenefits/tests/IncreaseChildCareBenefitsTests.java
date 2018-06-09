package com.benefex.childcarebenefits.tests;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import com.benefex.childcarebenefits.utility.WebDriverTestBase;
import java.util.Random;

import static org.hamcrest.Matchers.is;

public class IncreaseChildCareBenefitsTests extends WebDriverTestBase{

	/**
     * This test to
     * Check the user is an existing employee
     * Check the user has a child care voucher benefits
     * Make changes to existing amount
     * Add changes to basket
     * Confirm changes in basket 
     * 
     * @author Navya Sudha Tippanaboyana 
     */
	@Test(description = "Login to the reward hub website and")
    public void increaseChildCareBenefitsTests() throws Exception {
		// Loginto website
		logIntoTheRewardHub("ProdDemo14" , "longWater+35");
		// click on benefits 
		pages.benefexDemoHomePage().clickOnBenefits();
		// click on child care vouchers
		pages.childcareVouchersPage().clickOnChildCareVouchers();
		// check the landed page is childcareVoucherHeader
		helper.verifyThat("Checking the page has a header - Childcare Vouchers", pages.childcareVouchersPage().getChildcareVouchersText() , is("Childcare Vouchers"));
		// click on 'Make Changes' button
		pages.childcareVouchersPage().clickOnMakeChanges();
		// get the maximum allowed tax free amount of the employee
		String amount = pages.childcareVouchersPage().getmaxtaxFreeAmountOfTheEmployee();
		amount = amount.replace("£", "");
		System.out.println("Amount == " + amount);
		// enter amount in the 'Please enter amount' text box
		pages.childcareVouchersPage().enterAmount(amount);
		// check that the 'T & C check box is checked
		assertThat(pages.childcareVouchersPage().termsAndConditionsBeforeAddingToBasket(), is(true));
		// click on 'Add to basket'
		pages.childcareVouchersPage().clickOnAddTobasket();
		
		
	}
	
	/**
     * This test to
     * Check the user is an existing employee
     * Check the user has a child care voucher benefits
     * Make changes to existing amount (greater than the max tax free amount of the employee)
     * check for error message 
     * 
     * @author Navya Sudha Tippanaboyana 
     */
	@Test(description = "Login to the reward hub website and")
    public void unableToIncreaseChildCareBenefitsTests() throws Exception {
		// Loginto website
		logIntoTheRewardHub("ProdDemo14" , "longWater+35");
		// click on benefits 
		pages.benefexDemoHomePage().clickOnBenefits();
		// click on child care vouchers
		pages.childcareVouchersPage().clickOnChildCareVouchers();
		// check the landed page is childcareVoucherHeader
		helper.verifyThat("Checking the page has a header - Childcare Vouchers", pages.childcareVouchersPage().getChildcareVouchersText() , is("Childcare Vouchers"));
		// click on 'Make Changes' button
		pages.childcareVouchersPage().clickOnMakeChanges();
		// get the maximum allowed tax free amount of the employee
		String amount = pages.childcareVouchersPage().getmaxtaxFreeAmountOfTheEmployee();
		amount = amount.replace("£", "");
		System.out.println("Amount == " + amount);
		// enter an amount greater than max amount if the employee
		int amountGreaterThanMaxAmount = pages.childcareVouchersPage().getAmountGreaterThanMaxAmountOfTheEmployee(amount);
		// enter amount in the 'Please enter amount' text box
		pages.childcareVouchersPage().enterAmount("" +amountGreaterThanMaxAmount);
		// check that warning message 'You cannot select greater than your tax free value.' occurs or not
		helper.verifyThat("Checking the warning message - You cannot select greater than your tax free value.", pages.childcareVouchersPage().getYouCannotSelectGreaterThanYourTaxFreeValue() , is("You cannot select greater than your tax free value."));
		
		
		
	}
}
