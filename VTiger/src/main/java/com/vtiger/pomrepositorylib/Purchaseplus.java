package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Purchaseplus {
	public Purchaseplus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement purchasePluslink;

	@FindBy(name="search_text")
	private WebElement searcgEdt;
	
	@FindBy(name="search")
	private WebElement searchBtn;

	public WebElement getPurchasePluslink() {
		return purchasePluslink;
	}

	public WebElement getSearcgEdt() {
		return searcgEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
	

}
