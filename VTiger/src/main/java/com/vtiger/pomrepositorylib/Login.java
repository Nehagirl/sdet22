package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Login(WebDriver driver)
	{
		//to locate all the element to the page username, password,submit
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement userNameEdt;
	
	@FindBy(name="user_password")
	private WebElement userPasswordEdt;

	@FindBy(id="submitButton")
	private WebElement LoginBtn;

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getUserPasswordEdt() {
		return userPasswordEdt;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public void LogintoApp(String username,String password)
	{
		//step1:login
		userNameEdt.sendKeys(username);
		userPasswordEdt.sendKeys(password);
		LoginBtn.click();
	}
	
	
}

