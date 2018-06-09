package com.benefex.childcarebenefits.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BenefexDemoHomePage {
	
	@FindBy(how= How.XPATH, using =".//*[@id='flexibleBenefits']")
    private WebElement benefits=null;
	
	/*
     * Method to click on Benefits
     */
    public void clickOnBenefits() {
    	benefits.click();
    }
    

}
