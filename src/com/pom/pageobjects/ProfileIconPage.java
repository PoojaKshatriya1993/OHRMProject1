package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileIconPage {
	WebDriver driver;
	By profileiconpage = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span");
	By logout = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	public ProfileIconPage (WebDriver driver) {
		this.driver = driver ;
	}
	
	public void ClickOnProfileIcon() {
		driver.findElement(profileiconpage).click();
	}
	
	public void ClickOnLogout() {
		driver.findElement(logout).click();
	}

}









