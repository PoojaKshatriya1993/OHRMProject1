package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrowPage {
	WebDriver driver;
	By arrow = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i");
	
	public ArrowPage (WebDriver driver) {
		this.driver = driver ;
	}
	public void ClickOnArrow() {
		driver.findElement(arrow).click();
		
	}
	

}
