package com.msg.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.msg.utilities.BrowserUtils;
import com.msg.utilities.Driver;

public class HomePage extends BasePage {

	@FindBy(xpath = "//*[@id='menuUser']")
	public WebElement userLogo;

	@FindBy(xpath = "//body/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[1]/div[1]/input[1]")
	public WebElement userName;

	@FindBy(xpath = "//body/login-modal[1]/div[1]/div[1]/div[3]/sec-form[1]/sec-view[2]/div[1]/input[1]")
	public WebElement password;

	@FindBy(css = "#sign_in_btnundefined")
	public WebElement signin;

	@FindBy(xpath = "//div[@id='miceImg']")
	public WebElement mice;

	@FindBy(xpath = "//img[@id='28']")
	public WebElement hpz3200WirelessMouse;

	@FindBy(xpath = "//header/nav[1]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement loggedInUserName;

	@FindBy(xpath = "//span[@class='shop_now roboto-bold ng-binding']")
	public List<WebElement> menuOptions;

	public void login(String userNameStr, String passwordStr) {
		BrowserUtils.waitFor(8);
		BrowserUtils.waitForClickablility(userLogo, 10);
		userLogo.click();
		BrowserUtils.waitFor(4);
		userName.sendKeys(userNameStr);
		password.sendKeys(passwordStr);
		BrowserUtils.waitForClickablility(signin, 10);
		signin.click();

	}

	public void navigateHPZ3200_WIRELESSMOUSE() {
		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(mice, 10);
		BrowserUtils.clickWithJS(mice);
		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(hpz3200WirelessMouse, 10);
		BrowserUtils.clickWithJS(hpz3200WirelessMouse);

	}

	public String verifyLoggedInUserName() {
		BrowserUtils.waitFor(4);
		return loggedInUserName.getText();

	}

	public void navigateToModule(String navigate) {
		WebElement module = Driver.get().findElement(By.xpath("//span[text()='" + navigate + "']"));
		module.click();
	}

}
