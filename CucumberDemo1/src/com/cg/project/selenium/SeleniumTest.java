package com.cg.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.in");
		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys("Login to GitHub");
		searchElement.submit();
		
		WebElement imageLink=driver.findElement(By.className("hdtb-mitem"));
		imageLink.click();
	}

}
