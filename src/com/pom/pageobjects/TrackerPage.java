package com.pom.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrackerPage {
	WebDriver driver;
	By tracker = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a");
	public TrackerPage (WebDriver driver) {
		   this.driver = driver;
}

	public void ClickOnTracker() {
		driver.findElement(tracker).click();
	}
}
