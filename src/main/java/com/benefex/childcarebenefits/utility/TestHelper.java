package com.benefex.childcarebenefits.utility;

import org.hamcrest.Matcher;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestHelper {

	// we can get this value from properties file as well
	public static final String SITE_URL = "https://www.therewardhub.com/benefexdemo/";
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	public WebDriver init(String baseURL, String testMethodName) {
		// Create a new instance of the FF driver
		driver = getFirefoxDriver();
		return driver;
	}

	public void close() throws Exception {
		try {
			driver.close();
		} catch (UnsupportedCommandException e) {
		}
	}

	private FirefoxDriver getFirefoxDriver() {
		return new FirefoxDriver();
	}
	
	public void failIfVerificationErrors() {
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            Assert.fail(verificationErrorString);
        }
        
    }
	
	public <T> void verifyThat(String reason, T actual, Matcher<? super T> matcher) {
        try {
            assertThat(reason, actual, matcher);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }
	public <T> void verifyThat(T actual, Matcher<? super T> matcher) {
        verifyThat("", actual, matcher);
    }

}
