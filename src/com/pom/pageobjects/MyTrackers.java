package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyTrackers {
	WebDriver driver;
	By mytrackers = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]");
	By view = By.name("view");	
	public MyTrackers (WebDriver driver) {
		   this.driver = driver;  
	   }
	public void ClickOnMyTrackers() {
		driver.findElement(mytrackers).click();
	}
	
	
	 public void ClickOnView() {
     driver.findElement(view).click(); }
	 
}
