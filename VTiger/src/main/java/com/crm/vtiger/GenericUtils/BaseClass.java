package com.crm.vtiger.GenericUtils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.pomrepositorylib.Home;
import com.vtiger.pomrepositorylib.Login;

/*
* This class contains basic configuration annotation
* @author USER
*
*/

public class BaseClass {
	
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public WebdriverUtility wlib=new WebdriverUtility();
	public JavaUtility jlib=new JavaUtility();
	public WebDriver driver;
	public static WebDriver sDriver;
	@BeforeSuite(groups = {"smokeTest","Regressionsuite"})
	public void connectDB()
    {
		System.out.println("===Connecyion successful===");
	}
	@BeforeClass(groups = {"smokeTest","Regressionsuite"})
	public void launchBrowser() throws Throwable
	{
		//Read a data from property file
		String browser = flib.getPropertyKeyValue("browser");
		String url = flib.getPropertyKeyValue("url");
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				driver=new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("Chrome")) {
				driver=new ChromeDriver();}
				else  {
					driver=new ChromeDriver();
				}
		System.out.println("Invalid browser name");
		
		System.out.println("===Browser launch successful===");
		wlib.maximiseWindo(driver);
		wlib.waitUntilPageLoad(driver);
		driver.get(url);
		sDriver=driver;
		
		
		
//		String browser = flib.getPropertyKeyValue("browser");
//		String url = flib.getPropertyKeyValue("url");
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//			
//		}
//		else if(.equalsIgnoreCase("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
//		else
//		{
//			System.out.println("Invalid browser name");
//		}
//		System.out.println("===Browser launch successful===");
//		wlib.maximiseWindo(driver);
//		wlib.waitUntilPageLoad(driver);
//		driver.get(url);		
//		
	}
	@BeforeMethod(groups = {"smokeTest","Regressionsuite"})
	public void loginToApp() throws Throwable
	{
		//read a data from property file
		String username = flib.getPropertyKeyValue("username");
		String password = flib.getPropertyKeyValue("password");
		Login lg=new Login(driver);
		lg.LogintoApp(username, password);
		System.out.println("===Login sucessful===");
	}
	@AfterMethod(groups = {"smokeTest","Regressionsuite"})
	public void logoutOfApp()
	{
		Home h=new Home(driver);
		h.logout();
		System.out.println("===Logout Successful===");
	}
	@AfterClass(groups = {"smokeTest","Regressionsuite"})
	public void closeBrowser()
	{
		driver.close();
		System.out.println("====Browser closed successfil=====");
	}
	@AfterSuite(groups = {"smokeTest","Regressionsuite"})
	public void closeDB()
	{
		System.out.println("====DB connection closed====");
	}

}


