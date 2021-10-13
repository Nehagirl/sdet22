package TestScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.vtiger.pomrepositorylib.AppProductSuccess;
import com.vtiger.pomrepositorylib.Home;
import com.vtiger.pomrepositorylib.Login;
import com.vtiger.pomrepositorylib.Productplus;
import com.vtiger.pomrepositorylib.Products;
import com.vtiger.pomrepositorylib.PurchaseOrderpage;
import com.vtiger.pomrepositorylib.Purchaseplus;
import com.vtiger.pomrepositorylib.VendorCreate;
import com.vtiger.pomrepositorylib.VendorName;

public class T_06CreatePurchaseorderwithItemandAddProduct {
	

@Test

public void CreatePurchaseorderwithItemandAddProduct() throws Throwable {
JavaUtility jutil = new JavaUtility();
ExcelUtility exutil = new ExcelUtility();
FileUtility futil = new FileUtility();
WebdriverUtility wedutil = new WebdriverUtility();
//global initialize webdriver
WebDriver driver=null;


//read common data
String BROWSER=futil.getPropertyKeyValue("browser");
String USERNAME=futil.getPropertyKeyValue("username");
String PWD=futil.getPropertyKeyValue("password");
String URL=futil.getPropertyKeyValue("url");

//1.................load the browser
if(BROWSER.equals("firefox")) {
driver=new FirefoxDriver();
} else if (BROWSER.equals("ie")) {
	driver=new InternetExplorerDriver();
} else if (BROWSER.equals("chrome")) {
	driver=new ChromeDriver();}
	else {
		driver=new ChromeDriver();
	}

//2............load the app
driver.get(URL);
driver.manage().window().maximize();
Login lo = new Login(driver);
lo.LogintoApp(USERNAME,PWD);


///....create product
Home h = new Home(driver);
h.getProductlink().click();

Productplus plink = new Productplus(driver);
plink.getCreateProPlusLink().click();

Products ps = new Products(driver);
String proName = exutil.getExcelData("Sheet1", 1, 4);
ps.ProCreate(proName);

//.....create vendor
h.getMoreLink().click();
h.getVendorlist().click();
VendorName v = new VendorName(driver);
v.getAddVendor().click();

VendorCreate vcreate = new VendorCreate(driver);
String venName = exutil.getExcelData("Sheet1", 1, 3);
vcreate.venCreated(venName);

//create purchase order
h.getMoreLink().click();
h.getPurchaseorderlist().click();
Purchaseplus po = new Purchaseplus(driver);
po.getPurchasePluslink().click();

PurchaseOrderpage pocreate1 = new PurchaseOrderpage(driver);
String sub = exutil.getExcelData("Sheet1", 1, 1);
String bill = exutil.getExcelData("Sheet1", 1, 2);
String ship = exutil.getExcelData("Sheet1", 1, 2);
String quantity = exutil.getExcelData("Sheet1", 1, 5);
pocreate1.PurcharseOrderPage(sub, bill, ship ,venName,proName,quantity);

//4.........verify
AppProductSuccess apppro = new AppProductSuccess(driver);
wedutil.waitForElementVisibility(driver, apppro.getAddprosuccessmsg());
String success = apppro.getAddprosuccessmsg().getText();
if(success.contains(proName)) {
	System.out.println("add product successfull");
}else
{
	System.out.println("add pro not successful");
}
	//5.....logout
     h.logout();
     
     //close the browser
     driver.close();
}
}

