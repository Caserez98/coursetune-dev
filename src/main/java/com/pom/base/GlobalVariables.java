package com.pom.base;

public class GlobalVariables {
	public static final String PATH_JSON_DATA = "./src/main/resources/testdata/json/";
	public static final String PATH_SCREENSHOTS = System.getProperty("user.dir")+"/test-output/screenshots/";
	public static final String USERNAME_XPATH = "//input[contains(@type,\"text\")]";
	public static final String PASSWORD_XPATH = "//input[contains(@type,\"password\")]";
	public static final	String LOGIN_URL = "https://qa.coursetune.com/";
	public static final String HOME_PAGE_URL ="https://qa.coursetune.com/#page=cj1ncmFwaCZwPTViYTgzMzg5LTZkOWQtNGYxYy1hYjbEmzgxZmIxYWFjOGJjMg%3D%3D";
	public static final String DIVISION_XPATH_START="//button[contains(span//text(),\"";
	public static final String DIVISION_XPATH_END="\")]";
	
	public static final String userNameString = "alfredo+automation@coursetune.com";
	public static final String passwordString = "Automation4!";

	public static final String LOGIN_BUTTON_XPATH ="//button[contains(span//text(),'LOG IN')]";

	public static final String LOGIN_FORM_XPATH = "//*[@id=\"appcontent\"]/div[1]//span[2]/span[2]/span/span/span/span"; 
	
	public static final String EDIT_BUTTON_XPATH ="//*[@id=\"appcontent\"]//span[3]/span/span/span[1]/span/button";
	public static final String HOME_PAGE_VIEW_XPATH = "//*[@id=\"appcontent\"]/div[1]/span/span[1]/span/span/span/span/span[1]/span[2]/span/span/span/span[1]/span[1]/span/span[1]/span/span/span/span[1]//span[4]/span/span/span/span/span/span/span[2]/span/span/span/span";

	public static final String ADD_NEW_DIVISION_BUTTON_XPATH ="//*[@id=\"appcontent\"]//span[3]/span/span[1]/span/span/span/span/span/span[1]//span[2]/button";
	public static final String ADD_DIVISION_FORM_XPATH = "//*[@id=\"appcontent\"]//span[1]/span[2]/span/span/span/span[2]/span/span/span[2]/span/span/span/span/span/span/span/span";
	
	public static final String DIVISION_NAME_XPATH = "//*[@id=\"appcontent\"]//span[2]/span/span[1]/span/span/span[1]/span/span/span/span[2]//input";
	
	public static final String FIRST_ICON_XPATH="//*[@id=\"appcontent\"]//span[3]//span[3]//span[2]//span[1]/span/span/span/span/span[1]/button";
	
	public static final String SECOND_ICON_XPATH="//*[@id=\"appcontent\"]//span[3]//span[3]//span[2]//span[1]/span/span/span/span/span[4]/button";
	
	public static final String THIRD_ICON_XPATH="//*[@id=\"appcontent\"]//span[3]//span[3]//span[2]//span[1]/span/span/span/span/span[10]/button";
	
	public static final String ADD_DIVISION_BUTTON_XPATH="//*[@id=\"appcontent\"]/div[1]/span/span[1]/span/span/span/span/span[1]/span[2]/span/span/span/span[2]/span/span/span[2]/span/span/span/span/span/span/span/span/span/span/span/span/span[2]/span/span/span/span/span[8]/span/span/span/span[2]/span/span/span/button";
	
	public static final String newDivisionXPath ="//*[@id=\"appcontent\"]/div[1]/span/span[1]/span/span/span/span/span[1]/span[2]/span/span/span/span[1]/span[1]/span/span[1]/span/span/span/span[1]/span/span/span/span[4]/span/span/span/span/span/span/span[2]/span/span/span/span/span[1]/span[1]/span/span/span/span[2]/span/span/span/span/span[26]/span/span/button";
	
	public static final String viewDivisionXPath="//*[@id=\"appcontent\"]/div[1]/span/span[1]/span/span/span/span/span[1]/span[2]/span/span/span/span[1]/span[1]/span/span[1]/span/span/span/span[1]/span/span/span/span[4]/span/span/span/span/span/span/span[2]/span/span/span/span/span[1]/span[1]/span/span/span/span[2]/span/span/span/span/span[26]/span/span/button/span/span/span[2]/span/span/span/span[2]/span/span/span/span[1]/button";
	
	public static final String USER_ACCOUNT_XPATH="//*[@id=\"appcontent\"]/div[1]//span[2]/span[3]//span[13]//button";

	public static final String SIGN_OUT_XPATH="//*[@id=\"appcontent\"]//span[2]/span/span[2]//span[2]//span[2]//span[1]/span[1]//span[15]//button";
}
