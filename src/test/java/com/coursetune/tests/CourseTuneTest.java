package com.coursetune.tests;

import org.testng.annotations.Test;

import com.pom.base.Base;
import com.pom.base.GlobalVariables;

import com.pom.poc.CoursetuneLoginPage;

import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CourseTuneTest {
	WebDriver driver;
	Base base;
	Actions action;
	CoursetuneLoginPage coursetuneLoginPage;
	String username,password,exptedtedURL,divisionName;
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  	base = new Base(driver,action);
		driver = base.setupChromeDriver();
		action = base.setupActions();
		coursetuneLoginPage = new CoursetuneLoginPage(driver,action);
		
		this.username = base.getJSONValue("Data", "username");
		this.password = base.getJSONValue("Data", "password");
		this.exptedtedURL = base.getJSONValue("Data", "expectedURL");
		this.divisionName = base.getJSONValue("Data", "division");
		
		
  }
  @Test
  public void TestLogin() {
	  base.launchBrowser(GlobalVariables.LOGIN_URL);
	  coursetuneLoginPage.login(username, password);
	  coursetuneLoginPage.enableEditButton();
	  coursetuneLoginPage.createNewDivision(divisionName);
	  coursetuneLoginPage.clickNewDivision();
	  Assert.assertEquals(GlobalVariables.HOME_PAGE_URL, coursetuneLoginPage.getCurrentURL());
  }



  @AfterTest
  public void afterTest() {
		//driver.close();

  }

}
