package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOranization {
	public CreateOranization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="CreateOranization")
	private WebElement EnterOrgName;
	
	@FindBy(name="button")
	private WebElement SaveClick;

	public WebElement getEnterOrgName() {
		return EnterOrgName;
	}

	public WebElement getSaveClick() {
		return SaveClick;
	}
	
	public void nameOrg(String orgName)
	{
		EnterOrgName.sendKeys(orgName);
		SaveClick.click();
		
		
	}

}
