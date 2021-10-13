package com.vtiger.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productplus {
	public Productplus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement createProPlusLink;


public WebElement getCreateProPlusLink() {
	return createProPlusLink;
}


@FindBy(name="search_text")
private WebElement searcgEdt;

@FindBy(name="search")
private WebElement searchBtn;


public WebElement getSearcgEdt() {
	return searcgEdt;
}

public WebElement getSearchBtn() {
	return searchBtn;
}
}


