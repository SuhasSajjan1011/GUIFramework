package com.comcast.crm.scm;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.addProductPage;


public class addProductsAndDeleteProductTest extends BaseClass{
	
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
		ap.select(webSel1, productcatagory);
		
		ap.getRadioButton().click();
		
		ap.getAddProductButton().click();
		
		ap.switchtoAlertAndAccept(driver);
		
	}
	@Test
	public void deleteProductList(){
		/*
		 * Navigate to Products HeaderPage and Delete the product  
		 */
		
		addProductPage ap1=new addProductPage(driver);
		ap1.getProductHeader().click();
		
		ap1.getProductcheckBox().click();
		
		ap1.getDeleteBtn().click();
		
		ap1.switchtoAlertAndAccept(driver);
		
	}
	@Test
	public void verifyDeletedProductList() {
		/*
		 * Navigate to Products HeaderPage and verify the updated product whatever you updated
		 */
		
		addProductPage ap1=new addProductPage(driver);
		ap1.getProductHeader().click();
		
		String actualNane = ap1.getProductName().getText();
		
		String expectedPrice="";
		
		if(actualNane.contains(expectedPrice)) {
			
			System.out.println(actualNane);
			System.out.println(expectedPrice+"Product is deleted");
		}
		else {
			System.out.println("price is not updated");
		}
		
	}
	

}
