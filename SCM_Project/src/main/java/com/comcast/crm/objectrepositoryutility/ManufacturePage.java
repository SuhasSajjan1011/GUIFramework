package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class ManufacturePage extends WebDriverUtility {

	WebDriver driver;

	public ManufacturePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()= 'Add Manufacturer']")
	private WebElement addManufacturerLink;

	@FindBy(id = "manufacturer:name")
	private WebElement nameText;

	@FindBy(id = "manufacturer:email")
	private WebElement emailText;

	@FindBy(id = "manufacturer:phone")
	private WebElement phoneText;

	@FindBy(id = "manufacturer:username")
	private WebElement usernameText;

	@FindBy(id = "manufacturer:password")
	private WebElement passwordText;

	@FindBy(xpath = "//input[@value='Add Manufacturer']")
	private WebElement addManufactureBtn;

	public WebElement getAddManufacturerLink() {
		return addManufacturerLink;
	}

	public WebElement getNameText() {
		return nameText;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getPhoneText() {
		return phoneText;
	}

	public WebElement getUsernameText() {
		return usernameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getAddManufactureBtn() {
		return addManufactureBtn;
	}

}
