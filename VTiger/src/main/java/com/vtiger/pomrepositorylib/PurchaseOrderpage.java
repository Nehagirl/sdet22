package com.vtiger.pomrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class PurchaseOrderpage extends WebdriverUtility {
    WebDriver driver;
	public PurchaseOrderpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(name="subject")
	private WebElement subjEdt;
	
	@FindBy(name="vendor_name")
	private WebElement venEdt;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement venlink;
	
	@FindBy(name="bill_street")
	private WebElement bilEdt;
	
	@FindBy(name="ship_street")
	private WebElement shipEdt;
	
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement iconEdt;
	
	@FindBy(xpath="//img[@id='searchIcon2']")
	private WebElement icon2Click;
	
	@FindBy(id="qty1")
	private WebElement qty;

	@FindBy(id="qty2")
	private WebElement qty2;
	
	@FindBy(name="Button")
	private WebElement saveButtonClick;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement FinalSaveButton;
	
	@FindBy(name="Delete")
	private WebElement deletebtn;
	
	@FindBy(xpath="//input[@name='Button']")
	private WebElement addprobtn;
	
	@FindBy(xpath="//img[@id='searchIcon5']")
	private WebElement icon5;
	
	@FindBy(id="qty5")
	private WebElement qty5;
	
	@FindBy(xpath="//img[@src='themes/images/up_layout.gif']")
	private WebElement uparrow;
	
	
	
	public WebElement getSubjEdt() {
		return subjEdt;
	}

	public WebElement getVenEdt() {
		return venEdt;
	}
	
	public WebElement getVenlink1() {
		return venlink;
	}

	public WebElement getBilEdt() {
		return bilEdt;
	}

	public WebElement getShipEdt() {
		return shipEdt;
	}

	public WebElement getIconEdt() {
		return iconEdt;
	}
	
	public WebElement getQty() {
		return qty;
	}
	
	public WebElement getIcon2Click() {
		return icon2Click;
	}
	
	public WebElement getQty2() {
		return qty2;
	}
	
	public WebElement getSaveButtonClick() {
		return saveButtonClick;
		
	}
	
	public WebElement getFinalSaveButton() {
		return FinalSaveButton;
	}
	
	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getAddprobtn() {
		return addprobtn;
	}
	
	public WebElement getIcon5() {
		return icon5;
	}
	

	public WebElement getUparrow() {
		return uparrow;
	}

	public void PurcharseOrderPage(String subject, String billadd, String shipadd,String venname,String proName,String quantity) throws Throwable
	{
		subjEdt.sendKeys(subject);
		venlink.click();
		

		switchToWindow(driver,"Vendors&action");
		VendorIcon v = new VendorIcon(driver);
		v.getSearcgEdt().sendKeys(venname);
		v.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='"+venname+"']")).click();
		switchToWindow(driver,"PurchaseOrder@action");
		bilEdt.sendKeys(billadd);
		
		shipEdt.sendKeys(shipadd);
		scrollToWebElement(driver,iconEdt);
		iconEdt.click();
        switchToWindow(driver,"Production&action");
        Productplus pro = new Productplus(driver);
        pro.getSearcgEdt().sendKeys(proName);
        pro.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        //driver.findElement(By.xpath("//a[text()='"+proName+"'])")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        qty.sendKeys(quantity);
        saveButtonClick.click();
        icon2Click.click();
        switchToWindow(driver,"Production&action");
        Productplus pro1 = new Productplus(driver);
        pro1.getSearcgEdt().sendKeys(proName);
        pro1.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        Thread.sleep(2000);
        qty2.sendKeys(quantity);
        FinalSaveButton.click();
        driver.switchTo().alert().accept();
        
	}

	public void PurcharseOrderPageWithDelete(String subject, String billadd, String shipadd,String venname,String proName,String quantity) throws Throwable
	{
		subjEdt.sendKeys(subject);
		venlink.click();
		

		switchToWindow(driver,"Vendors&action");
		VendorIcon v = new VendorIcon(driver);
		v.getSearcgEdt().sendKeys(venname);
		v.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='"+venname+"']")).click();
		switchToWindow(driver,"PurchaseOrder@action");
		bilEdt.sendKeys(billadd);
		
		shipEdt.sendKeys(shipadd);
		scrollToWebElement(driver,iconEdt);
		iconEdt.click();
        switchToWindow(driver,"Production&action");
        Productplus pro = new Productplus(driver);
        pro.getSearcgEdt().sendKeys(proName);
        pro.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        //driver.findElement(By.xpath("//a[text()='"+proName+"'])")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        qty.sendKeys(quantity);
        saveButtonClick.click();
        icon2Click.click();
        switchToWindow(driver,"Production&action");
        Productplus pro1 = new Productplus(driver);
        pro1.getSearcgEdt().sendKeys(proName);
        pro1.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        Thread.sleep(2000);
        qty2.sendKeys(quantity);
        FinalSaveButton.click();
        driver.switchTo().alert().accept();
        deletebtn.click();
        
        


	}
	public void PurcharseOrderPageAddProduct(String subject, String billadd, String shipadd,String venname,String proName,String quantity) throws Throwable
	{
		subjEdt.sendKeys(subject);
		venlink.click();
		

		switchToWindow(driver,"Vendors&action");
		VendorIcon v = new VendorIcon(driver);
		v.getSearcgEdt().sendKeys(venname);
		v.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='"+venname+"']")).click();
		switchToWindow(driver,"PurchaseOrder@action");
		bilEdt.sendKeys(billadd);
		
		shipEdt.sendKeys(shipadd);
		scrollToWebElement(driver,iconEdt);
		iconEdt.click();
        switchToWindow(driver,"Production&action");
        Productplus pro = new Productplus(driver);
        pro.getSearcgEdt().sendKeys(proName);
        pro.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        //driver.findElement(By.xpath("//a[text()='"+proName+"'])")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        qty.sendKeys(quantity);
        addprobtn.click();
        icon5.click();
        switchToWindow(driver,"Production&action");
        Productplus pro1 = new Productplus(driver);
        pro1.getSearcgEdt().sendKeys(proName);
        pro1.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        Thread.sleep(2000);
        qty5.sendKeys(quantity);
        FinalSaveButton.click();
        
        driver.switchTo().alert().accept();
        
        
        
        
        
	}
	
	public void PurcharseOrderPageUpArrow(String subject, String billadd, String shipadd,String venname,String proName,String quantity) throws Throwable
	{
		subjEdt.sendKeys(subject);
		venlink.click();
		

		switchToWindow(driver,"Vendors&action");
		VendorIcon v = new VendorIcon(driver);
		v.getSearcgEdt().sendKeys(venname);
		v.getSearchBtn().click();
		driver.findElement(By.xpath("//a[text()='"+venname+"']")).click();
		switchToWindow(driver,"PurchaseOrder@action");
		bilEdt.sendKeys(billadd);
		
		shipEdt.sendKeys(shipadd);
		scrollToWebElement(driver,iconEdt);
		iconEdt.click();
        switchToWindow(driver,"Production&action");
        Productplus pro = new Productplus(driver);
        pro.getSearcgEdt().sendKeys(proName);
        pro.getSearchBtn().click();
        driver.findElement(By.linkText("laptop")).click();
        //driver.findElement(By.xpath("//a[text()='"+proName+"'])")).click();
        switchToWindow(driver,"PurchaseOrder&action");
        qty.sendKeys(quantity);
        addprobtn.click();
        uparrow.click();
       
        
        FinalSaveButton.click();
        driver.switchTo().alert().accept();
        
	}

	
	
        
        
        
        
	






}
		
	

	

