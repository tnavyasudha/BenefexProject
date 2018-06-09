package com.benefex.childcarebenefits.pages;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChildcareVouchersPage {
	
	@FindBy(how= How.CSS , using ="a[href*='/benefexdemo/flex/shop/summary/ccvallsave']")
    private WebElement childcareVouchers=null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='shop']/h1")
    private WebElement childcareVoucherHeader=null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='editBenefit']")
    private WebElement makeChangesButton =null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='shop']/div[1]/div/p/span")
    private WebElement maxTaxFreeAmount =null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='ccvallsave_c_employeemonthlycost']")
	private WebElement pleaseEnterAmount =null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='ccvallsave_c_termsconditions']")
	private WebElement termsAndConditionsBeforeAddingToBasket =null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='AddToBasket']")
	private WebElement addToBasket =null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='exceptions']/div")
	private WebElement youCannotSelectGreaterThanYourTaxFreeValueText =null;
	
	/*
     * Method to click on child care Vouchers
     */
    public void clickOnChildCareVouchers() {
    	childcareVouchers.click();
    }

    /*
     * Method to get 'Childcare Vouchers' header text on the page 
     */
    public String getChildcareVouchersText() {
        return childcareVoucherHeader.getText();
    
    }
    
    /*
     * Method to click on 'Make changes' button
     */
    public void clickOnMakeChanges() {
    	makeChangesButton.click();
    }

    /*
     * Method to get max tax free amount of the employee 
     */
    public String getmaxtaxFreeAmountOfTheEmployee() {
        return maxTaxFreeAmount.getText();
    
    }
    
    /*
     * Method to enter number in 'please enter an amount' textbox
     */
    public void enterAmount(String amount) {
    	pleaseEnterAmount.sendKeys(amount);
    }
    
    /*
     * Method to check the terms and conditions check box is checked or not
     */
    public boolean termsAndConditionsBeforeAddingToBasket() {
    	return termsAndConditionsBeforeAddingToBasket.isSelected();
    }


    /*
     * Method to click on 'Add to basket' button
     */
    public void clickOnAddTobasket() {
    	addToBasket.click();
    }
    
    /*
     * Method to generate a random number
     */
    public int getAmountGreaterThanMaxAmountOfTheEmployee(String amount) {
    	Random rand = new Random();
    	int x = rand.nextInt(900) + Integer.valueOf(amount);
    	return x;
    }
    
    /*
     * Method to get 'You cannot select greater than your tax free value.' text 
     */
    public String getYouCannotSelectGreaterThanYourTaxFreeValue() {
        return youCannotSelectGreaterThanYourTaxFreeValueText.getText();
    
    }
    
}
