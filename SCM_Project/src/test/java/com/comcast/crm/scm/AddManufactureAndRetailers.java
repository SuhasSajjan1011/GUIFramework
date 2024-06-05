package com.comcast.crm.scm;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.ManufacturePage;
import com.comcast.crm.objectrepositoryutility.addRetailersPage;

public class AddManufactureAndRetailers extends BaseClass{
	
	
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

}
