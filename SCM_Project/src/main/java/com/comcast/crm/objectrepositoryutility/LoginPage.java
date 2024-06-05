package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Madhuri
 * 
 *         Contains Login page elements & business lib like login()
 *
 */
public class LoginPage extends WebDriverUtility { // Rule-1 create a separte java class

	WebDriver driver;

	public LoginPage(WebDriver driver) { // Rule 3 : Object Initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login:username")
	private WebElement usernameEdit;

	@FindBy(id = "login:password")
	private WebElement passwordEdit;

	@FindBy(id = "login:type")
	private WebElement loginType;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginType() {
		return loginType;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * login to application based username , password , url argumnets
	 * 
	 * @param url
	 * @param username
	 * @param password
	 */
	public void loginToApp(String url ,String username, String password) {
		driver.get(url);
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		

		WebDriverUtility wlib = new WebDriverUtility();
		wlib.select(loginType, "Admin");
		loginBtn.click();
	}

}
