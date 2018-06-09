package com.benefex.childcarebenefits.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChildcareVouchersPage {
	
	@FindBy(how= How.CLASS_NAME , using ="full-tile-link focused")
    private WebElement childcareVouchers=null;
	
	@FindBy(how= How.XPATH, using =".//*[@id='shop']/h1")
    private WebElement childcareVoucherHeader=null;
	
	
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

}
