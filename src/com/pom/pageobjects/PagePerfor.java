package com.pom.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PagePerfor {
	  WebDriver driver;
	   By performance = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a");
	   
	   public PagePerfor (WebDriver driver) {
		   this.driver = driver;
		   
	   }
	   public void ClickOnPerformance() {
		   driver.findElement(performance).click();
	   }
}


