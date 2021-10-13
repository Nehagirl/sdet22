package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderInfoPage {
 public PurchaseOrderInfoPage(WebDriver driver)
 {
	PageFactory.initElements(driver, this); 
 }
 @FindBy(xpath="//span[@class='lvtHeaderText']")
 private WebElement successmsg;
 
 @FindBy(xpath="//input[@title='Delete [Alt+D]']")
 private WebElement deletionbtn;

public WebElement getSuccessmsg() {
	return successmsg;
}

public WebElement getDeletionbtn() {
	return deletionbtn;
}
 
 
 
}
