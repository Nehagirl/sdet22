package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organiaztion {
	public Organiaztion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	public WebElement CreateOrgClick;
	
	
	public WebElement getCreateOrgClick() {
		return CreateOrgClick;
	}
	
		

}
