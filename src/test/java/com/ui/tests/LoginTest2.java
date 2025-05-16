package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.utility.BrowserUtility;

public class LoginTest2 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); //Launch Browser Window | Browser Session is Created
		HomePage homePage = new HomePage(wd);
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("toridip462@minduls.com", "Password");
		
		
		
		
		

	}

}
