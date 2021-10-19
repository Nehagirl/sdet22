package purchaseOrderTestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.crm.vtiger.GenericUtils.BaseClass;
import com.vtiger.pomrepositorylib.Home;
import com.vtiger.pomrepositorylib.Productplus;
import com.vtiger.pomrepositorylib.Products;
import com.vtiger.pomrepositorylib.PurchaseOrderpage;
import com.vtiger.pomrepositorylib.Purchaseplus;
import com.vtiger.pomrepositorylib.VendorCreate;
import com.vtiger.pomrepositorylib.VendorName;

//to take screenshot write this line
@Listeners(com.crm.vtiger.GenericUtils.ListnerImpl.class)
public class T1_CreatePurchaseorderwithItemandAddProduct extends BaseClass {
	@Test(groups={"smokeTest"})
	
	public void CreatePurchaseorderwithItemandAddProduct() throws Throwable 
	{
		String proName = elib.getExcelData("Sheet1", 1, 4);
		String venName = elib.getExcelData("Sheet1", 1, 3);
		String sub = elib.getExcelData("Sheet1", 1, 1);
		String bill = elib.getExcelData("Sheet1", 1, 2);
		String ship = elib.getExcelData("Sheet1", 1, 2);
		String quantity = elib.getExcelData("Sheet1", 1, 5);
		
		Home h = new Home(driver);
		h.getProductlink().click();

		Productplus plink = new Productplus(driver);
		plink.getCreateProPlusLink().click();

		Products ps = new Products(driver);
		ps.ProCreate(proName);

		//.....create vendor
		h.getMoreLink().click();
		h.getVendorlist().click();
		VendorName v = new VendorName(driver);
		v.getAddVendor().click();

		VendorCreate vcreate = new VendorCreate(driver);
		vcreate.venCreated(venName);

		//create purchase order
		h.getMoreLink().click();
		h.getPurchaseorderlist().click();
		Purchaseplus po = new Purchaseplus(driver);
		po.getPurchasePluslink().click();

		PurchaseOrderpage pocreate1 = new PurchaseOrderpage(driver);
		pocreate1.PurcharseOrderPage(sub, bill, ship ,venName,proName,quantity);

	}
}




