package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage05 {
	
public static WebDriver driver;
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finish;

	public PomPage05(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFinish() {
		return finish;
	}

	

}
