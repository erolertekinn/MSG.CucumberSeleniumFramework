package com.msg.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.msg.utilities.BrowserUtils;

public class HPZ3200WirelessMousePage extends BasePage {
	@FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
	public WebElement addToCart;

	@FindBy(xpath = "//div[@class = 'plus']")
	public WebElement plus;

	@FindBy(xpath = "//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[2]")
	public WebElement redButton;

	@FindBy(xpath = "//body/div[3]/section[1]/article[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[3]")
	public WebElement whiteButton;

	@FindBy(xpath = "//*[@id='menuCart']")
	public WebElement shoppingCart;

	@FindBy(xpath = "//button[@id='checkOutButton']")
	public WebElement checkOutButton;

	@FindBy(xpath = "//button[@id='next_btn']")
	public WebElement nextButton;

	@FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[1]/div[2]/tool-tip-cart[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/p[1]")
	public WebElement redMausPrice;

	@FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[1]/div[2]/tool-tip-cart[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/p[1]")
	public WebElement whiteMausPrice;

	@FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[1]/div[2]/tool-tip-cart[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]/label[1]")
	public WebElement redMausQuantity;

	@FindBy(xpath = "//body[1]/div[3]/section[1]/article[1]/div[1]/div[2]/tool-tip-cart[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]/label[1]")
	public WebElement whiteMausQuantity;

	@FindBy(xpath = "//span[@id='shippingCost']")
	public WebElement shippingCost;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/section[1]/article[1]/div[1]/div[2]/div[2]/label[2]/span[1]")
	public WebElement totalCost;
	
	//span[contains(text(),'$269.97')]
	public void addToCart() {
		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(whiteButton, 10);
		whiteButton.click();
		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(addToCart, 10);
		addToCart.click();

		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(redButton, 10);
		redButton.click();

		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(plus, 10);
		plus.click();

		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(addToCart, 10);
		addToCart.click();

	}

	public void paymentProcess() {
		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(shoppingCart, 10);
		shoppingCart.click();

		BrowserUtils.waitFor(2);
		BrowserUtils.waitForClickablility(checkOutButton, 10);
		checkOutButton.click();

	}

	public double getRedMausPrice() {
		BrowserUtils.waitFor(2);
		String str1 = redMausPrice.getText();
		String subStr1 = str1.substring(1);
		//System.out.println("Actual Red Maus Price : " + subStr1);
		double redMausPrice = Double.parseDouble(subStr1);
		return redMausPrice;

	}

	public double getWhiteMausPrice() {
		BrowserUtils.waitFor(2);
		String str2 = whiteMausPrice.getText();
		String subStr2 = str2.substring(1);
		//System.out.println("Actual White Maus Price : " + subStr2);
		double whiteMausPrice = Double.parseDouble(subStr2);
		return whiteMausPrice;

	}

	public int getRedMausNumber() {
		BrowserUtils.waitFor(2);
		String str1 = redMausQuantity.getText();
		String subStr1 = str1.substring(5);
		//System.out.println("Actual Red Maus Quantity : " + subStr1);
		int redMausQuantity = Integer.parseInt(subStr1);
		return redMausQuantity;

	}

	public int getWhiteMausNumber() {
		BrowserUtils.waitFor(2);
		String str2 = whiteMausQuantity.getText();
		String subStr2 = str2.substring(5);
		//System.out.println("Actual White Maus Quantity : " + subStr2);
		int whiteMausQuantity = Integer.parseInt(subStr2);
		return whiteMausQuantity;

	}

	public double getshippingCost() {
		BrowserUtils.waitFor(5);
		String str2 = shippingCost.getText();
		String subStr2 = str2.substring(1);
		//System.out.println("Actual Shipping Cost : " + subStr2);
		double shippingCost = Double.parseDouble(subStr2);
		return shippingCost;

	}
	public double getTotalCost() {
		BrowserUtils.waitFor(2);
		String str2 = totalCost.getText();
		String subStr2 = str2.substring(1);
		//System.out.println("Actual Total Cost1 : " + subStr2);
		double total_Cost = Double.parseDouble(subStr2);
		return total_Cost;

	}
	

}