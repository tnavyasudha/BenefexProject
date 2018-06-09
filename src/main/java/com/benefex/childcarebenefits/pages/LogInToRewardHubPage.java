package com.benefex.childcarebenefits.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInToRewardHubPage {
	
	@FindBy(how= How.XPATH, using =".//*[@id='username']")
    private WebElement userName=null;
    
    @FindBy(how= How.NAME, using ="password")
    private WebElement password=null;
	    
	@FindBy(how= How.XPATH, using =".//button[@type='submit']")
	private WebElement signIn=null;
	
	/*
     * Method to enter user name
     */
    public void enterUserName(String userNameText) {
    	userName.sendKeys(userNameText);
    }
    
    /*
     * Method to enter password
     */
    public void enterPassword(String passwordText) {
    	password.sendKeys(passwordText);
    }

    /*
     * Method to click on Sign In
     */
    public void clickOnSignIn() {
    	signIn.click();
    }
    
}
