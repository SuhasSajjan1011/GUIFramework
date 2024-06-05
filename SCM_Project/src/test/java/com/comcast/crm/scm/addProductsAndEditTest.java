package com.comcast.crm.scm;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.objectrepositoryutility.addProductPage;


public class addProductsAndEditTest extends BaseClass{
	
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
	@Test
	public void updateProductList(){
		/*
		 * Navigate to Products HeaderPage and edit the product and update it 
		 */
		
		addProductPage ap1=new addProductPage(driver);
		ap1.getProductHeader().click();
		
		ap1.getProductcheckBox().click();
		
		ap1.getEditCheckBox().click();
		
		ap1.getProductPriceText().clear();
		
		ap1.getProductPriceText().sendKeys("1200");
		
		ap1.getRadioButton().click();
		
		
		ap1.getUpdateProductBtn().click();
		ap1.switchtoAlertAndAccept(driver);
		
	}
	@Test
	public void verifyUpdatedProductList() {
		/*
		 * Navigate to Products HeaderPage and verify the updated product whatever you updated
		 */
		
		addProductPage ap1=new addProductPage(driver);
		ap1.getProductHeader().click();
		
		String actualPrice = ap1.getHomeProductPriceBtn().getText();
		
		System.out.println(actualPrice);
		
		String expectedPrice="1100";
		
		if(actualPrice.contains(expectedPrice)) {
			System.out.println("price is updated");
			System.out.println(actualPrice);
			System.out.println(expectedPrice);
		}
		else {
			System.out.println("price is not updated");
		}
		
	}
	

}
