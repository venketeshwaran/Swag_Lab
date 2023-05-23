package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement addToCartIcon;

	public PomPage02(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getAddToCartIcon() {
		return addToCartIcon;
	}
	
	

}
