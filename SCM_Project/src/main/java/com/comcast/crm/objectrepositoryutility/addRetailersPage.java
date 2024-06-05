package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author kmadh
 * contains Retailers Page contains
 */
public class addRetailersPage extends WebDriverUtility{
	
	WebDriver driver ;
	public addRetailersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}

	@FindBy(xpath = "//a[text()= 'Add Retailers']")
	private WebElement addRetailersLink;
	
    @FindBy(id="retailer:username")
    private WebElement usernameText;
    
    @FindBy(id="retailer:password")
    private WebElement passwordText;
    
    @FindBy(id="retailer:areaCode")
    private WebElement areaCodeDropdown;
    
    @FindBy(id="retailer:phone")
    private WebElement phoneText;
    
    @FindBy(id="retailer:email")
    private WebElement emailText;
    
    @FindBy(id="retailer:address")
    private WebElement addressText;
    
    @FindBy(xpath = "//input[@value='Add Retailer']")
    private WebElement addRetailerBtn;
    
	public WebElement getAddRetailerssLink() {
		return addRetailersLink;
	}

	public WebElement getUsernameText() {
		return usernameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getAreaCodeDropdown() {
		return areaCodeDropdown;
	}

	public WebElement getPhoneText() {
		return phoneText;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getAddressText() {
		return addressText;
	}

	public WebElement getAddRetailerBtn() {
		return addRetailerBtn;
	}
	
	/*navigate to retailers on header page */
	
	@FindBy(xpath = "//a[text()='Retailers']")
	private WebElement retailersHeader; 
	
	@FindBy(xpath  = "//td[text()=' kumar ']/..//img[@alt='edit']")
	private WebElement editCheckImg;
	
	@FindBy(id="retailer:username")
	private WebElement usernameUpdateText;
	
	@FindBy(xpath = "//input[@value='Update Retailer']")
	private WebElement updateRetailerBtn;
	
	@FindBy(xpath = "//td[text()=' kumar ']")
	private WebElement addName;
	
	@FindBy(xpath = "//td[text()=' kumar ']/..//input[@type='checkbox']")
	private WebElement editCheckBox;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "//td[text()=' kumar ']")
	private WebElement actualName;
	
	
	
	public WebElement getActualName() {
		return actualName;
	}

	public WebElement getEditCheckBox() {
		return editCheckBox;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getAddName() {
		return addName;
	}

	public WebElement getEditCheckImg() {
		return editCheckImg;
	}
	

	public WebElement getRetailersHeader() {
		return retailersHeader;
	}

	public WebElement getUsernameUpdateText() {
		return usernameUpdateText;
	}

	public WebElement getUpdateRetailerBtn() {
		return updateRetailerBtn;
	}	
	
	
    
}
