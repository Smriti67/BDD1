package com.cg.project.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GitHubStepDefinition {
	
	private WebDriver driver;
	private LoginPage loginPage;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	}
	
	@Given("^User is on GitHub login page$")
	public void user_is_on_GitHub_login_page() throws Throwable {
		driver=new ChromeDriver();
	    driver.get("https://github.com/login");
	    
	    loginPage=PageFactory.initElements(driver, LoginPage.class);
	}

	@When("^User enter invalid username and password$")
	public void user_enter_invalid_username_and_password() throws Throwable {
	    loginPage.setUsername("smriti76");
	    loginPage.setPassword("smriti#90");
	    loginPage.clickSignIn();
	}

	@Then("^Access is denied$")
	public void access_is_denied() throws Throwable {
	    String expectedErrorMessage="Access is denied";
	    Assert.assertEquals(expectedErrorMessage,loginPage.getActualErrorMessage());
	}

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
	   loginPage.setUsername("smriti67");
	   loginPage.setPassword("bhindi#90");
	   loginPage.toString();
	}

	@Then("^Access granted$")
	public void access_granted() throws Throwable {
		String actualTitle=driver.getTitle();
		   String expectedTitle="smriti67";
		   Assert.assertEquals(expectedTitle, actualTitle);
		    driver.close();
	}
	
	

}
