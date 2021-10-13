package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class Home {
	WebDriver driver; //global driver variable 
	public Home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Products")
	private WebElement Productlink;
	
	@FindBy(linkText="More")
	private WebElement MoreLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement SignoutLink;
	
	@FindBy(linkText="Purchase Order")
	private WebElement purchaseorderlist;
	
	@FindBy(linkText="Vendors")
	private WebElement vendorlist;

	public WebElement getProductlink() {
		return Productlink;
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignoutLink() {
		return SignoutLink;
	}

	public WebElement getPurchaseorderlist() {
		return purchaseorderlist;
	}

	public WebElement getVendorlist() {
		return vendorlist;
	}
	
	public void logout()
	{
		Actions action = new Actions(driver);
		action.moveToElement(administratorImg).perform();
		SignoutLink.click();
		
	}
	public void more()
	{
		WebdriverUtility wedutil = new WebdriverUtility();
		wedutil.mouseOver(driver, MoreLink);
	}
}


	
