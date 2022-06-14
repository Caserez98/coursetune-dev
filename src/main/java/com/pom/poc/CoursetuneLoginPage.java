package com.pom.poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pom.base.Base;
import com.pom.base.GlobalVariables;

public class CoursetuneLoginPage extends Base{
	private String divisionXPATH;
    private WebElement element;
	public CoursetuneLoginPage(WebDriver driver, Actions action) {
		super(driver,action);
	}
	
	//Objects
	
	By txtUserName= By.xpath(GlobalVariables.USERNAME_XPATH);
	By txtUserPassword= By.xpath(GlobalVariables.PASSWORD_XPATH);
	By btnLogin = By.xpath(GlobalVariables.LOGIN_BUTTON_XPATH);
	By frmLogin = By.xpath(GlobalVariables.LOGIN_FORM_XPATH);
	//Method to login user;
	
	public void login(String username, String password){
		waitForElementPresent(frmLogin);
		type(txtUserName,username);
		type(txtUserPassword,password);
		click(btnLogin);
	}


	By frmHomePage= By.xpath(GlobalVariables.HOME_PAGE_VIEW_XPATH);
	By btnEditView= By.xpath(GlobalVariables.EDIT_BUTTON_XPATH);
	By btnAddNewDivision = By.xpath(GlobalVariables.ADD_NEW_DIVISION_BUTTON_XPATH);
	By frmNewDivision = By.xpath(GlobalVariables.ADD_DIVISION_FORM_XPATH);
    By txtDivisionName = By.xpath(GlobalVariables.DIVISION_NAME_XPATH);
    By btnFirstIcon = By.xpath(GlobalVariables.FIRST_ICON_XPATH);
    By btnSecondIcon = By.xpath(GlobalVariables.SECOND_ICON_XPATH);
    By btnThirdIcon = By.xpath(GlobalVariables.THIRD_ICON_XPATH);
    By btnAddDivision = By.xpath(GlobalVariables.ADD_DIVISION_BUTTON_XPATH);
    By btnDivisionCreated;

    public void enableEditButton(){
        waitForElementPresent(frmHomePage);
        click(btnEditView);
        waitForElementPresent(btnAddNewDivision);
    }

    public void createNewDivision(String name){
        setDivisionXPath(name);
        click(btnAddNewDivision);
        waitForElementPresent(frmNewDivision);
        type(txtDivisionName, name);
        click(btnFirstIcon);
        click(btnSecondIcon);
        click(btnThirdIcon);
        click(btnAddDivision);
        assignDivisionXPath();
		scrollIntoView(btnDivisionCreated);
        waitForElementPresent(btnDivisionCreated);
        
    }

    public void clickNewDivision(){
        click(btnDivisionCreated);
    }

    public void setDivisionXPath(String name){
        this.divisionXPATH=GlobalVariables.DIVISION_XPATH_START+name+GlobalVariables.DIVISION_XPATH_END;
        System.out.println(this.divisionXPATH);
    }

    public String getDivisionXPath(){
        return this.divisionXPATH;
    }

    public void assignDivisionXPath()
    {
        btnDivisionCreated=By.xpath(this.getDivisionXPath());
    }
}
