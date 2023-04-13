package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ConfigurePage {

	
	WebDriver driver;
	By configure = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]");
	By kpis = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]");
	By jobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]");
	By dataengineer = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[5]");
	
	public ConfigurePage (WebDriver driver) {
		   this.driver = driver;
		   
	   }
	
	public void ClickOnConfigure() {
		   driver.findElement(configure).click();
	   }
	public void ClickONKPIs() {
	       driver.findElement(kpis).click();
	}
	
	public void ClickOnJobTitle() {
		driver.findElement(jobTitle).click();
	}
	
	public void ClickOnDataEngineer() {
		driver.findElement(dataengineer).click();
	}
}

