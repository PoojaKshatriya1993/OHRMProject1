package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeTrackersPage {
	WebDriver driver;
	By employeetrackers = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/a");
	By include = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
	By pastemployeesonly = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");

	public EmployeeTrackersPage (WebDriver driver) {
		   this.driver = driver;
     }
     
     public void ClickOnEmployeeTrackers() {
    	 driver.findElement(employeetrackers).click();
     }
     
     public void ClickOnInclude() {
    	 driver.findElement(include).click();
     }
     
     public void ClickOnPastEmployeesOnly() {
    	 driver.findElement(pastemployeesonly).click();
     }
}


