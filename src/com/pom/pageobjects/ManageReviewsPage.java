package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageReviewsPage {
	WebDriver driver;
	By managereviews = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span");
	By managereviews1 = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a");
	By myreviews = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a");
	By employeereviews = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a");
	 public ManageReviewsPage (WebDriver driver) {
		   this.driver = driver;
		   
	   }
	 public void ClickOnManageReviews() {
		 driver.findElement(managereviews).click();
	 }

		
     public void ClickOnManageReviews1() {
		 driver.findElement(managereviews1).click();
	}
		 
	 
	 public void ClickOnMyReviews() {
		 driver.findElement(myreviews).click();
	 }
	 
	 public void ClickOnEmployeeReviews() {
		 driver.findElement(employeereviews).click();
	 }
}
