package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorCreate {
	public VendorCreate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="vendorname")
	private WebElement vennamed;
	
	@FindBy(name="button")
	private WebElement saveClick;

	public WebElement getVennamed() {
		return vennamed;
	}

	public WebElement getSaveClick() {
		return saveClick;
	}
	
	public void venCreated(String venash)
	{
		vennamed.sendKeys(venash);
		saveClick.click();
	}


}
