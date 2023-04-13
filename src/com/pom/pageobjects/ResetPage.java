package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPage {
	  WebDriver driver;
	  By reset = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
	  By search = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	  By add = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	  By cancel = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[1]");
	  public ResetPage (WebDriver driver) {
		   this.driver = driver;

        }
	  public void ClickOnReset() {
		   driver.findElement(reset).click();
	   }
	  
	  public void ClickOnSearch() {
		  driver.findElement(search).click();
	  }
	  
	  public void ClickOnAdd() {
		  driver.findElement(add).click();
	  }
	  
	  public void ClickOnCancel() {
		  driver.findElement(cancel).click();
	  }
}