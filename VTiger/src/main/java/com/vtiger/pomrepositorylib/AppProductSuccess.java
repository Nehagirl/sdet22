package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppProductSuccess {
	public AppProductSuccess(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='lvtHeaderText']")
    private WebElement addprosuccessmsg;

	public WebElement getAddprosuccessmsg() {
		return addprosuccessmsg;
	}
}
