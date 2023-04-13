package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassLinkPage {
	WebDriver driver;
	By forgotpasslink = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");
	By cancel = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]");
	public ForgotPassLinkPage (WebDriver driver) {
		this.driver = driver ;
	}
    
	public void ClickOnForgotPassLink () {
		driver.findElement(forgotpasslink).click();
	}
	
	public void ClickOnCancelButton () {
		driver.findElement(cancel).click();
	}
}
    

	     
	     
	     
	     
	     
	     
	  