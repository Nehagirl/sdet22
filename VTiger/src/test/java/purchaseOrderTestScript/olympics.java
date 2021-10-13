package purchaseOrderTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class olympics {

	public static void main(String[] args) throws Throwable {
		WebdriverUtility wlib = new WebdriverUtility();
		FileUtility flib = new FileUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		String url2 = flib.getPropertyKeyValue("url2");
		driver.get(url2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		WebElement name = driver.findElement(By.xpath("//span[text()='Simone BILES']"));
		wlib.scrollToWebElement(driver, name);
		

	}

}
