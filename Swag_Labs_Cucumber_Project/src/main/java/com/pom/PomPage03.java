package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {
	
	
	public static WebDriver driver;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkOut;

	public PomPage03(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	
}
