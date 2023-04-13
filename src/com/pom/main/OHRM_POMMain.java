package com.pom.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.pageobjects.ArrowPage;
import com.pom.pageobjects.ConfigurePage;
import com.pom.pageobjects.EmployeeTrackersPage;
import com.pom.pageobjects.ForgotPassLinkPage;
import com.pom.pageobjects.LoginPage;
import com.pom.pageobjects.ManageReviewsPage;
import com.pom.pageobjects.MyTrackers;
import com.pom.pageobjects.PagePerfor;
import com.pom.pageobjects.ProfileIconPage;
import com.pom.pageobjects.ResetPage;
import com.pom.pageobjects.SearchPage;
import com.pom.pageobjects.TrackerPage;

public class OHRM_POMMain {

	

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			LoginPage login = new LoginPage(driver);
			login.enterUserName("Admin");

			Thread.sleep(2000);

			login.enterPassword("admin123");
			Thread.sleep(2000);
			login.ClickOnLogin();
			Thread.sleep(2000);

			PagePerfor perf = new PagePerfor(driver);
			perf.ClickOnPerformance();
			Thread.sleep(2000);

			ConfigurePage conf = new ConfigurePage(driver);
			conf.ClickOnConfigure();
			Thread.sleep(2000);
			conf.ClickONKPIs();
			Thread.sleep(2000);
			conf.ClickOnJobTitle();
			Thread.sleep(2000);
			conf.ClickOnDataEngineer();
			Thread.sleep(2000);
            ResetPage rsp = new ResetPage(driver);
			rsp.ClickOnReset();
			Thread.sleep(2000);
			rsp.ClickOnSearch();
			Thread.sleep(2000);
			rsp.ClickOnAdd();
			Thread.sleep(2000);
			rsp.ClickOnCancel();
			Thread.sleep(2000);
			conf.ClickOnConfigure();
			Thread.sleep(2000);
			TrackerPage trck = new TrackerPage(driver);
			trck.ClickOnTracker();
			Thread.sleep(2000);
			
			ManageReviewsPage mrp = new ManageReviewsPage(driver);
			mrp.ClickOnManageReviews(); 
			Thread.sleep(2000);
		    mrp.ClickOnManageReviews1(); 
			Thread.sleep(2000);
			mrp.ClickOnManageReviews(); 
			Thread.sleep(2000);
			mrp.ClickOnMyReviews(); 
			Thread.sleep(2000);
			mrp.ClickOnManageReviews(); 
			Thread.sleep(2000);
			mrp.ClickOnEmployeeReviews(); 
			Thread.sleep(2000);
			  
			 
			MyTrackers mt = new MyTrackers(driver);
			mt.ClickOnMyTrackers();
			Thread.sleep(2000);
			mt.ClickOnView(); 
			Thread.sleep(2000);
			mt.ClickOnMyTrackers(); 
			Thread.sleep(2000);
		

			
			EmployeeTrackersPage etp = new EmployeeTrackersPage(driver);
			etp.ClickOnEmployeeTrackers(); 
			Thread.sleep(2000); 
			etp.ClickOnInclude();
			Thread.sleep(2000); 
			etp.ClickOnPastEmployeesOnly(); 
			Thread.sleep(2000);
			 
			
			
			 SearchPage sp = new SearchPage(driver);
			 sp.ClickOnSearch();
			 Thread.sleep(2000);
			 sp.ClickOnSearch("srch");
			 
			
			ArrowPage ap = new ArrowPage(driver);
			ap.ClickOnArrow();
			Thread.sleep(2000);
			ap.ClickOnArrow();
			
			ProfileIconPage pip = new ProfileIconPage(driver);
			pip.ClickOnProfileIcon();
			Thread.sleep(2000);
			pip.ClickOnLogout();
			Thread.sleep(2000);
			
			ForgotPassLinkPage fplp = new ForgotPassLinkPage(driver);
			fplp.ClickOnForgotPassLink();
			Thread.sleep(2000);
			fplp.ClickOnCancelButton();
		


		} catch (Exception e) {

		}
	}

}