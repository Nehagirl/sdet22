package ToolTipPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class ToolQa {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		WebdriverUtility wlib = new WebdriverUtility();
		FileUtility flib = new FileUtility();
		wlib.waitUntilPageLoad(driver);
		driver.manage().window().maximize();
		 String URL = flib.getPropertyKeyValue("url1");
		 driver.get(URL);
		 WebElement move = driver.findElement(By.xpath("//button[text()='Hover me to see']"));
		 wlib.mouseOver(driver, move);
		  String tool = driver.findElement(By.xpath("//div[text()='You hovered over the Button']")).getText();
		  driver.findElement(By.xpath("//input[@id='toolTipTextField']")).sendKeys(tool);
		  Thread.sleep(3000);
		  driver.close();
	
	}

}
