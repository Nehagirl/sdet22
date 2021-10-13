package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorIcon {
	public VendorIcon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement venlink;
	
	@FindBy(name="search_text")
	private WebElement searcgEdt;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	public WebElement getVenlink() {
		return venlink;
	}

	public WebElement getSearcgEdt() {
		return searcgEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	

}
