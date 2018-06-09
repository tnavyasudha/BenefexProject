package com.benefex.childcarebenefits.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains all the page object classes that are accessible by the
 * tests.
 * 
 * @author Navya Sudha Tippanaboyana
 */

public class AllPages {
	WebDriver driver;
	LogInToRewardHubPage logInToRewardHubPage;
	ChildcareVouchersPage childcareVouchersPage;
	BenefitsPage benefitsPage;
	BenefexDemoHomePage benefexDemoHomePage;

	public AllPages(WebDriver driver) {
		this.driver = driver;
	}

	public LogInToRewardHubPage logInToRewardHubPage() {
		if (logInToRewardHubPage == null)
			logInToRewardHubPage = init(LogInToRewardHubPage.class);
		return logInToRewardHubPage;
	}
	
	public ChildcareVouchersPage childcareVouchersPage() {
		if (childcareVouchersPage == null)
			childcareVouchersPage = init(ChildcareVouchersPage.class);
		return childcareVouchersPage;
	}
	
	public BenefitsPage benefitsPage() {
		if (benefitsPage == null)
			benefitsPage = init(BenefitsPage.class);
		return benefitsPage;
	}
	
	public BenefexDemoHomePage benefexDemoHomePage() {
		if (benefexDemoHomePage == null)
			benefexDemoHomePage = init(BenefexDemoHomePage.class);
		return benefexDemoHomePage;
	}

	private <T> T init(Class<T> pageClassToProxy) {
		return PageFactory.initElements(driver, pageClassToProxy);
	}

}
