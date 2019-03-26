package com.cg.project.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleSearchStepDefinition {
	private WebDriver driver;
	
	@Given("^User is on Google Search$")
	public void user_is_on_Google_Search() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	}

	@When("^User search for 'Agile Methodology'$")
	public void user_search_for_Agile_Methodology() throws Throwable {
	   WebElement searchElement=driver.findElement(By.className("q"));
	   searchElement.sendKeys("Agile Methodology");
	   searchElement.submit();
	}

	@Then("^All links should display with 'Agile Methodology'$")
	public void all_links_should_display_with_Agile_Methodology() throws Throwable {
	    String actualTitle=driver.getTitle();
	    String expectedTitle="Agile Methodology - Google Search";
	    Assert.assertEquals(expectedTitle, actualTitle);
	    driver.close();
	}



}
