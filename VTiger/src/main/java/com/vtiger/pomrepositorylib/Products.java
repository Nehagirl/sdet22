package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {
	public Products(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="productname")
	private WebElement ProName;
	
	@FindBy(name="button")
	private WebElement saveButtonClick;
	

	public WebElement getProName() {
		return ProName;
	}

	public WebElement getButtonClick() {
		return saveButtonClick;
	}

	
	
   public void ProCreate(String prolap)
   {
	   ProName.sendKeys(prolap);
	   saveButtonClick.click();
   }

	   
   }
   
   
	
	
	
	


