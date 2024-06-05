package com.comcast.crm.objectrepositoryutility;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
/**
 * 
 * @author kmadh
 * 
 * contains products Page element 
 *
 */

public class addProductPage extends WebDriverUtility{
	
	WebDriver driver;
	public addProductPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver , this);	
	}

	@FindBy(xpath = "//a[text()= 'Add Products']")
	private WebElement addProductsLink;
		
	@FindBy(xpath="//input[@id='product:name']")
	private WebElement productNameText;
	
	@FindBy(id="product:price")
	private WebElement productPriceText;
	
	@FindBy(id="product:unit")
	private WebElement productUnitDropDown;
	
	@FindBy(id="product:category")
	private WebElement productCategoryDropDown;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//input[@value='Add Product']")
	private WebElement addProductButton;
	
	public WebElement getAddProductsLink() {
		return addProductsLink;
	}

	public WebElement getProductNameText() {
		return productNameText;
	}

	public WebElement getProductPriceText() {
		return productPriceText;
	}

	public WebElement getProductUnitDropDown() {
		return productUnitDropDown;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getAddProductButton() {
		return addProductButton;
	}
	
    /*PRoduct header page  */
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productHeader;
	
	@FindBy(xpath = "//td[text()=' Samsung ']/..//input[@type='checkbox']")
	//@FindBy(xpath = "//td[text()=' ajay ']/..//input[@type='checkbox']")
	private WebElement productcheckBox;
	
	@FindBy(xpath = "//td[text()=' Samsung ']/..//img[@alt='edit']")
	private WebElement editCheckBox;
	
	//@FindBy(xpath = "//input[@type=\"checkbox\" and @value=\"110\"]/../../td[4]")
	@FindBy(xpath = "//td[text()=' Samsung ']/..//input[@type='checkbox']/../..//td[text()=' 15000.000 ']")
	private WebElement homeProductPriceBtn;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement updateProductBtn;
	
	@FindBy(xpath = "//td[text()=' Samsung ']/..")
	private WebElement productName;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;
	
	public WebElement getProductHeader() {
		return productHeader;
	}
	public WebElement getProductcheckBox() {
		return productcheckBox;
	}
	public WebElement getEditCheckBox() {
		return editCheckBox;
	}
	
	public WebElement getHomeProductPriceBtn() {
		return homeProductPriceBtn;
	}
	
	public WebElement getUpdateProductBtn() {
		return updateProductBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getProductName() {
		return productName;
	}

}
