package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImpl implements ITestListener {
	public void onTestFailure(ITestResult result) {
		String testName=result.getMethod().getMethodName();
		System.out.println("==========listening=======");
		EventFiringWebDriver takescreenshot=new EventFiringWebDriver(BaseClass.sDriver);
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshot/"+testName+".png");
		try {
			FileUtils.copyFile(source,dest);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
