package com.comcast.crm.scm;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.ManufacturePage;
import com.comcast.crm.objectrepositoryutility.addProductPage;
import com.comcast.crm.objectrepositoryutility.addRetailersPage;

public class AddManufactureAndRetailersAndProducts extends BaseClass{
	

	@Test
	public void addManufactureTest() throws Throwable {
		
		/*
		 *  Step-1 Navigate to addRetailer module
		 */
		
        ExcelUtility eLib=new ExcelUtility();
		
		String Name=eLib.getDataFromExcel("Sheet1", 14, 0);
		String email=eLib.getDataFromExcel("Sheet1", 14, 4);
		String phone=eLib.getDataFromExcel("Sheet1", 14, 3);
		String Username=eLib.getDataFromExcel("Sheet1", 14, 6);
		String password=eLib.getDataFromExcel("Sheet1", 14, 1);
		
		ManufacturePage mp=new ManufacturePage(driver);
		mp.getAddManufacturerLink().click();
		mp.getNameText().sendKeys(Name);
		mp.getEmailText().sendKeys(email);
		mp.getPhoneText().sendKeys(phone);
		mp.getUsernameText().sendKeys(Username);
		mp.getPasswordText().sendKeys(password);
		mp.getAddManufactureBtn().click();
		
	
		
	}
	@Test
	public void addRetailerTest() throws Throwable {
		
		/*
		 *  Step-1 Navigate to addRetailer module
		 */
		
        ExcelUtility eLib=new ExcelUtility();
		
		String userName=eLib.getDataFromExcel("Sheet1", 14, 0);
		String password=eLib.getDataFromExcel("Sheet1", 14, 1);
		String areaCode=eLib.getDataFromExcel("Sheet1", 14, 2);
		String phone=eLib.getDataFromExcel("Sheet1", 14, 3);
		String email=eLib.getDataFromExcel("Sheet1", 14, 4);
		String address=eLib.getDataFromExcel("Sheet1", 14, 5);
		String newUsername=eLib.getDataFromExcel("Sheet1", 14, 6);
		
		addRetailersPage ap=new addRetailersPage(driver);
		ap.getAddRetailerssLink().click();
		
		ap.getUsernameText().sendKeys(userName);
		
		ap.getPasswordText().sendKeys(password);
		
		WebElement webEle = ap.getAreaCodeDropdown();
		ap.select(webEle, areaCode);
		
		ap.getPhoneText().sendKeys(phone);
		ap.getEmailText().sendKeys(email);
		ap.getAddressText().sendKeys(address);
		ap.getAddRetailerBtn().click();
		
		ap.switchtoAlertAndAccept(driver);
		
	}
	@Test
	public void addProductsTest() throws Throwable {
		
		/*
		 *  Step-1 Navigate to AddProduct module
		 */
		
        ExcelUtility eLib=new ExcelUtility();
		
		String productNmae=eLib.getDataFromExcel("Sheet1", 7, 0);
		String price=eLib.getDataFromExcel("Sheet1", 7, 1);
		String unitType=eLib.getDataFromExcel("Sheet1", 7, 2);
		String productcatagory=eLib.getDataFromExcel("Sheet1", 7, 3);
		
		addProductPage ap=new addProductPage(driver);
		ap.getAddProductsLink().click();
		
		WebElement pdName = ap.getProductNameText();
		pdName.click();
		pdName.sendKeys(productNmae);
		ap.getProductPriceText().sendKeys(price);
		
		WebElement webEle=ap.getProductUnitDropDown();
		ap.select(webEle, unitType);
		
		WebElement webSel1 = ap.getProductCategoryDropDown();
		ap.select(webSel1,productcatagory );
		
		ap.getRadioButton().click();
		
		ap.getAddProductButton().click();
		
		ap.switchtoAlertAndAccept(driver);
		
	}

}
