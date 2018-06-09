package com.benefex.childcarebenefits.utility;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.benefex.childcarebenefits.pages.AllPages;

public class WebDriverTestBase {

	protected WebDriver driver;
	protected TestHelper helper;
	protected AllPages pages;
	private String baseURL = getSiteURL();
	protected String testMethodName;

	@BeforeMethod(alwaysRun = true)
	public void BeforeMethod(Method testMethod) {
		testMethodName = testMethod.getName();
		helper = new TestHelper();
		driver = helper.init(baseURL, testMethodName);
		pages = new AllPages(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult result) throws Exception {
		System.out.println("END OF TEST CASE IN - " + this.getClass().getSimpleName());
		helper.close();
	}
	
	/*
     * Method to log into therewardhub website
     */
    protected void logIntoTheRewardHub(String username, String password) {
    	helper.navigateToWebSite(driver);
    	pages.logInToRewardHubPage().enterUserName(username);
    	pages.logInToRewardHubPage().enterPassword(password);
    	pages.logInToRewardHubPage().clickOnSignIn();
    	
    }
	
	

	public String getSiteURL() {
		return TestHelper.SITE_URL;
	}

}
