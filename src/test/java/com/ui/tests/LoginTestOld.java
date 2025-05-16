package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOld {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //Launch Browser Window | Browser Session is Created
		
		BrowserUtility browserutility = new BrowserUtility(wd);
		browserutility.goToWebsite("http://www.automationpractice.pl/index.php");
		browserutility.maximizeWindow(); //maximize the browser window
		
		By signInLinkLocator = By.xpath("//a[contains(text(),'Sign in')]");
		browserutility.clickOn(signInLinkLocator);
		
		By emailTextBoxLocator =By.id("email");
		browserutility.enterText(emailTextBoxLocator, "toridip462@minduls.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		browserutility.enterText(passwordTextBoxLocator, "Password");
		
		By submitLoginButtonLocator = By.id("SubmitLogin");
		browserutility.clickOn(submitLoginButtonLocator);
		
		
		

	}

}
