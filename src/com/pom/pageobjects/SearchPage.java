package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	 WebDriver driver;
     By search = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input");
     


     public SearchPage (WebDriver driver) {
  	   this.driver = driver;
     }
     
    public void ClickOnSearch (){
  	 driver.findElement(search).click();
  
   }
    public void ClickOnSearch (String srch) {
    	driver.findElement(search).sendKeys(srch);
    }
	
	}

    



